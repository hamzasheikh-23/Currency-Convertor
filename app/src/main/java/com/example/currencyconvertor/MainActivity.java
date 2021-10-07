package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public void btnConvertClick (View view) {

      //  TextView currency = (TextView) findViewById(R.id.editCurrencyDecimal);
        String value = ((TextView) findViewById(R.id.editCurrencyDecimal)).getText().toString();
        double pkr = Double.parseDouble(value);
        double usd = pkr * 170.85;
        Toast.makeText(this, pkr+" PKR = "+usd+" USD", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}