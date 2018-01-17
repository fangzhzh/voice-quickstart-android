package com.twilio.voice.quickstart;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

import com.twilio.voice.CallInvite;

import static com.twilio.voice.quickstart.VoiceActivity.INCOMING_CALL_INVITE;

public class CallService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        CallInvite callInvite = intent.getParcelableExtra(INCOMING_CALL_INVITE);
        Log.d("CallService",  "extra " + intent.getExtras() + callInvite.toString());
        return Service.START_NOT_STICKY;

    }
}
