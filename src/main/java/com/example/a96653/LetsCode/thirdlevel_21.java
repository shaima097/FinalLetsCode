package com.example.a96653.LetsCode;

import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

public class thirdlevel_21 extends AppCompatActivity {
    MySQLliteHelper mySqliteOpenHelper;
    Dialog myDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdlevel_21);

        mySqliteOpenHelper=new MySQLliteHelper(this);

        TextView scoreBox=(TextView )findViewById(R.id.scorebox);


        scoreBox.setText( mySqliteOpenHelper.getChildScore()+"");

        ImageButton home=(ImageButton)findViewById(R.id.homebtn);

        home.setOnClickListener( new ImageButton.OnClickListener(){

            @Override
            public void onClick(View v) {
                startActivity(new Intent(thirdlevel_21.this,MainActivity.class));

            }
        });

        ImageView help1=(ImageView)findViewById(R.id.help1);
        help1.setOnClickListener( new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {

                ShowPopup();

            }
        });

        ImageView help2=(ImageView)findViewById(R.id.help2);

        help2.setOnClickListener( new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {

                ShowPopup();

            }
        });




        final RadioButton radio2 = ( RadioButton) findViewById(R.id.radio2);
        final   RadioButton radio3 = ( RadioButton) findViewById(R.id.radio3);
        final   RadioButton radio4 = ( RadioButton) findViewById(R.id.radio4);
        final RadioButton radio1 = ( RadioButton) findViewById(R.id.radio1);

        radio1.setOnClickListener(new RadioButton.OnClickListener(){

                                      public void onClick(View v){

                                          radio1.setChecked(true);
                                          radio2.setChecked(false);
                                          radio3.setChecked(false);
                                          radio4.setChecked(false);

                                      }
                                  }

        );


        radio2.setOnClickListener(new RadioButton.OnClickListener(){

                                      public void onClick(View v){

                                          radio2.setChecked(true);
                                          radio1.setChecked(false);
                                          radio4.setChecked(false);
                                          radio3.setChecked(false);

                                      }
                                  }

        );


        radio3.setOnClickListener(new RadioButton.OnClickListener(){

                                      public void onClick(View v){

                                          radio3.setChecked(true);
                                          radio1.setChecked(false);
                                          radio2.setChecked(false);
                                          radio4.setChecked(false);

                                      }
                                  }

        );


        radio4.setOnClickListener(new RadioButton.OnClickListener(){

                                      public void onClick(View v){

                                          radio4.setChecked(true);
                                          radio1.setChecked(false);
                                          radio2.setChecked(false);
                                          radio3.setChecked(false);

                                      }
                                  }

        );



        ImageView choice1=(ImageView)findViewById(R.id.choiceOne);
        ImageView choice2=(ImageView)findViewById(R.id.choiceTwo);
        ImageView choice3=(ImageView)findViewById(R.id.choiceThree);
        ImageView choice4=(ImageView)findViewById(R.id.choiceFour);

        choice1.setOnClickListener( new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
                radio1.setChecked(true);
                radio2.setChecked(false);
                radio3.setChecked(false);
                radio4.setChecked(false);


            }
        });

        choice2.setOnClickListener( new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {

                radio2.setChecked(true);
                radio1.setChecked(false);
                radio4.setChecked(false);
                radio3.setChecked(false);


            }
        });

        choice3.setOnClickListener( new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {

                radio3.setChecked(true);
                radio1.setChecked(false);
                radio2.setChecked(false);
                radio4.setChecked(false);


            }
        });

        choice4.setOnClickListener( new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {

                radio4.setChecked(true);
                radio1.setChecked(false);
                radio2.setChecked(false);
                radio3.setChecked(false);

            }
        });


        ImageView next=(ImageView)findViewById(R.id.next);

        next.setOnClickListener( new ImageView.OnClickListener(){

            @Override
            public void onClick(View v) {
               //  startActivity(new Intent(thirdlevel_21.this,secondlevel_22.class));
                if(radio1.isChecked()) {
                    SharedPreferences prefs = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                    boolean firstStart = prefs.getBoolean("firstStart", true);
                    if (firstStart){
                        mySqliteOpenHelper.UpdateNumOfLesson(49,"Saturn");
                        SharedPreferences pref = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("firstStart", false);
                        editor.apply();}
                    startActivity(new Intent(thirdlevel_21.this,thirdlevel_22.class));
                    mySqliteOpenHelper.UpdateQuestionAnswer(9, 0);

                }
                if(radio2.isChecked()){
                    SharedPreferences prefs = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                    boolean firstStart = prefs.getBoolean("firstStart", true);
                    if (firstStart){
                        mySqliteOpenHelper.UpdateNumOfLesson(49,"Saturn");
                        SharedPreferences pref = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("firstStart", false);
                        editor.apply();}
                    mySqliteOpenHelper.UpdateQuestionAnswer(9,1);
                    startActivity(new Intent(thirdlevel_21.this,thirdlevel_22.class));
                }


                if(radio3.isChecked()){
                    SharedPreferences prefs = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                    boolean firstStart = prefs.getBoolean("firstStart", true);
                    if (firstStart){
                        mySqliteOpenHelper.UpdateNumOfLesson(49,"Saturn");
                        SharedPreferences pref = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("firstStart", false);
                        editor.apply();}
                    mySqliteOpenHelper.UpdateQuestionAnswer(9,0);
                    startActivity(new Intent(thirdlevel_21.this,thirdlevel_22.class));
                }
                if(radio4.isChecked()){
                    SharedPreferences prefs = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                    boolean firstStart = prefs.getBoolean("firstStart", true);
                    if (firstStart){
                        mySqliteOpenHelper.UpdateNumOfLesson(49,"Saturn");
                        SharedPreferences pref = getSharedPreferences("pref_thirdLevel_21", MODE_PRIVATE);
                        SharedPreferences.Editor editor = prefs.edit();
                        editor.putBoolean("firstStart", false);
                        editor.apply();}
                    mySqliteOpenHelper.UpdateQuestionAnswer(9,0);
                    startActivity(new Intent(thirdlevel_21.this,thirdlevel_22.class));
                }
                if(!radio1.isChecked()&&!radio2.isChecked()&&!radio3.isChecked()&&!radio4.isChecked()){
                    ShowPopupSolve();}




            }
        });





    }






    public void ShowPopup() {
        myDialog = new Dialog(this);
        Button btnClose;
        myDialog.setContentView(R.layout.hint3_2);
        btnClose =(Button) myDialog.findViewById(R.id.okaybtn);


        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }


    public void ShowPopupSolve() {
        myDialog = new Dialog(this);
        Button btnClose;
        myDialog.setContentView(R.layout.solve_it);
        btnClose =(Button) myDialog.findViewById(R.id.okaybtn);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }









}
