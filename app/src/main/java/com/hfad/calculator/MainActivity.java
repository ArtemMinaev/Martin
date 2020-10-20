package com.hfad.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MainActivity extends AppCompatActivity {
    Button buttonOne;
    Button buttonTwo;
    Button buttonThree;
    Button buttonFour;
    Button buttonFive;
    Button buttonSix;
    Button buttonSeven;
    Button buttonEight;
    Button buttonNine;
    Button buttonZero;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonMultiply;
    Button buttonDivide;
    Button buttonEqual;
    Button buttonDot;
    Button buttonC;
    TextView calcScreen;
    String operandString = "";
    String secondNumberString = "";
    BigDecimal operand;
    BigDecimal secondNumber;
    String sign;
    private final static String KEY_INDEX1 = "index1";
    private final static String KEY_INDEX2 = "index2";
    private final static String KEY_INDEX3 = "index3";
    private final static String KEY_INDEX4 = "index4";
    private final static String KEY_INDEX5 = "index5";
    private final static String KEY_INDEX6 = "index6";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonZero = findViewById(R.id.buttonZero);
        buttonPlus = findViewById(R.id.buttonPlus);
        buttonMinus = findViewById(R.id.buttonMinus);
        buttonMultiply = findViewById(R.id.buttonMultiply);
        buttonDivide = findViewById(R.id.buttonDivide);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonDot = findViewById(R.id.buttonDot);
        buttonC = findViewById(R.id.buttonC);
        calcScreen = findViewById(R.id.calcScreen);

        if (savedInstanceState != null){
            calcScreen.setText(savedInstanceState.getString(KEY_INDEX1));
            operandString = savedInstanceState.getString(KEY_INDEX4);
            secondNumberString = savedInstanceState.getString(KEY_INDEX5);
            operand = new BigDecimal(savedInstanceState.getDouble(KEY_INDEX2));
            secondNumber = new BigDecimal(savedInstanceState.getDouble(KEY_INDEX3));
            sign = savedInstanceState.getString(KEY_INDEX6);
        }

        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                operandString += "1";
                calcScreen.setText(operandString);
                } else if (sign != null){
                    secondNumberString += "1";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                operandString += "2";
                calcScreen.setText(operandString);
                } else {
                    secondNumberString += "2";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "3";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "3";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "4";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "4";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "5";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "5";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "6";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "6";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "7";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "7";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "8";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "8";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "9";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "9";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operand == null){
                    operandString += "0";
                    calcScreen.setText(operandString);
                } else {
                    secondNumberString += "0";
                    calcScreen.setText(secondNumberString);
                }
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (calcScreen.getText() != null && calcScreen.getText().toString() != "") {
                    if (operand == null) {
                        operandString += ".";
                        calcScreen.setText(operandString);
                    } else {
                        secondNumberString += ".";
                        calcScreen.setText(secondNumberString);
                    }
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcScreen.setText("");
                operandString = "";
                secondNumberString = "";
                operand = null;
                secondNumber = null;
                sign = null;
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operandString != "" && secondNumberString == "") {
                    operand = new BigDecimal(operandString);
                    sign = "plus";
                    calcScreen.setText("+");
                }
                if (operandString != "" && secondNumberString != ""){
                    secondNumber = new BigDecimal(secondNumberString);
                    calcScreen.setText(Operation(operand, sign, secondNumber).toString());
                    operand = new BigDecimal(calcScreen.getText().toString());
                    sign = "plus";
                    operandString = calcScreen.getText().toString();
                    secondNumberString = "";
                    secondNumber = null;
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operandString != "" && secondNumberString == "") {
                    operand = new BigDecimal(operandString);
                    sign = "minus";
                    calcScreen.setText("-");
                }
                if (operandString != "" && secondNumberString != ""){
                    secondNumber = new BigDecimal(secondNumberString);
                    calcScreen.setText(Operation(operand, sign, secondNumber).toString());
                    operand = new BigDecimal(calcScreen.getText().toString());
                    sign = "minus";
                    operandString = calcScreen.getText().toString();
                    secondNumberString = "";
                    secondNumber = null;
                }
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operandString != "" && secondNumberString == "") {
                    operand = new BigDecimal(operandString);
                    sign = "divide";
                    calcScreen.setText("/");
                }
                if (operandString != "" && secondNumberString != ""){
                    secondNumber = new BigDecimal(secondNumberString);
                    calcScreen.setText(Operation(operand, sign, secondNumber).toString());
                    operand = new BigDecimal(calcScreen.getText().toString());
                    sign = "divide";
                    operandString = calcScreen.getText().toString();
                    secondNumberString = "";
                    secondNumber = null;
                }
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operandString != "" && secondNumberString == "") {
                    operand = new BigDecimal(operandString);
                    sign = "multiply";
                    calcScreen.setText("*");
                }
                if (operandString != "" && secondNumberString != ""){
                    secondNumber = new BigDecimal(secondNumberString);
                    calcScreen.setText(Operation(operand, sign, secondNumber).toString());
                    operand = new BigDecimal(calcScreen.getText().toString());
                    sign = "multiply";
                    operandString = calcScreen.getText().toString();
                    secondNumberString = "";
                    secondNumber = null;
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (operandString != "" && secondNumberString != ""
                && calcScreen.getText().toString() != "+"
                && calcScreen.getText().toString() != "-"
                && calcScreen.getText().toString() != "/"
                && calcScreen.getText().toString() != "*"
                && calcScreen.getText().toString() != ".") {
                    secondNumber = new BigDecimal(calcScreen.getText().toString());
                    calcScreen.setText(Operation(operand, sign, secondNumber).toString());
                    operandString = calcScreen.getText().toString();
                    secondNumberString = "";
                    operand = new BigDecimal(calcScreen.getText().toString());
                    secondNumber = null;
                    sign = null;
                }
            }
        });
    }

    public BigDecimal Operation(BigDecimal a, String b, BigDecimal c){
        if (b == "plus"){
            BigDecimal result = a.add(c);
            return result;
        }
        if (b == "minus"){
            BigDecimal result = a.subtract(c);
            return result;
        }
        if (b == "divide"){
            double a1 = a.doubleValue();
            double a2 = c.doubleValue();
            if (a2 != 0){
            BigDecimal result = new BigDecimal(a1/a2);
            return result;}
            else {
                return new BigDecimal(0);
            }
        }
        if (b == "multiply"){
            BigDecimal result = a.multiply(c);
            return result;
        }
        return new BigDecimal("5");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        if (calcScreen.getText() != null){
        String screenText = calcScreen.getText().toString();
        savedInstanceState.putString(KEY_INDEX1, screenText);}
        String forSavingOperandString = operandString;
        String forSavingSecondNumberString = secondNumberString;
        String forSavingSign = sign;
        savedInstanceState.putString(KEY_INDEX4, forSavingOperandString);
        savedInstanceState.putString(KEY_INDEX5, forSavingSecondNumberString);
        savedInstanceState.putString(KEY_INDEX6, forSavingSign);
        if (operand != null){
        savedInstanceState.putDouble(KEY_INDEX2, operand.doubleValue());}
        if (secondNumber != null){
        savedInstanceState.putDouble(KEY_INDEX3, secondNumber.doubleValue());}
    }
}