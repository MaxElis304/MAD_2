package com.example.mad_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    boolean a1,a2,a3,a4,a5,a6,a7,a8; //бъявление переменных
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox box1,box2,box3,box4,box5,box6,box7,box8;
        box1=findViewById(R.id.a1);  //привязка к переменной box1 кнопки с id
        box2=findViewById(R.id.a2);
        box3=findViewById(R.id.a3);
        box4=findViewById(R.id.a4);
        box5=findViewById(R.id.a5);
        box6=findViewById(R.id.a6);
        box7=findViewById(R.id.a7);
        box8=findViewById(R.id.a8);

        //Выполняем проверку выбора кнопок CheckBox
        //метод isChecked() - проверка нажатия
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a1 = true;
                if (box1.isChecked()) {
                    a1 = true;
                }
                else{
                    a1=false;
                }
            }
        });

        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a2 = true;
                if (box2.isChecked()) {
                    a2 = true;
                }
                else{
                    a2=false;
                }
            }
        });
        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a3 = true;
                if (box3.isChecked()) {
                    a3 = true;
                }
                else{
                    a3=false;
                }
            }
        });
        box4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a4 = true;
                if (box4.isChecked()) {
                    a4 = true;
                }
                else{
                    a4=false;
                }
            }
        });
        box5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a5 = true;
                if (box5.isChecked()) {
                    a5 = true;
                }
                else{
                    a5=false;
                }
            }
        });
        box6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a6 = true;
                if (box6.isChecked()) {
                    a6 = true;
                }
                else{
                    a6=false;
                }
            }
        });
        box7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a7 = true;
                if (box7.isChecked()) {
                    a7 = true;
                }
                else{
                    a7=false;
                }
            }
        });
        box8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                a8 = true;
                if (box8.isChecked()) {
                    a8 = true;
                }
                else{
                    a8=false;
                }
            }
        });
    }

    //Для перехода в SecondActivity
    public void goNewActivity(View V){
        Intent intent = new Intent(this, SecondActivity.class);
        if ((a1 && !a2 && !a3 && a4 && !a5 && a6 && a7 && !a8)){
            intent.putExtra("Input", "Доброго времени суток, коллега! уверена, что полковник в отставке " +
                    "гордится вами, ведь вы шарите за прик инфу в мирэа");
            startActivity(intent);
        }
        else{
            intent.putExtra("Input", "Вы ошиблись... Попробуйте снова(");
            startActivity(intent);
        }
    }
    /*
    button2 = findViewById(R.id.button2);
    View.OnClickListener LOG1 = new View.OnClickListener() {
        public void onClick(View view){Log.i("Ошибка", "нажата кнопка LOG программно");}
    };
    button2.setOnClickListener(LOG1);*/
}