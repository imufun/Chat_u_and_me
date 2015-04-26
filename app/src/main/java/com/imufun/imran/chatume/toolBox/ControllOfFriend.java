package com.imufun.imran.chatume.toolBox;

import com.imufun.imran.chatume.typeof.InfoOfFriend;

/**
 * Created by imran on 4/25/15.
 */
public class ControllOfFriend {

    public static InfoOfFriend[] friendsInfo = null;
    public static InfoOfFriend[] unapprovedFriends = null;
    public String activeFriends;


    public static void setFriendsInfo(InfoOfFriend[] friends) {
        ControllOfFriend.friendsInfo = friends;
    }

    public static InfoOfFriend checkFriends(String username, String userkey) {

        InfoOfFriend result = null;
        if (friendsInfo != null) {
            for (int i = 0; i < friendsInfo.length; i++) {
                if (friendsInfo[i].UserName.equals(username) && friendsInfo[i].User_key.equals(userkey)) {
                    result = friendsInfo[i];
                }
            }
        }

        return result;
    }

    public static InfoOfFriend getFriendInfo(String username) {

        InfoOfFriend result = null;
        if (friendsInfo != null) {
            for (int i = 0; i < friendsInfo.length; i++) {
                if (friendsInfo[i].UserName.equals(username)) {
                    result = friendsInfo[i];
                }
            }
        }

        return result;

    }
}
