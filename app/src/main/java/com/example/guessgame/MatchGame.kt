package com.example.guessgame

import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MatchGame : AppCompatActivity() {
    lateinit var image1: Button
    lateinit var image2: Button
    lateinit var image3: Button
    lateinit var image4: Button
    lateinit var image5: Button
    lateinit var image6: Button
    lateinit var image7: Button
    lateinit var image8: Button
    lateinit var image9: Button
    lateinit var image10: Button
    lateinit var image11: Button
    lateinit var image12: Button
    lateinit var textview: TextView

    private var kontrol2 = 0 //hangi resim olduğunu kontrol etmek için


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_match_game)

        image1 = findViewById(R.id.imageView)
        image2 = findViewById(R.id.imageView2)
        image3 = findViewById(R.id.imageView3)
        image4 = findViewById(R.id.imageView4)
        image5 = findViewById(R.id.imageView5)
        image6 = findViewById(R.id.imageView6)
        image7 = findViewById(R.id.imageView7)
        image8 = findViewById(R.id.imageView8)
        image9 = findViewById(R.id.imageView9)
        image10 = findViewById(R.id.imageView10)
        image11 = findViewById(R.id.imageView11)
        image12 = findViewById(R.id.imageView12)
        textview = findViewById(R.id.textView4)

        game()

    }


    var point = 0
    var numOn =1
    private fun game (){

        val c1 = arrayListOf(textview)
        val c2 = arrayListOf(textview)

        fun solution(){
            image1.text = "1"; image9.text = "1";
            image2.text = "2"; image10.text = "5";
            image3.text = "3"; image11.text = "4";
            image4.text = "4"; image12.text = "3";
            image5.text = "5";
            image6.text = "6";
            image7.text = "6";
            image8.text = "2";

        }
        solution()

        fun check() {
            if(c1[0].text == c2[0].text ){
    c1[0].text == ""; c2[0].text == ""; point++; textview.text = "Points: ${point} "
            }
            else{
    Handler().postDelayed({c1[0].setBackgroundResource(R.drawable.oval); c2[0].setBackgroundResource(R.drawable.oval)}, 400)

             }
            Handler().postDelayed({c1.remove((c1[0])); c2.remove(c2[0])},400)
    if(point  == 6){
        Handler().postDelayed({game()},1000)
    }
        }

        c1.remove((c1[0])); c2.remove(c2[0])

        image1.setOnClickListener{ image1.setBackgroundResource(R.drawable.cow); if (image1.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image1)
            }
            else if (c1[0] != image1){
                c2.add(image1); check(); numOn = 1
            }
        } }
        image2.setOnClickListener{ image2.setBackgroundResource(R.drawable.monkey); if (image2.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image2)
            }
            else if (c1[0] != image2){
                c2.add(image2); check(); numOn = 1
            }
        } }
        image3.setOnClickListener{ image3.setBackgroundResource(R.drawable.panda); if (image3.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image3)
            }
            else if (c1[0] != image3){
                c2.add(image3); check(); numOn = 1
            }
        } }
        image4.setOnClickListener{ image4.setBackgroundResource(R.drawable.rabbit); if (image4.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image4)
            }
            else if (c1[0] != image4){
                c2.add(image4); check(); numOn = 1
            }
        } }
        image5.setOnClickListener{ image5.setBackgroundResource(R.drawable.penguin); if (image5.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image5)
            }
            else if (c1[0] != image5){
                c2.add(image5); check(); numOn = 1
            }
        } }
        image6.setOnClickListener{ image6.setBackgroundResource(R.drawable.turtle); if (image6.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image6)
            }
            else if (c1[0] != image6){
                c2.add(image6); check(); numOn = 1
            }
        } }
        image7.setOnClickListener{ image7.setBackgroundResource(R.drawable.turtle); if (image7.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image7)
            }
            else if (c1[0] != image7){
                c2.add(image7); check(); numOn = 1
            }
        } }
        image8.setOnClickListener{ image8.setBackgroundResource(R.drawable.monkey); if (image8.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image8)
            }
            else if (c1[0] != image8){
                c2.add(image8); check(); numOn = 1
            }
        } }
        image9.setOnClickListener{ image9.setBackgroundResource(R.drawable.cow); if (image9.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image9)
            }
            else if (c1[0] != image9){
                c2.add(image9); check(); numOn = 1
            }
        } }
        image10.setOnClickListener{ image10.setBackgroundResource(R.drawable.penguin); if (image10.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image10)
            }
            else if (c1[0] != image10){
                c2.add(image10); check(); numOn = 1
            }
        } }
        image11.setOnClickListener{ image11.setBackgroundResource(R.drawable.rabbit); if (image11.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image11)
            }
            else if (c1[0] != image11){
                c2.add(image11); check(); numOn = 1
            }
        } }
        image12.setOnClickListener{ image12.setBackgroundResource(R.drawable.panda); if (image12.text != ""){
            if(numOn ==1){
                numOn =2; c1.add(image12)
            }
            else if (c1[0] != image12){
                c2.add(image12); check(); numOn = 1
            }
        } }

    }
}