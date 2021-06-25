package com.example.less1debug;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer arg1;
    private Integer arg2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText1 = findViewById(R.id.edit1);
        EditText editText2 = findViewById(R.id.edit2);
        Button button = findViewById(R.id.compare);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView result = findViewById(R.id.view);
                try {
                    arg1 = Integer.valueOf(editText1.getText().toString());
                    arg2 = Integer.valueOf(editText2.getText().toString());
                    if (arg1.equals(arg2)){
                        result.setText("True");
                    }else{
                        result.setText("False");
                    }
                }
                catch (NumberFormatException e){
                    result.setText("Введите число");
                }


            }
        });

    }
}