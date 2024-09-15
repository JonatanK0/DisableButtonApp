package com.example.disablebuttonapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.disablebuttonapp.R;

public class MainActivity extends AppCompatActivity {

    private Button buttonReset;
    private Button buttonDisable;
    private TextView textView;
    private int clickCount = 0; // Zmienna do liczenia kliknięć

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicjalizacja przycisku i TextView
        buttonReset = findViewById(R.id.buttonReset);
        buttonDisable = findViewById(R.id.buttonDisable);
        textView = findViewById(R.id.textView);

        //Ustawienie początkowego tekstu w TextView
        textView.setText("Liczba kliknięć: " + clickCount);

        //Ustawienie nasłuchiwania na kliknięcie przycisku buttonDisable
        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Zwiększ licznik kliknięć
                clickCount++;

                //Aktualizacja tekstu w TextView
                textView.setText("Liczba kliknięć: " + clickCount);

                //Po kliknięciu przycisk zostaje dezaktywowany
                buttonDisable.setEnabled(false);
            }
        });

        //Ustawienie nasłuchiwania na kliknięcie przycisku buttonReset
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Aktualizacja tekstu w TextView
                textView.setText("Liczba kliknięć: " + clickCount);

                //Włączenie przycisku buttonDisable
                buttonDisable.setEnabled(true);
            }
        });
    }
}
