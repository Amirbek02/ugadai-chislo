package com.example.ugadai_chislo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView textResult;
    Button btn;
    EditText eText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textResult = findViewById(R.id.tResult);
        eText = findViewById(R.id.eText);
        btn = findViewById(R.id.btn);


        Random random = new Random();
        int secretKey = random.nextInt(20)+ 1;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = eText.getText().toString();
                int intValue = Integer.parseInt(value);

                if(intValue == secretKey) {
                    textResult.setText("You win!");

                } else {
                    textResult.setText("You lost!");
                    if (secretKey > 0 & 5 >secretKey) {
                        Toast.makeText(getApplicationContext(), "Менше 5 и больше ноля", Toast.LENGTH_LONG).show();
                    } else if (secretKey > 5 & 10 >secretKey){
                        Toast.makeText(getApplicationContext(), "Меньше десяти и менше пяти", Toast.LENGTH_LONG).show();
                    } else if (secretKey > 10 & 15 >secretKey){
                        Toast.makeText(getApplicationContext(), "Меньше пятнадцати и больше десяти", Toast.LENGTH_LONG).show();
                    } else if (secretKey > 15 & 20 >secretKey){
                        Toast.makeText(getApplicationContext(), "Меньше дватцати и больше пятнадцати", Toast.LENGTH_LONG).show();
                    }
                }


            }
        });
    }
}