package com.imufun.imran.chatume.interfaces;

import com.imufun.imran.chatume.typeof.InfoOfFriend;
import com.imufun.imran.chatume.typeof.InfoOfMessage;

/**
 * Created by imran on 4/25/15.
 */
public interface Updater {

    public void updatedata(InfoOfMessage[] messages, InfoOfFriend[] friends, InfoOfFriend[] unApprovedFriends, String userkey);
}


