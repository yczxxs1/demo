package com.hoperun.statan.websocket;


public class Test {
	public static void main(String[] args) {
		try {
			ClientWebsocket clientEndPoint = new ClientWebsocket();
			clientEndPoint.sendMessage("java client message");
		//	clientEndPoint.onClose();
			//Thread.sleep(30000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
