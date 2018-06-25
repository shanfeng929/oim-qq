package com.startup;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
//import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.core.RabbitAdmin;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.im.server.general.ServerInfo;
import com.im.task.FanoutMessageConsumer;
import com.im.task.TopicMessageConsumer;
import com.onlyxiahui.common.util.OnlyAddressUtil;
import com.onlyxiahui.common.util.OnlyPropertiesUtil;

/**
 * @Author: XiaHui
 * @Date: 2015年12月17日
 * @ModifyUser: XiaHui
 * @ModifyDate: 2015年12月17日
 */
@Configuration
// @PropertySource({ "classpath:config/rabbit.properties" })
@PropertySource({"file:config/setting/mq.properties"})
public class MessageQueueConfig {

    @Autowired
    private Environment environment;

    @Bean
    public ServerInfo serverInfo() {
        String key = "server.config.im.tcp.port";
        String tcpPortValue = OnlyPropertiesUtil.getProperty("config/setting/config.properties", key);

        String mac = OnlyAddressUtil.getMacAddress();
        String id = mac + "," + tcpPortValue;
        
        ServerInfo bean = new ServerInfo();
        bean.setId(id);
        return bean;
    }

    // //////////////////////////////////////////
    @Bean
    public ConnectionFactory rabbitConnectionFactory() {
        CachingConnectionFactory connectionFactory = new CachingConnectionFactory();
        connectionFactory.setHost(environment.getProperty("rabbit.conn.hostname"));
        connectionFactory.setPort(environment.getProperty("rabbit.conn.port", Integer.class));
        connectionFactory.setVirtualHost(environment.getProperty("rabbit.conn.virtual.host"));
        connectionFactory.setUsername(environment.getProperty("rabbit.conn.username"));
        connectionFactory.setPassword(environment.getProperty("rabbit.conn.password"));
        connectionFactory.setChannelCacheSize(environment.getProperty("rabbit.channel.cache.size", Integer.class));
        // connectionFactory.setUsername("only");
        // connectionFactory.setPassword("123456");

        // 声明交换器并绑定队列
        /** 分发模式 **/
        // TopicExchange logExchange = new TopicExchange("trade.log.exchange",
        // false, true);
        /**
         * 广播模式
         */
        // FanoutExchange registerFanoutExchange = new
        // FanoutExchange("user.register.exchange", true, true);
        return connectionFactory;
    }

    /////////////////////////////////////////

    @Bean
    public Queue topicMessageQueue() {
        ServerInfo info = serverInfo();
        Queue queue = new Queue(info.getId(), true, false, true);
        return queue;
    }

    @Bean
    public TopicExchange topicMessageExchange() {
        TopicExchange exchange = new TopicExchange("oim.server.topic.message.exchange", true, true);
        return exchange;
    }

    @Bean
    public RabbitAdmin messageRabbitAdmin() {
        ServerInfo info = serverInfo();
        RabbitAdmin rabbitAdmin = new RabbitAdmin(rabbitConnectionFactory());
        rabbitAdmin.declareQueue(topicMessageQueue());
        rabbitAdmin.declareExchange(topicMessageExchange());
        rabbitAdmin.declareBinding(BindingBuilder.bind(topicMessageQueue()).to(topicMessageExchange()).with(info.getId()));
        return rabbitAdmin;
    }

    @Bean
    public SimpleMessageListenerContainer topicMessageListenerContainer() {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(rabbitConnectionFactory());
        container.setMessageListener(topicMessageListenerAdapter());
        container.addQueues(topicMessageQueue());
        container.start();
        return container;
    }

    @Bean
    public MessageListenerAdapter topicMessageListenerAdapter() {
        MessageListenerAdapter adapter = new MessageListenerAdapter(topicMessageConsumer());
        return adapter;
    }

    @Bean
    public MessageListener topicMessageConsumer() {
        TopicMessageConsumer consumer = (new TopicMessageConsumer());
        return consumer;
    }
    /////////////////////////////////////////



    @Bean
    public Queue fanoutMessageQueue() {
        Queue queue = new Queue("oim.server.fanout.message.queue", true, false, true);
        return queue;
    }

    @Bean
    public FanoutExchange fanoutMessageExchange() {
        FanoutExchange exchange = new FanoutExchange("oim.server.fanout.message.exchange", true, true);
        return exchange;
    }

    @Bean
    public Binding fanoutBinding() {
        Binding binding=BindingBuilder.bind(fanoutMessageQueue()).to(fanoutMessageExchange());
        return binding;
    }

    @Bean
    public SimpleMessageListenerContainer fanoutMessageListenerContainer() {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(rabbitConnectionFactory());
        container.setMessageListener(fanoutMessageListenerAdapter());
        container.addQueues(fanoutMessageQueue());
        container.start();
        return container;
    }

    @Bean
    public MessageListenerAdapter fanoutMessageListenerAdapter() {
        MessageListenerAdapter adapter = new MessageListenerAdapter(fanoutMessageConsumer());
        return adapter;
    }

    @Bean
    public ChannelAwareMessageListener fanoutMessageConsumer() {
        FanoutMessageConsumer consumer = (new FanoutMessageConsumer());
        return consumer;
    }




    //	@Bean
//	public ChannelAwareMessageListener messageConsumer() {
//		MessageConsumer consumer = (new MessageConsumer());
//		return consumer;
//	}
    @Bean
    public RabbitTemplate messageRabbitTemplate() {
        RabbitTemplate bean = new RabbitTemplate();
        bean.setConnectionFactory(rabbitConnectionFactory());
//		bean.setExchange("oim.server.message.exchange");
//		bean.setRoutingKey("oim.server.message.exchange");
        return bean;
    }
}
