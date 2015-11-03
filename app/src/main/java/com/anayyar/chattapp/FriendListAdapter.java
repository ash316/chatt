package com.anayyar.chattapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Ashish on 3/11/2015.
 */
public class FriendListAdapter extends ArrayAdapter<FriendDetails> {

    private final Context context;
    private final FriendDetails[] values;

    public FriendListAdapter(Context context, FriendDetails[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.chat_list_view, parent, false);
        TextView textView = (TextView) rowView.findViewById(R.id.firstLine);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView presence = (TextView) rowView.findViewById(R.id.secondLine);

        textView.setText(values[position].getName());
        presence.setText(values[position].getPresence());

        imageView.setImageResource(R.drawable.ic_profile);


        return rowView;
    }
}
