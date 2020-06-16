package com.example.a96653.LetsCode;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class thirdlevel_10 extends AppCompatActivity {
    ImageView next ,prevoius;
    MySQLliteHelper mySqliteOpenHelper;
    MediaPlayer thirdlevel_10;
    voice voice10_thirdlevel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdlevel_10);
        mySqliteOpenHelper=new MySQLliteHelper(this);

        //create MediaPLayer to play the voice
        thirdlevel_10= MediaPlayer.create(thirdlevel_10.this,R.raw.thirdlevel_10);
        voice10_thirdlevel=new voice( thirdlevel_10);
        voice10_thirdlevel.play();


        //TO VIEW SCORE ON BOX
        TextView textView = (TextView)findViewById(R.id.scoreBox_thirdlevel_10);
        textView.setText(mySqliteOpenHelper.getChildScore()+"" );




        //NEXT BUTTON
        next = (ImageView)findViewById(R.id.next_thirdlevel_10);
      next.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){
                        openSecondActivity();
                        SharedPreferences prefs = getSharedPreferences("pref_thirdLevel_10", MODE_PRIVATE);
                        boolean firstStart = prefs.getBoolean("firstStart", true);
                        if (firstStart){
                            mySqliteOpenHelper.UpdateNumOfLesson(39,"Saturn");
                            SharedPreferences pref = getSharedPreferences("pref_thirdLevel_10", MODE_PRIVATE);
                            SharedPreferences.Editor editor = prefs.edit();
                            editor.putBoolean("firstStart", false);
                            editor.apply();}
                    }//end onClick

                }//end onClickListner

        );
      //PREVIOUS BUTTON
        prevoius = (ImageView)findViewById(R.id.previous_thirslevel_10);
        prevoius.setOnClickListener(
                new ImageView.OnClickListener(){
                    public void onClick(View v){
                         openPreviousActivity();
                    }

                }

        );


    }

    public void openSecondActivity(){
        Intent intent=new Intent(this,thirdlevel_11.class);
        startActivity(intent);

    }

    public void openPreviousActivity(){

        Intent intent=new Intent(this,thirdlevel_9.class);
        startActivity(intent);

    }

    public void btnHome(View view) {

        Intent HomePage=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(HomePage);

    }
    @Override
    protected void onPause() {
        super.onPause();
        voice10_thirdlevel.pause();
    }

    public void play(View view) {
        voice10_thirdlevel.play();
    }//end play method
}
