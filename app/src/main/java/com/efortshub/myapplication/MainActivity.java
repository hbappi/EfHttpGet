package com.efortshub.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.efortshub.efhttpget.EfHttpGet;
import com.efortshub.efhttpget.EfResponseListener;

public class MainActivity extends AppCompatActivity {
    TextView tv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);

        String url = "https://raw.githubusercontent.com/hbappi/HolyQuranJson/main/quran/languages.json";

        EfHttpGet.stringResponse(url, new EfResponseListener() {
            @Override
            public void onSuccess(String response) {
                tv.setText(response);
            }

            @Override
            public void onError(String errorResponse) {
                tv.setText(errorResponse);
            }
        });



    }
}