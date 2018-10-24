package com.lesnyg.edu.textviewbotton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textview01;
    Button button1,button2,button3,button4,button5,button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview01 = (TextView)findViewById(R.id.textview01);
        //button1 = (Button)findViewById(R.id.button1);

    }


    public void onclickwieget(View view) {
        int id=view.getId();
        String text= null;

        switch (id) {
            case R.id.button1:
                text = ((Button)view).getText().toString();
                break;
            case R.id.button2:
                text = ((Button)view).getText().toString();
                break;
            case R.id.button3:
                text = ((Button)view).getText().toString();
                break;
            case R.id.button4:
                text = ((Button)view).getText().toString();
                break;
            case R.id.button5:
                text = ((Button)view).getText().toString();
                break;
            case R.id.button6:
                text = ((Button)view).getText().toString();
                break;
            default:
                text = "Nothing";

        }
        textview01.setText(text);

    }
}
