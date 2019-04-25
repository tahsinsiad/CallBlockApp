package com.example.siad.callblockapp;

/**
 * Created by Siad on 4/28/2018.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;



/**
 * Created by Siad on 4/28/2018.
 */

public class OutGoingCallBlock extends BroadcastReceiver {
    public int check =200;
    @Override
    public void onReceive(Context context, Intent intent) {

        Bundle bundle = intent.getExtras();

        if (null == bundle)
            return;

        else if (check > 100) {

            String phonenumber = intent.getStringExtra(Intent.EXTRA_PHONE_NUMBER);

            setResultData(null);

            Log.i("OutgoingCallReceiver", phonenumber);
            Log.i("OutgoingCallReceiver", bundle.toString());

            String info = "Detect Calls sample application\nOutgoing number: " + phonenumber;

            Toast.makeText(context, info, Toast.LENGTH_LONG).show();

        }
    }
}
