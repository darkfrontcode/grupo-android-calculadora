package usuario.app.calculadora;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculadoraActivity extends AppCompatActivity {

    EditText ednumero1, ednumero2;
    Button btsomar, btsubtrair, btmultiplicar, btdividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);


        /**
         * @description inputs
         */
        ednumero1 = (EditText) findViewById(R.id.ednumero1);
        ednumero2 = (EditText) findViewById(R.id.ednumero2);


        /**
         * @description buttons
         */
        btsomar = (Button) findViewById(R.id.btsomar);
        btsubtrair = (Button) findViewById(R.id.btsubtrair);
        btmultiplicar=(Button)findViewById(R.id.btmultiplicar);
        btdividir = (Button) findViewById(R.id.btdividir);


        /**
         * @description Somar
         */
        btsomar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                /**
                 * @description getting text and instances
                 */
                double num1  = Double.parseDouble(ednumero1.getText().toString());
                double num2  = Double.parseDouble(ednumero2.getText().toString());
                double soma = num1 + num2;


                /**
                 * description alert dialog
                 */
                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado da soma");
                dialogo.setMessage("A soma é " + soma);
                dialogo.setNeutralButton("Ok", null);
                dialogo.show();

            }

        });


        /**
         * @description Subtrair
         */
        btsubtrair.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                /**
                 * @description getting text and instances
                 */
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double soma = num1 - num2;

                /**
                 * description alert dialog
                 */
                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado subtração");
                dialogo.setMessage("A subtração é " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });



        /**
         * @description Multiplicar
         */
        btmultiplicar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                /**
                 * @description getting text and instances
                 */
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double soma = num1 * num2;


                /**
                 * description alert dialog
                 */
                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado multiplicação");
                dialogo.setMessage("A multiplicação é " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();
            }
        });


        /**
         * @description Dividir
         */
        btdividir.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {


                /**
                 * @description getting text and instances
                 */
                double num1 = Double.parseDouble(ednumero1.getText().toString());
                double num2 = Double.parseDouble(ednumero2.getText().toString());
                double soma = num1 / num2;


                /**
                 * description alert dialog
                 */
                AlertDialog.Builder dialogo = new AlertDialog.Builder(CalculadoraActivity.this);

                dialogo.setTitle("Resultado divisão");
                dialogo.setMessage("A divisão é " + soma);
                dialogo.setNeutralButton("OK", null);
                dialogo.show();

            }
        });

    }

}
