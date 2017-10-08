package com.hoperun.statan.websocket;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.websocket.EncodeException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint(value="/aa")
public class ServerWebsocket {
	 
	 private static Set<Session> peers=Collections.synchronizedSet(new HashSet<Session>());
	 


	@OnMessage
	public void onMessage(String message) throws IOException, InterruptedException, EncodeException {
        for(Session peer:peers){
        	peer.getBasicRemote().sendText(message);
        }
	}

	@OnOpen
	public void onOpen(Session peer) {
		peers.add(peer);
		System.out.println("Client connected");
	}

	@OnClose
	public void onClose(Session peer) {
	   peers.remove(peer);
		System.out.println("Connection closed");
	}
	

	@OnError
	public void onError(Throwable t) {
		t.printStackTrace();
		System.out.println("Connection error");

	}

}
