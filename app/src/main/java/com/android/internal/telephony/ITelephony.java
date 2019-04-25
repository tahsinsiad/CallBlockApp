package com.android.internal.telephony;

/**
 * Created by Siad on 4/27/2018.
 */

public interface ITelephony {
    boolean endCall();
    void answerRingingCall();
    void silenceRinger();
}
