package com.kritika.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText weight, height;
    Button b1;
    float bmi;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        weight = findViewById(R.id.we);
        height = findViewById(R.id.he);
        b1 = findViewById(R.id.button);
        tv1 = findViewById(R.id.text);
        tv2=findViewById(R.id.text1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float w, h;
                //float bmi;
                w = Float.parseFloat(weight.getText().toString());
                h = Float.parseFloat(height.getText().toString());
                bmi = w / (h * h);
                tv1.setText("BMI is : " + bmi);
                if(bmi<18.5){
                    tv2.setText("Under Weight");
                } else if (bmi<24.9 && bmi>18.5) tv2.setText("Healthy Weight");
                else if (bmi<29.9 && bmi>24.9) {
                    tv2.setText("Over Weight");
                }
                else{
                    tv2.setText("Obese");
                }

            }
        });

    }
}

