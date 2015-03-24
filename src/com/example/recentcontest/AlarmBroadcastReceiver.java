package com.example.recentcontest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * �������д��������Ѵ���,���Լ���notification����������
 * 
 * @author Vana
 * 
 */
public class AlarmBroadcastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		if (intent.getAction().equals("Action.Alarm")) {
			Log.i("cat","naozhong xiang le");
			Toast.makeText(context, "�������а��Сʱ�Ϳ�ʼ��", 5000).show();
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			intent.setClass(context, ReallyNoti.class);
			context.startActivity(intent);
		}
	}

}
