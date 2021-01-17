package com.farukhacizade.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1, n2;
    Button b1;
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 =(EditText) findViewById(R.id.sayi1);
        n2 =(EditText) findViewById(R.id.sayi2);
        b1=(Button) findViewById(R.id.button2);
        tv1=(TextView) findViewById(R.id.textView3);
        tv2=(TextView) findViewById(R.id.textView4);

       //Click then

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer a = Integer.parseInt(n1.getText().toString());
                Integer b = Integer.parseInt(n2.getText().toString());
                Integer Ebob =1, Ekob, max,min,i;

                for(i = 1; i <= a && i <= b; ++i)
                {
                    if(a % i == 0 && b % i == 0)
                        Ebob = i;
                }

                Ekob = (a * b) / Ebob;

                tv1.setText("ƏBOB: "  +Ebob.toString());
                tv2.setText("ƏKOB: " +Ekob.toString());





            }
        });




    }
}