package com.example.guessgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var editNum1: EditText
    lateinit var textResult: TextView
    var random1:Int = 0
    var sayac:Int = 0
    var skor:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editNum1 = findViewById(R.id.editTextNumber)
        textResult = findViewById(R.id.textView)
        random1 = (0..100).shuffled().last()
    }
    fun btnTahmin(view: View?) {
        sayac += 1;

        val num1 = editNum1.text.toString().toInt()
        if (num1 > random1){
            textResult.setText("Daha Küçük Sayı Girin");
        }
        else if (num1 < random1){
            textResult.setText("Daha Büyük Sayı Girin");


        }
        else if (num1 == random1){

            if(sayac>9){
                skor=10;
            }else if(sayac>7){
                skor=30;
            }
            else if(sayac>5){
                skor=50;
            }else if(sayac>3){
                skor=70;
            }else if(sayac>2){
                skor=90;
            }else if(sayac>0){
                skor=100;
            }
            textResult.setText("Skor: "+skor.toString() + " Tahmin Sayısı: "+sayac.toString());
        }

    }
    fun btnYeniden(view: View?) {

        random1 = (0..100).shuffled().last()
        textResult.setText("Sonuç!");
    }
}