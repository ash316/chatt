package com.anayyar.chattapp;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by Ashish on 3/11/2015.
 */
public class ChatListView extends ListActivity {
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        FriendDetails[] values = new FriendDetails[] {
                new FriendDetails("", "Ashish","Available"),
                new FriendDetails("", "Parul","Away"),
                new FriendDetails("", "Bhanu","Inactive"),
                new FriendDetails("", "Sumit","Available"),
                new FriendDetails("", "Parag","Offline"),
                new FriendDetails("", "Kunal","Available")

        };
        ArrayAdapter adapter = new FriendListAdapter(this, values);
        setListAdapter(adapter);

    }
}
