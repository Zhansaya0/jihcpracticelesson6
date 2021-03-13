package com.e.jihcpracticelesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button btnPoint, btnMultiple, btnDivision, btnPlus, btnMinus, btnPercentage, btnEqual, btnC, btnPlusminus;
    TextView tv_print_san;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnMultiple = findViewById(R.id.btnMultiple);
        btnDivision = findViewById(R.id.btnDivision);
        btnPoint = findViewById(R.id.btnPoint);
        btnPercentage = findViewById(R.id.btnPercentage);
        btnEqual = findViewById(R.id.btnEqual);
        btnC = findViewById(R.id.btnC);
        btnPlusminus = findViewById(R.id.btnPlusminus);
        tv_print_san = findViewById(R.id.tv_print_san);

        View.OnClickListener buttonSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aldyngySan = tv_print_san.getText().toString();
                String clickedNumber = "";
                String result = "";

                switch (view.getId()) {
                    case R.id.btn0:
                        clickedNumber = "0";
                        break;
                    case R.id.btn1:
                        clickedNumber = "1";
                        break;
                    case R.id.btn2:
                        clickedNumber = "2";
                        break;
                    case R.id.btn3:
                        clickedNumber = "3";
                        break;
                    case R.id.btn4:
                        clickedNumber = "4";
                        break;
                    case R.id.btn5:
                        clickedNumber = "5";
                        break;
                    case R.id.btn6:
                        clickedNumber = "6";
                        break;
                    case R.id.btn7:
                        clickedNumber = "7";
                        break;
                    case R.id.btn8:
                        clickedNumber = "8";
                        break;
                    case R.id.btn9:
                        clickedNumber = "9";
                        break;
                }
                if (!aldyngySan.equals("0")) result = aldyngySan + clickedNumber;
                else result = clickedNumber;

                tv_print_san.setText(result);
            }
        };
        btn0.setOnClickListener(buttonSandar);
        btn1.setOnClickListener(buttonSandar);
        btn2.setOnClickListener(buttonSandar);
        btn3.setOnClickListener(buttonSandar);
        btn4.setOnClickListener(buttonSandar);
        btn5.setOnClickListener(buttonSandar);
        btn6.setOnClickListener(buttonSandar);
        btn7.setOnClickListener(buttonSandar);
        btn8.setOnClickListener(buttonSandar);
        btn9.setOnClickListener(buttonSandar);

        View.OnClickListener btnPlusMinusClean = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_print_san.setText("0");
                switch (view.getId()){

                    case R.id.btnC:
                        tv_print_san.setText("0");
                        break;

                    case R.id.btnPlusminus:
                        String sanText = tv_print_san.getText().toString();
                        int san = Integer.parseInt(sanText);
                        tv_print_san.setText("0");
                        if(san > 0) tv_print_san.setText("-"+sanText);
                        else {
                            san = san * (-1);
                            tv_print_san.setText(""+san);
                        };
                        break;
                }
            }
        };
        btnC.setOnClickListener(btnPlusMinusClean);
        btnPlusminus.setOnClickListener(btnPlusMinusClean);
    }
}git