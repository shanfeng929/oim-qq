package com.im.server.general.business.push;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.im.base.common.util.KeyUtil;
import com.im.server.bridge.net.WriteHandler;
import com.onlyxiahui.common.message.Head;
import com.onlyxiahui.common.message.push.PushMessage;
import com.onlyxiahui.im.message.data.user.UserData;
import com.onlyxiahui.net.session.SocketSession;

@Service
public class PersonalPush {

	@Resource
	WriteHandler writeHandler;

	/**
	 * 个人信息更新
	 * @param key
	 * @param user
	 * @param userId
	 */
    public void updateUser(String key, UserData user, String userId) {
        Head head = new Head();
        head.setAction("1.100");
        head.setMethod("1.2.0008");
        head.setKey(key);
        head.setTime(System.currentTimeMillis());
        PushMessage message = new PushMessage();
        message.setHead(head);
        message.put("userData", user);
        writeHandler.push(userId, message);
    }

    /**
     * 推送其他客户端登陆信息
     *
     * @param set
     * @param offline
     * @param client
     */
    public void pushOtherOnline(CopyOnWriteArraySet<SocketSession> set, Map<String, Object> client, boolean offline) {

        PushMessage message = new PushMessage();
        message.put("client", client);
        message.put("offline", offline);// 当前设备是否下线：true：下线 false:不用下线

        Head head = new Head();
        head.setAction("1.100");
        head.setMethod("1.2.0001");
        head.setKey(KeyUtil.getKey());
        head.setTime(System.currentTimeMillis());
        message.setHead(head);

        for (SocketSession ss : set) {
            try {
                ss.write(message);
            } catch (Exception e) {
            }
        }

        for (SocketSession ss : set) {
            try {
                ss.close();
            } catch (Exception e) {
            }
        }
    }
}
