package com.imufun.imran.chatume.interfaces;

/**
 * Created by imran on 4/25/15.
 */
public interface Socket {
    public String sendHTTPRequest(String Params);
    public int startListeningPort(int Port);

    public void stopListening();
    public void exit();
}
