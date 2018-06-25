package com.im.socket.netty.tcp;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.im.server.handler.MessageHandler;
import com.im.socket.netty.session.ChannelSession;
import com.only.common.spring.util.SpringUtil;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SocketHandler extends SimpleChannelInboundHandler<Object> {
	
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	MessageHandler serverHandler = SpringUtil.getBean(MessageHandler.class);
	ChannelSession channelSession;

	@Override
	protected void channelRead0(ChannelHandlerContext ctx, Object frame) throws Exception {
		if (frame instanceof String) {
			String message = ((String) frame);
			serverHandler.onMessage(message, channelSession);
		}
	}

	@Override
	public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
		channelSession = new ChannelSession(ctx);
		if (logger.isDebugEnabled()) {
			String session = channelSession != null ? (channelSession.getRemoteAddress() + "/" + channelSession.getRemotePort()) : "";
			logger.debug("handlerAdded:" + session);
		}
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		serverHandler.onClose(channelSession);
		if (logger.isDebugEnabled()) {
			String session = channelSession != null ? (channelSession.getRemoteAddress() + "/" + channelSession.getRemotePort()) : "";
			String key = channelSession != null ? (channelSession.getKey()) : "";
			logger.debug("handlerRemoved:" + session + "/" + key);
		}
	}

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("channelActive");
		}
	}

	@Override
	public void channelInactive(ChannelHandlerContext ctx) throws Exception {
		if (logger.isDebugEnabled()) {
			logger.debug("channelInactive");
		}
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		// ctx.close();
	}
}
