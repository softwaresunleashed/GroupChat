package com.unleashed.android.groupchat.chat.sockets.async.http.socketio;

public interface ConnectCallback {
    public void onConnectCompleted(Exception ex, SocketIOClient client);
}