package com.example.exercici2santosmario;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*/
        TextView txtMsg= (TextView) findViewById(R.id.txtMsg);
        txtMsg.setText("We good");
        txtMsg.setTextColor(Color.GREEN);
    /*/
        text = (TextView) findViewById(R.id.exempletextboto);
        Button boto = (Button) findViewById(R.id.button);

        Button boto2 = (Button) findViewById(R.id.button2);

        boto2.setOnClickListener(this);
        boto.setOnClickListener(this);

    /*/
        TextView txtDesc =(TextView) findViewById(R.id.txtDesc);
        txtDesc.setTextColor(Color.BLUE);
        txtDesc.setTextSize(29);
        txtDesc.setPaddingRelative(12,9,3,4);
        txtDesc.setText("AAAAAAAAAAAAAAAAAAAAA");

       LinearLayout ll = (LinearLayout) findViewById(R.id.LinearLayout);
       print(ll, "Print test");
/*/
    }

    /*/
        public void print(LinearLayout ll, String text){

            TextView txtnew = new TextView(this);
            txtnew.setTextColor(Color.argb(255,0,0,0));
            txtnew.setTextSize(18);
            txtnew.setText(text);
            ll.addView(txtnew);
        }
    /*/
    @Override
    public void onClick(View view) {
        int durada=1;
        String missatge="";
        if (view.getId() == R.id.button) {
            missatge=("Primer Boto Okey");
            durada= Toast.LENGTH_SHORT;


        } else if (view.getId() == R.id.button2) {
            missatge=("Primer Boto Okey");
            durada= Toast.LENGTH_SHORT;
        }
        missatge= missatge +"durada" +durada;
    }
}