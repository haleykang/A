package com.example.user.a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AActivity extends Activity {

    private static final String TAG = "**AActivity**";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_layout);
        Log.v(TAG, "onCreate()");
    }

    public void onClick(View v) {

        Intent intent = new Intent();

        switch (v.getId()) {
            case R.id.button1: {
                intent = new Intent();

                ComponentName componentName = new ComponentName(
                        "com.example.user.b", "com.example.user.b.BActivity");
                intent.setComponent(componentName);

                Log.v(TAG, "intent.setComponent(componentName)");

                SampleData sampleData = new SampleData();
                sampleData.setIntData(28);
                sampleData.setStrData("Parcelabel Object!");

                Log.v(TAG, "sampleData settiing 완료");

                // 데이터 전달 하기
                intent.putExtra("SAMPLE_DATA", sampleData);


                Bundle bundle = new Bundle();
                bundle.putInt("INT_DATA", 1231);
                bundle.putString("STR_DATA", "The hotel has exclusive access to the beach.");

                intent.putExtra("BUNDLE_DATA", bundle);

                Log.v(TAG, "sampleData putExtra()");

                intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);

                startActivity(intent);
                Log.v(TAG, "startActivity(intent)");

            }
            break;

            case R.id.button2: {

                startActivity(new Intent(this, A2Activity.class));
                Log.v(TAG, "내부 A2 액티비티 실행");

            }
            break;

            case R.id.contactBt: {

                Log.v(TAG, "주소록 버튼 클릭");
                intent = new Intent();
                intent.setAction(Intent.ACTION_MAIN);
                Log.v(TAG, "액션 설정 완료");
                intent.addCategory(Intent.CATEGORY_APP_CONTACTS);
                Log.v(TAG, "주소록 카테고리 추가");
                startActivity(intent);
                Log.v(TAG, "주소록 시작");
            }
            break;

            case R.id.naverBt: {
                Log.v(TAG, "네이버 버튼 클릭");
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://m.naver.com"));
                startActivity(intent);
            }
            break;

            case R.id.pathBt: {
                Log.v(TAG, "B앱 버튼 클릭");

               /* intent.setComponent(
                        new ComponentName("com.example.user.b", "com.example.user.b.BActivity"));*/
                /*intent.setAction(Intent.ACTION_MAIN);
                intent.setPackage("com.example.user.b");

                startActivity(intent);*/
                /*intent.setAction("action.ACTION_IMAGE_VIEW");

                Uri imageUri =
                        Uri.parse("http://www.haley.com:80/files/images/mylove.png?name=haley#1");

                intent.setDataAndType(imageUri, "image/png");
                startActivity(intent);
*/
/*
                intent.setAction("action.ACTION_IMAGE_VIEW");
                startActivity(intent);*/


            }
            break;
        } // end of switch


    } // end of onClick()


} // end of class
