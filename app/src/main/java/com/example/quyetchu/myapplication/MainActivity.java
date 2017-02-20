package com.example.quyetchu.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Hi,Quyet", Toast.LENGTH_SHORT).show();
        test();

    }

    public void test(){
        Log.i("MainActivity","log hi");
    }


}
