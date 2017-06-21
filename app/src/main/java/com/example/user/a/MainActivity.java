package com.example.user.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyClick(View v) {
        switch (v.getId()) {
            case R.id.ex1:
                startActivity(new Intent(this, AActivity.class));
                break;
        }
    }
}
