package com.example.administrator.notificationtet;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_sendNotice)
    Button btnSendNotice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_sendNotice)
    public void onClick() {
        NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);


        Notification notification = new Notification.Builder(this).setContentTitle("小熊").setContentText("安妮的小熊去哪里了呢").setSmallIcon(R.mipmap.ic_launcher).build();
        manager.notify(R.mipmap.ic_launcher,notification);

    }
}
