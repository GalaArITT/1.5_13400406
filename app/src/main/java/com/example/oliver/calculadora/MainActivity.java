package com.example.oliver.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0, btn_neg, btn_div, btn_mult,btn_res,btn_sum, btn_punto,btn_igual;
    EditText resultado,numero;
    TextView operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0 =(Button) findViewById(R.id.btn_0);
        btn_1 =(Button) findViewById(R.id.btn_1);
        btn_2 =(Button) findViewById(R.id.btn_2);
        btn_3 =(Button) findViewById(R.id.btn_3);
        btn_4 =(Button) findViewById(R.id.btn_4);
        btn_5 =(Button) findViewById(R.id.btn_5);
        btn_6 =(Button) findViewById(R.id.btn_6);
        btn_7 =(Button) findViewById(R.id.btn_7);
        btn_8 =(Button) findViewById(R.id.btn_8);
        btn_9 =(Button) findViewById(R.id.btn_9);
        btn_punto = (Button) findViewById(R.id.btn_punto);
        btn_igual = (Button) findViewById(R.id.btn_igual);

        btn_neg = (Button) findViewById(R.id.btn_neg);
        operador = (TextView) findViewById(R.id.txt_op);

        btn_sum = (Button) findViewById(R.id.btn_sum);
        btn_res = (Button) findViewById(R.id.btn_res);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_mult = (Button) findViewById(R.id.btn_mult);

        resultado = (EditText) findViewById(R.id.edt_mostrar);
        numero = (EditText) findViewById(R.id.edt_leer);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"0");
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"1");
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"2");
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"3");
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"4");
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"5");
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"6");
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"7");
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"8");
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+"9");
            }
        });
        btn_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numero.setText(numero.getText().toString()+".");
            }
        });
        btn_neg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resultado.getText().toString().equals("")){
                    numero.setText("0");
                    return;
                }
                numero.setText(""+(-1*Double.parseDouble(numero.getText().toString())));
            }
        });
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion();
                operador.setText("+");
                numero.setText("");
            }
        });
        btn_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion();
                operador.setText("-");
                numero.setText("");
            }
        });
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion();
                operador.setText("*");
                numero.setText("");
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion();
                operador.setText("/");
                numero.setText("");
            }
        });
        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operacion();
                operador.setText("=");
                numero.setText("");
            }
        });


    }

    public void inicializar(){
        btn_0 =(Button) findViewById(R.id.btn_0);
        btn_1 =(Button) findViewById(R.id.btn_1);
        btn_2 =(Button) findViewById(R.id.btn_2);
        btn_3 =(Button) findViewById(R.id.btn_3);
        btn_4 =(Button) findViewById(R.id.btn_4);
        btn_5 =(Button) findViewById(R.id.btn_5);
        btn_6 =(Button) findViewById(R.id.btn_6);
        btn_7 =(Button) findViewById(R.id.btn_7);
        btn_8 =(Button) findViewById(R.id.btn_8);
        btn_9 =(Button) findViewById(R.id.btn_9);

        btn_neg = (Button) findViewById(R.id.btn_neg);
        operador = (TextView) findViewById(R.id.txt_op);

        btn_sum = (Button) findViewById(R.id.btn_sum);
        btn_res = (Button) findViewById(R.id.btn_res);
        btn_div = (Button) findViewById(R.id.btn_div);
        btn_mult = (Button) findViewById(R.id.btn_mult);

        resultado = (EditText) findViewById(R.id.edt_mostrar);
        numero = (EditText) findViewById(R.id.edt_leer);

    }
    private void operacion(){
        if(numero.getText().toString().equals("")){
            numero.setText("0");
        }
        if(operador.getText().toString().equals("+")){
            String a = resultado.getText().toString();
            String b = numero.getText().toString();
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(b);
            resultado.setText((c+d)+"");
            return;
        }
        if(operador.getText().toString().equals("=")){
            String b = numero.getText().toString();
            double c = 0;
            double d = Double.parseDouble(b);
            resultado.setText((c+d)+"");
            return;
        }
        if(operador.getText().toString().equals("-")){
            String a = resultado.getText().toString();
            String b = numero.getText().toString();
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(b);
            resultado.setText((c-d)+"");
            return;
        }
        if(operador.getText().toString().equals("*")){
            String a = resultado.getText().toString();
            String b = numero.getText().toString();
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(b);
            resultado.setText((c*d)+"");
            return;
        }
        if(operador.getText().toString().equals("/")){
            String a = resultado.getText().toString();
            String b = numero.getText().toString();
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(b);
            if(d==0){
                return;
            }
            resultado.setText((c/d)+"");
            return;
        }

    }
}
