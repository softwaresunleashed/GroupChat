package com.unleashed.android.groupchat.constants;

/**
 * Created by gupta on 8/10/2015.
 */
public class Constants {


    public static String APP_NAME_TAG = "GroupChat";


    // Remote server (Chat Server) URL
    public static final String REMOTE_SERVER_IP = "192.168.0.101";
    public static final String REMOTE_SERVER_PORT = "8080";

    public static final String REMOTE_SERVER_URL = "ws://" + REMOTE_SERVER_IP +":"+ REMOTE_SERVER_PORT +"/GroupChatServer/chat?name=";


    // Preference file name.
    public static final String PREFS_NAME = "GroupChatPrefsFile";



}
