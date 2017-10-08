package com.hoperun.statan.websocket;

import java.net.URI;

import javax.websocket.ClientEndpoint;
import javax.websocket.ContainerProvider;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;

@ClientEndpoint
public class ClientWebsocket {
	Session session = null;

	public ClientWebsocket() {
		super();
		WebSocketContainer container = ContainerProvider.getWebSocketContainer();
		try {
			container.connectToServer(this, new URI("ws://localhost:9090/struts2/aa"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@OnOpen
	public void onOpen(Session session) {
		this.session = session;

	}

	@OnClose
	public void onClose() {
		System.out.println("java client关闭了连接！");
		this.session = null;

	}

	@OnMessage
	public void onMessage(String message, Session session) {

		System.out.println("收到广播了" + message);

	}

	@OnError
	public void onError(Throwable e) {
		e.printStackTrace();
		System.out.println("java client遇到了错误！");

	}

	public void sendMessage(String message) {
		this.session.getAsyncRemote().sendText(message);
	}
}
