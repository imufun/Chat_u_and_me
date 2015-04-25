package com.imufun.imran.chatume.interfaces;

import com.imufun.imran.chatume.typeof.InfoOFFriend;
import com.imufun.imran.chatume.typeof.InfoOfMessage;

/**
 * Created by imran on 4/25/15.
 */
public interface Updater {

    public void updatedata(InfoOfMessage[] messages, InfoOFFriend[] friends, InfoOFFriend[] unApprovedFriends, String userkey);
}


