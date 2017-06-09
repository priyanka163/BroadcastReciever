package com.example.next.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by next on 7/3/17.
 */
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        CharSequence intentData=intent.getCharSequenceExtra("message");
        Toast.makeText(context, "Javacodegeeks received the Intent's message: "+intentData, Toast.LENGTH_LONG).show();
    }

}
