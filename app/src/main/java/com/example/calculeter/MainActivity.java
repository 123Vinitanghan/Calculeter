package com.example.calculeter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, b00, bdot, bAC, bX, bpercantage, bdevide, bmultiplication, bminus, bplus, bequalto;
    TextView number;
    int FN, LN;
    char ope;

    //TODO-6912-vinit anghan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        b0 = findViewById(R.id.b0);
        b00 = findViewById(R.id.b00);
        bdot = findViewById(R.id.bdot);
        bAC = findViewById(R.id.bAC);
        bX = findViewById(R.id.bX);
        bpercantage = findViewById(R.id.bpercantage);
        bdevide = findViewById(R.id.bdevide);
        bmultiplication = findViewById(R.id.bmultiplication);
        bminus = findViewById(R.id.bminus);
        bplus = findViewById(R.id.bplus);
        bequalto = findViewById(R.id.bequalto);
        number = findViewById(R.id.num);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hello 1", Toast.LENGTH_SHORT).show();
                String n = number.getText().toString();
                number.setText(n + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "0");
            }
        });
        b00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + "00");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText(n + ".");
            }
        });

        bpercantage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = number.getText().toString();
                number.setText("");
                ope = '%';
            }
        });
        bplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FN = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '+';
            }
        });
        bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FN = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '-';
            }
        });
        bdevide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FN = Integer.parseInt(number.getText().toString());
                number.setText("");
                ope = '/';
            }
        });
        bmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 FN = Integer.parseInt(number.getText().toString());
                number.setText(" ");
                ope = '*';
            }
        });
        bAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number.setText("");
            }
        });
        bequalto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ope == '+') {
                    LN = Integer.parseInt(number.getText().toString());
                    addition();
                } else if (ope == '-') {
                    LN = Integer.parseInt(number.getText().toString());
                    sub();

                } else if (ope == '*') {
                    LN = Integer.parseInt(number.getText().toString());
                    multiple();

                } else if(ope == '/') {
                    LN = Integer.parseInt(number.getText().toString());
                    devide();
                }
            }
        });

    }

    void addition () {
        int sum = FN + LN;
        number.setText(" " + sum);
    }
    void sub () {
        int sum = FN - LN;
        number.setText(" " + sum);
    }
    void multiple () {
        int sum = FN * LN;
        number.setText(" " + sum);
    }
    void devide(){
        int sum = FN / LN;
        number.setText(" " + sum);
    }

}
