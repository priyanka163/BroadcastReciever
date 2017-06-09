package com.example.next.broadcastreceiver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void broadcastCustomIntent(View view){
        Intent intent= new Intent("myCustomIntent");
        editText= (EditText) findViewById(R.id.extraIntent);
        //String s=editText.getText().toString();
        intent.putExtra("message", (CharSequence)editText.getText().toString());

        intent.setAction("com.javacodegeeks.android.A_CUSTOM_INTENT");

        sendBroadcast(intent);


    }
}
