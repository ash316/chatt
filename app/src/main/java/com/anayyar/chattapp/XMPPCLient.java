package com.anayyar.chattapp;

import android.util.Log;

import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterEntry;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;

import java.io.IOException;
import java.util.Set;

/**
 * Created by Ashish on 4/11/2015.
 */
public class XMPPCLient {

    private XMPPTCPConnection connection = null;

    public XMPPCLient(String user) {
        connect(user);
    }
    private void connect(final String user) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                XMPPTCPConnectionConfiguration.Builder connectionBuilder = XMPPTCPConnectionConfiguration.builder();
                connectionBuilder.setHost("192.168.1.8")
                        .setSecurityMode(ConnectionConfiguration.SecurityMode.disabled)
                        .setServiceName("ashish-pc")
                        .setPort(5222)
                        .setConnectTimeout(50000)
                        .setDebuggerEnabled(true)
                        .setUsernameAndPassword(user, user);

                connection = new XMPPTCPConnection(connectionBuilder.build());

                try {
                    connection.setPacketReplyTimeout(50000);
                    connection.connect();
                    Log.i("XMPP_CLIENT", "Successfully Connected to Google");
                    connection.login();
                    Log.i("XMPP_CLIENT", "Successfully Login to Google");


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public String getRooster() {

        String name ="";
        Roster roster = Roster.getInstanceFor(connection);
        Set<RosterEntry> all = roster.getEntries();
        for(RosterEntry r:all) {
            name = r.getName();
        }
        return name;
    }
}
