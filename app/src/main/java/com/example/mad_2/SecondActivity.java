package com.example.mad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView text = findViewById(R.id.textView7);
        Bundle arg = getIntent().getExtras();
        if (arg!=null){
            String gg = arg.get("Input").toString();
            text.setText(gg);
            Log.i("Oshibka,","Зашли в if");
        }
        else{
            Log.i("Oshibka,","У нас пустой arg");
        }
        but1 = findViewById(R.id.button5);//кнопка LOG1
        View.OnClickListener LOG1=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Oshibka", "Нажата кнопка LOG программмно");
            }
        };
        but1.setOnClickListener(LOG1);
    }
    public void onClick (View v){
        Log.i("Oshibka", "Нажата кнопка LOG декларативно");
    }
}
