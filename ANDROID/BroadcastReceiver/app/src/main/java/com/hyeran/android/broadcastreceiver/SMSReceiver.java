package com.hyeran.android.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;

public class SMSReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) { // intent로 메세지 종류 날아옴
        // if문을 사용하는 이유: 어떤 broadcast message냐에 따라서 분기
        if(Telephony.Sms.Intents.SMS_RECEIVED_ACTION.equals(intent.getAction())) {
            String msg = "";
            // kitkat 이상 버전에서 처리
            if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                // 1. SmsMessage 배열을 함수로 꺼낸다.
                SmsMessage smss[] = Telephony.Sms.Intents.getMessagesFromIntent(intent);
                for(SmsMessage sms : smss) {
                    msg += sms.getMessageBody();
                }
            } else {
                // 1. intent를 통해 넘어온 데이터를 꺼낸다.
                Bundle bundle = intent.getExtras();
                Object objects[] = (Object[]) bundle.get("pdus");
                // 2. 꺼낸 Object형의 데이터를 SmsMessage 객체로 변환
                SmsMessage smss[] = new SmsMessage[objects.length];
                // 3. SmsMessage를 반복문을 통해서 꺼내고 결과 변수에 담는다.
                for (int i = 0; i < objects.length; i++) {
                    byte smsMsg[] = (byte[]) objects[i];
                    smss[i] = SmsMessage.createFromPdu(smsMsg);
                    msg += smss[i].getMessageBody();
                }
            }
            System.out.println("SMS:"+"msg="+msg);
        }
    }
}
