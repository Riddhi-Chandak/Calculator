package com.example.pc.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,beq,bc,bdot;
    EditText et;
    float val1,val2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=(Button)findViewById(R.id.button0);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        badd=(Button)findViewById(R.id.buttonadd);
        bsub=(Button)findViewById(R.id.buttonsub);
        bmul=(Button)findViewById(R.id.buttonmul);
        bdiv=(Button)findViewById(R.id.buttondiv);
        beq=(Button)findViewById(R.id.beql);
        bc=(Button)findViewById(R.id.buttonC);
        bdot=(Button)findViewById(R.id.button10);
        et=(EditText)findViewById(R.id.edt1);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+"9");
            }
        });

        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et.getText()==null)
                    et.setText("");
                else
                {
                    val1=Float.parseFloat(et.getText()+"");
                    add=true;
                    et.setText(null);
                }
            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et.getText()==null)
                    et.setText("");
                else
                {
                    val1=Float.parseFloat(et.getText()+"");
                    sub=true;
                    et.setText(null);
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et.getText()==null)
                    et.setText("");
                else
                {
                    val1=Float.parseFloat(et.getText()+"");
                    mul=true;
                    et.setText(null);
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(et.getText()==null)
                    et.setText("");
                else
                {
                    val1=Float.parseFloat(et.getText()+"");
                    div=true;
                    et.setText(null);
                }
            }
        });

        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2=Float.parseFloat(et.getText()+"");
                if(add==true)
                    {et.setText(val1+val2+"");add=false;}
                else if(sub==true)
                    {et.setText(val1-val2+"");sub=false;}
                else if(mul==true)
                    {et.setText(val1*val2+"");mul=false;}
                else if(div==true)
                    {et.setText(val1/val2+"");div=false;}
            }
        });

        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText("");
            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et.setText(et.getText()+".");
            }
        });
    }
}

