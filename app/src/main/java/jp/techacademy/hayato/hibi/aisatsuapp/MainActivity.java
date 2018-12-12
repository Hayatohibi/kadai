package jp.techacademy.hayato.hibi.aisatsuapp;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button01 = (Button) findViewById(R.id.button01);
        button01.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {

                    public void onTimeSet(TimePicker view, int hourOfday, int minute) {
                        if(hourOfday >= 2 && hourOfday < 10) {
                            TextView textView = (TextView) findViewById(R.id.aisatsu);
                            textView.setText("おはよう");
                        } else if(hourOfday >= 10 && hourOfday < 18) {
                            TextView textView = (TextView) findViewById(R.id.aisatsu2);
                            textView.setText("こんにちは");
                        }else if(hourOfday >= 18 || hourOfday >= 0) {
                            TextView textView = (TextView) findViewById(R.id.aisatsu3);
                            textView.setText("こんばんは");
                        }
                    }
                },
                13,
                0,
                true);
        timePickerDialog.show();



    }
}
