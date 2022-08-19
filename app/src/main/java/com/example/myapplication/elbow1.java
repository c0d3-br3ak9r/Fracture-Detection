package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class elbow1 extends AppCompatActivity {

    String buttonvalue;

    Button startBtn;



    private CountDownTimer countDownTimer;

    TextView mtextview;
    private boolean MTimeRunnig;
    private long MTimeLeftimemills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elbow1);

       /* Intent intent = getIntent();
        buttonvalue= intent.getStringExtra("value");
        int intval = Integer.valueOf(buttonvalue);*/


        startBtn = findViewById(R.id.startbtn);
        mtextview = findViewById(R.id.time);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (MTimeRunnig)
                {

                    stoptimer();
                }
                else
                {

                    starttimer();
                }


            }
        });
    }

    private void stoptimer()
    {
        countDownTimer.cancel();
        MTimeRunnig = false;
        startBtn.setText("START");
    }

    private void starttimer(){
        final CharSequence val1 = mtextview.getText();
        String num1= val1.toString();
        String num2= num1.substring(0,2);
        String num3= num1.substring(3,5);
        final int num = Integer.valueOf(num2)*60+Integer.valueOf(num3);
        MTimeLeftimemills = num*1000;
        countDownTimer = new CountDownTimer(MTimeLeftimemills, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                MTimeLeftimemills = millisUntilFinished;
                updateTimer();
            }

            @Override
            public void onFinish() {

                int newval = Integer.valueOf(buttonvalue)+1;
                if (newval<=7){
                    Intent intent = new Intent(elbow1.this,elbow1.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newval));
                    startActivity(intent);



                }

                else {
                    newval = 1;
                    Intent intent = new Intent(elbow1.this,elbow1.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    intent.putExtra("value",String.valueOf(newval));
                    startActivity(intent);
                }
            }

        }
                .start();
        startBtn.setText("PAUSE");
        MTimeRunnig = true;



    }


    private void updateTimer()
    {
        int minutes = (int)MTimeLeftimemills/60000;
        int seconds = (int)MTimeLeftimemills%60000/1000;





        String timeLeftText = "";
        if(minutes<10)
            timeLeftText = "0";
        timeLeftText= timeLeftText+minutes+":";
        if (seconds < 10)
            timeLeftText+="0";
        timeLeftText = timeLeftText +seconds;
        mtextview.setText(timeLeftText);






    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();


    }

}