package com.giovanni.example.textviewupdate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnGET;
    private TextView tvMsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMsg = (TextView) findViewById(R.id.tvMessage);
        tvMsg.setText("11111111");
        btnGET = (Button) findViewById(R.id.btnSendGet);
        btnGET.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        tvMsg.setText("aaaaaaaaa");
                    }
                }, 3000);
            }
        });
        findViewById(R.id.btnAppend).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                new Handler().post(new Runnable() {
                    @Override
                    public void run() {
                        tvMsg.append("0");
                    }
                });
            }
        });
    }
}