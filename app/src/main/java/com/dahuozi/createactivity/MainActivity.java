package com.dahuozi.createactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
    /*
    * 通过log日志的打印
    * */
public class MainActivity extends AppCompatActivity {
    //表示Activity被创建时回调的方法
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("tag","---MainActivity---------onCreated()----------");
    }
    //当Activity能够被用户看见时回调的方法
    protected void onStart(){
        super.onStart();
        Log.i("tag","---MainActivity---------onStart()----------");
    }
    //当Activity获取焦点时回调的方法 能与用户交互时
    protected  void onResume(){
        super.onResume();
        Log.i("tag","---MainActivity---------onResume()----------");
    }//当Activity失去用户焦点时的方法
    protected  void onPause(){
        super.onPause();
        Log.i("tag","---MainActivity---------onPause()----------");
    }
    //当Activity被完全遮挡时
    protected void onStop(){
        super.onStop();
        Log.i("tag","---MainActivity---------onStop()----------");
    }
    //当activity处于停止状态重新被启动的回掉的方法
    protected void onRestart(){
        super.onRestart();
        Log.i("tag","---MainActivity---------onRestart()----------");
    }
    //当activity被销毁时回调方法
    protected void onDestroy(){
        super.onDestroy();
        Log.i("tag","---MainActivity---------onDestroy()----------");
    }
    public void click(View view)
    {
        //点击按钮启动OtherActivity
       Toast.makeText(MainActivity.this,"收到button按钮",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,OtherActivity.class);//通过意图对象描述启动的Activity
        startActivity(intent);
    }

}
