package com.jonathan.medina.calculadora_gliese;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    Double numero1,numero2,resultado;
    String operador;
    String listo = "si";
    String oper = "si";

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "1");
        }
    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "2");
        }
    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "3");
        }
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "4");
        }
    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "5");
        }
    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "6");
        }
    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "7");
        }
    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "8");
        }
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "9");
        }
    }

    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.textView);
        if (listo == "no") {
            tv.setText(tv.getText());
        } else {
            String value = tv.getText().toString();
            tv.setText(value + "0");
        }
    }

    public void onClickButtonPoint(View miView)
    {
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        if (value.contains(".")) {
            tv.setText(tv.getText());
        } else {
            tv.setText(tv.getText() + ".");
        }
    }

    public void onClickOperacionCapturaNumero1(View miView) {
        TextView tv = findViewById(R.id.textView);
        if (oper == "si") {
            if (tv.getText().toString() == "") {
                tv.setText("");
            } else {
                numero1 = Double.parseDouble(tv.getText().toString());
                listo = "si";
                tv.setText("");
            }
        } else {
            tv.setText(tv.getText());
        }
    }

    public void onClickSuma(View miView) {
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickResta(View miView)
    {
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickMultiplicacion(View miView)
    {
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickDivision(View miView)
    {
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickRaiz(View miView) {
        TextView tv = findViewById(R.id.textView);
        if (oper == "si") {
            if (tv.getText().toString() == "") {
                tv.setText("");
            } else {
                numero1 = Double.parseDouble(tv.getText().toString());
                resultado = Math.sqrt(numero1);
                listo = "no";
                tv.setText(resultado.toString());
            }
        } else {
            tv.setText(tv.getText());
        }
    }

    public void onClickExponente(View miView) {
        operador="^";
        onClickOperacionCapturaNumero1(miView);
    }

    public void onClickSeno(View miView) {
        Double numeroS;
        TextView tv = findViewById(R.id.textView);
        if (oper == "si") {
            if (tv.getText().toString() == "") {
                tv.setText("");
            } else {
                numero1 = Double.parseDouble(tv.getText().toString());
                numeroS = numero1;
                Math.toDegrees(numeroS);
                resultado = Math.sin(numeroS);
                listo = "no";
                tv.setText(resultado.toString());
            }
        } else {
            tv.setText(tv.getText());
        }
    }

    public void onClickCm(View miView) {
        TextView tv = findViewById(R.id.textView);
        if (tv.getText().toString() == "") {
            tv.setText("");
        } else {
            numero1 = Double.parseDouble(tv.getText().toString());
            resultado = numero1 / 10000;
            listo = "no";
            oper = "no";
            tv.setText(resultado.toString() + " m^2");
        }
    }


    public void onClickIgual(View miView) {
        TextView tv = (TextView) findViewById(R.id.textView);
        if (listo == "si") {
            if (tv.getText().toString() == "") {
                tv.setText("");
            } else if (numero1 == null) {
                tv.setText(tv.getText());
            } else {
                numero2 = Double.parseDouble(tv.getText().toString());

                try {
                    if (operador.equals("+")) {
                        resultado = numero1 + numero2;
                    } else if (operador.equals("-")) {
                        resultado = numero1 - numero2;
                    } else if (operador.equals("*")) {
                        resultado = numero1 * numero2;
                    } else if (operador.equals("/")) {
                        resultado = numero1 / numero2;
                    } else if (operador.equals("^")) {
                        resultado = Math.pow(numero1, numero2);
                    }
                    tv.setText(resultado.toString());
                    numero1 = null;
                    listo = "no";
                } catch (NumberFormatException nfe) {
                    Toast.makeText(this, "Número incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public void onClickLimpia(View miView)
    {
        numero1 = 0.0;
        numero2 = 0.0;
        listo = "si";
        oper = "si";
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText("");
    }

    public void onClickBorraUno(View miView)
    {
        TextView tv = findViewById(R.id.textView);
        if (listo == "si") {
            String value = tv.getText().toString();
            String cadena = value;
            if (value == "") {
                tv.setText("");
            } else if (tv.getText().length() == 0) {
                tv.setText("");
            } else {
                cadena = cadena.substring(0, cadena.length() - 1);
                tv.setText(cadena);
            }
        }
    }
}