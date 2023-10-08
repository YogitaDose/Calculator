package com.example.calculator;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2;
    ImageButton addBtn, subBtn, mulBtn, divBtn;
    TextView result, msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        result = findViewById(R.id.result);
        msg = findViewById(R.id.msg);
    }
    public void onButtonClicked(View view) {
        int n1 = 0, n2 = 0, res = 0;
        try {
            n1 = Integer.parseInt(num1.getText().toString());
            n2 = Integer.parseInt(num2.getText().toString());
            switch(view.getId()) {
                case R.id.addbtn:
                    res = n1 + n2;
                    break;
                case R.id.subbtn:
                    res = n1 - n2;
                    break;
                case R.id.mulbtn:
                    res = n1 * n2;
                    break;
                case R.id.divbtn:
                    res = n1 / n2;
                    break;
            }
            result.setText(Integer.toString(res));
        }
        catch(NumberFormatException e) {
            msg.setText("Please enter integer values");
        }
        catch(ArithmeticException e) {
            msg.setText("Please don't divide 1st number by 0");
        }
        catch(Exception e) {
            msg.setText("Error occurred: "+e);
        }
    }
}