package com.imufun.imran.chatume.interfaces;

import java.io.UnsupportedEncodingException;

/**
 * Created by imran on 4/25/15.
 */
public interface Manerger {

    public String getUsername();
    public String sendMessage(String username,String toUsername,String message)throws UnsupportedEncodingException;
    public String authenticateUser(String usernameText,String passwordText)throws UnsupportedEncodingException;
    public void messageReceived(String username,String message);


    public boolean isNetworkConnected();
    public boolean isUserAuthenticated();
    public String getLastRawFriendList();
    public void exit();


    public String signUpUser(String usernameText, String passwordText,String email);
    public String addFriendRequest(String friendUsername);
    public String sendFriendsReqsResponse(String approvedFriendsNames,String discardedFriendNames);
}
