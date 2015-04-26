package com.imufun.imran.chatume.toolBox;

import android.util.Log;

import com.imufun.imran.chatume.interfaces.Updater;
import com.imufun.imran.chatume.typeof.InfoOfFriend;
import com.imufun.imran.chatume.typeof.InfoOfMessage;

import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.Vector;

/**
 * Created by imran on 4/26/15.
 */
public class ParseXML extends DefaultHandler {

    public String userkey = new String();

    public Updater updater;


    public ParseXML(Updater updater) {
        this.updater = updater;
    }


    public Vector<InfoOfFriend> mFriends = new Vector<InfoOfFriend>();
    public Vector<InfoOfFriend> mOnlieFriends = new Vector<InfoOfFriend>();
    public Vector<InfoOfFriend> mUnapprovedFriends = new Vector<InfoOfFriend>();

    public Vector<Updater> mUnreadMessage = new Vector<Updater>();


    public void endDocument() throws SAXException {

        InfoOfFriend[] friends = new InfoOfFriend[mFriends.size() + mOnlieFriends.size()];
        Updater[] messages = new Updater[mUnreadMessage.size()];


        //Online Friend Method
        int onlineFriendCount = mOnlieFriends.size();

        for (int i = 0; i < onlineFriendCount; i++) {
            friends[i] = mOnlieFriends.get(i);
        }

        //Offline friend Method
        int offLineFriendCount = mFriends.size();
        for (int i = 0; i < offLineFriendCount; i++) {
            friends[i + offLineFriendCount] = mFriends.get(i);
        }


        // Unapprove Friend Request Method
        int unApprovedFriendCount = mUnapprovedFriends.size();
        InfoOfFriend[] unapprovedFriends = new InfoOfFriend[unApprovedFriendCount];

        for (int i = 0; i < unapprovedFriends.length; i++) {
            unapprovedFriends[i] = mUnapprovedFriends.get(i);

        }
        //Unread Message Method

        int unreadMessageCount = mUnreadMessage.size();
        for (int i = 0; i < unreadMessageCount; i++) {
            messages[i] = mUnreadMessage.get(i);
            Log.i("MessageLog", "i=+i");
        }


        this.updater.updatedata((InfoOfMessage[]) messages, friends, unapprovedFriends, userkey);
        super.endDocument();


    }
}
