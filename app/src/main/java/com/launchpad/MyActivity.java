package com.launchpad;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;
import java.util.BitSet;


public class MyActivity extends Activity implements View.OnTouchListener{
    private Button bt1;
    private Button bt2;
    private Button bt3;
    private Button bt4;
    private Button bt5;
    private Button bt6;
    private Button bt7;
    private Button bt8;
    private Button bt9;
    private Button bt10;
    private Button bt11;
    private Button bt12;
    private Button bt13;
    private Button bt14;
    private Button bt15;
    private Button bt16;
    private MediaPlayer player1;
    private MediaPlayer player2;
    private MediaPlayer player3;
    private MediaPlayer player4;
    private MediaPlayer player5;
    private MediaPlayer player6;
    private MediaPlayer player7;
    private MediaPlayer player8;
    private MediaPlayer player9;
    private MediaPlayer player10;
    private MediaPlayer player11;
    private MediaPlayer player12;
    private MediaPlayer player13;
    private MediaPlayer player14;
    private MediaPlayer player15;
    private MediaPlayer player16;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        init();
        bt1.setOnTouchListener(this);
        bt2.setOnTouchListener(this);
        bt3.setOnTouchListener(this);
        bt4.setOnTouchListener(this);
        bt5.setOnTouchListener(this);
        bt6.setOnTouchListener(this);
        bt7.setOnTouchListener(this);
        bt8.setOnTouchListener(this);
        bt9.setOnTouchListener(this);
        bt10.setOnTouchListener(this);
        bt11.setOnTouchListener(this);
        bt12.setOnTouchListener(this);
        bt13.setOnTouchListener(this);
        bt14.setOnTouchListener(this);
        bt15.setOnTouchListener(this);
        bt16.setOnTouchListener(this);


    }

    private void init() {
        bt1= (Button) findViewById(R.id.button1);
        bt2= (Button) findViewById(R.id.button2);
        bt3= (Button) findViewById(R.id.button3);
        bt4= (Button) findViewById(R.id.button4);
        bt5= (Button) findViewById(R.id.button5);
        bt6= (Button) findViewById(R.id.button6);
        bt7= (Button) findViewById(R.id.button7);
        bt8= (Button) findViewById(R.id.button8);
        bt9= (Button) findViewById(R.id.button9);
        bt10= (Button) findViewById(R.id.button10);
        bt11= (Button) findViewById(R.id.button11);
        bt12= (Button) findViewById(R.id.button12);
        bt13= (Button) findViewById(R.id.button13);
        bt14= (Button) findViewById(R.id.button14);
        bt15= (Button) findViewById(R.id.button15);
        bt16= (Button) findViewById(R.id.button16);
        player1 = MediaPlayer.create(MyActivity.this, R.raw.midi01);
        player2 = MediaPlayer.create(MyActivity.this, R.raw.midi02);
        player3 = MediaPlayer.create(MyActivity.this, R.raw.midi03);
        player4 = MediaPlayer.create(MyActivity.this, R.raw.midi04);
        player5 = MediaPlayer.create(MyActivity.this, R.raw.midi05);
        player6 = MediaPlayer.create(MyActivity.this, R.raw.midi06);
        player7 = MediaPlayer.create(MyActivity.this, R.raw.midi07);
        player8 = MediaPlayer.create(MyActivity.this, R.raw.midi08);
        player9 = MediaPlayer.create(MyActivity.this, R.raw.midi09);
        player10 = MediaPlayer.create(MyActivity.this, R.raw.midi10);
        player11 = MediaPlayer.create(MyActivity.this, R.raw.midi11);
        player12 = MediaPlayer.create(MyActivity.this, R.raw.midi12);
        player13 = MediaPlayer.create(MyActivity.this, R.raw.midi13);
        player14 = MediaPlayer.create(MyActivity.this, R.raw.midi14);
        player15 = MediaPlayer.create(MyActivity.this, R.raw.midi15);
        player16 = MediaPlayer.create(MyActivity.this, R.raw.midi16);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }



    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {

        switch (view.getId()){
            case R.id.button1:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){


                    player13.seekTo(0);
                    player13.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player13.stop();

                    try {
                        player13.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }



                }


                break;
            case R.id.button2:

                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player9.seekTo(0);
                    player9.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player9.stop();
                    try {
                        player9.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button3:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player5.seekTo(0);
                    player5.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player5.stop();
                    try {
                        player5.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button4:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player1.seekTo(0);
                    player1.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player1.stop();
                    try {
                        player1.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button5:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player14.seekTo(0);
                    player14.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player14.stop();
                    try {
                        player14.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button6:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player10.seekTo(0);
                    player10.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player10.stop();
                    try {
                        player10.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button7:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player6.seekTo(0);
                    player6.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player6.stop();
                    try {
                        player6.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button8:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player2.seekTo(0);
                    player2.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player2.stop();
                    try {
                        player2.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button9:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player15.seekTo(0);
                    player15.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player15.stop();
                    try {
                        player15.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button10:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player11.seekTo(0);
                    player11.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player11.stop();
                    try {
                        player11.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button11:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player7.seekTo(0);
                    player7.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player7.stop();
                    try {
                        player7.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button12:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player3.seekTo(0);
                    player3.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player3.stop();
                    try {
                        player3.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button13:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player16.seekTo(0);
                    player16.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player16.stop();
                    try {
                        player16.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button14:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player12.seekTo(0);
                    player12.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player12.stop();
                    try {
                        player12.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button15:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player8.seekTo(0);
                    player8.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player8.stop();
                    try {
                        player8.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;
            case R.id.button16:
                if(motionEvent.getAction() == KeyEvent.ACTION_DOWN){

                    player4.seekTo(0);
                    player4.start();

                }
                //当松手后，更改标志位，结束加法运算
                else if(motionEvent.getAction() == KeyEvent.ACTION_UP) {

                    player4.stop();
                    try {
                        player4.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


                }
                break;

        }
        return false;
    }
}
