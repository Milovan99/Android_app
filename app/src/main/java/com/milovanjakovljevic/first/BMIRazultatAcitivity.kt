package com.milovanjakovljevic.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmirazultat_acitivity.*

class BMIRazultatAcitivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmirazultat_acitivity)
    }

    override fun onStart() {
        super.onStart()
        val rezultat = intent.extras?.getString("rezultat")
                rezultatTextView.text=rezultat
    }
}