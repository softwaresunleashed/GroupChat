package com.unleashed.android.groupchat.chat.sockets.async.http.socketio;

import org.json.JSONArray;

public interface Acknowledge {
    void acknowledge(JSONArray arguments);
}
