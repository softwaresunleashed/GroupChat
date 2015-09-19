package com.unleashed.android.groupchat.chat.sockets.async.http.socketio;

import org.json.JSONObject;

public interface JSONCallback {
    public void onJSON(JSONObject json, Acknowledge acknowledge);
}
    
