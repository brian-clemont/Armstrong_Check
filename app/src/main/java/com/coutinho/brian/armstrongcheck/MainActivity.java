package com.coutinho.brian.armstrongcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button check;
    private TextView result;
    private EditText input_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        check =(Button) findViewById(R.id.button_check);
        check.setOnClickListener(this);
        result =(TextView)findViewById(R.id.result);
        input_number =(EditText)findViewById(R.id.input_number);
    }

    @Override
    public void onClick(View v) {

        int num = Integer.parseInt(input_number.getText().toString());
        int n = num;
        int check =0,remainder;

        while(num>0){
            remainder = num % 10;
            check = (int) (check + Math.pow(remainder,3));
            num = num/10;
        }
        if(check == n)
            result.setText(n+getString(R.string.is_armstrong));
        else
        result.setText(n+getString(R.string.is_not_Armstrong));

    }
}
