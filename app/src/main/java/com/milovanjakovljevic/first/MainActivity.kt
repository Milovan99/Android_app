package com.milovanjakovljevic.first


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    rezultatText.visibility=View.INVISIBLE

        izracunajButton.setOnClickListener{
            var tezina = tezinaText.text.toString().toDouble()
            var visina = visinaText.text.toString().toDouble()

            var bmi = tezina / (visina * visina)

           // rezultatText.visibility=View.VISIBLE
           // rezultatText.text="BMI "+ String.format("%.2f",bmi)
    val rezultatIntent = Intent(this,BMIRazultatAcitivity:: class.java)

            rezultatIntent.putExtra("rezultat","BMI:" + String.format("%.2f",bmi))
            startActivity(rezultatIntent)
        }

    }

}