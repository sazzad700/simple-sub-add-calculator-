package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {


    EditText editText;
    EditText editText2;
    Button button;
    Button button2;
    TextView textView;

    double p;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edittext1);
        editText2=findViewById(R.id.edittext2);
        button=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        textView=findViewById(R.id.result);



        button.setOnClickListener(this);
        button2.setOnClickListener(this);





    }


    @Override
    public void onClick(View view) {

       try {
           String number1= editText.getText().toString();
           String number2= editText2.getText().toString();



           double num1= Double.parseDouble(number1);
           double numb2= Double.parseDouble(number2);


           switch (view.getId()){
               case R.id.button1:
                   p=num1+numb2;
                   textView.setText("result= "+p);
                   break;

               case R.id.button2:
                   p=num1-numb2;
                   textView.setText("result= "+p);
                   break;
           }
       }catch (Exception e){
           Toast.makeText(MainActivity.this,"pls enter any number",Toast.LENGTH_SHORT).show();
       }

    }
}