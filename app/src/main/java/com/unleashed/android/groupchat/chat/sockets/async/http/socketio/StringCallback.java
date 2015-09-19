package com.unleashed.android.groupchat.chat.sockets.async.http.socketio;

public interface StringCallback {
    public void onString(String string, Acknowledge acknowledge);
}