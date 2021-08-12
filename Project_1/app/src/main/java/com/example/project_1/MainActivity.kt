package com.example.project_1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //var
        val btCalcular = Calcular

        //Code
        btCalcular.setOnClickListener{
        val Nota1 = Integer.parseInt(Nota1.text.toString())
        val Nota2 = Integer.parseInt(Nota2.text.toString())
        val Media = (Nota1+Nota2)/2
        val Faltas = Integer.parseInt(Faltas.text.toString())

            if(Media >=7 && Faltas <= 10) {
               Resultado.setText("Aprovado"+ "\n" + "Nota Final: " + Media + "\n" + "Faltas: " + Faltas)
                Resultado.setTextColor(Color.GREEN)
            }
            else{
                Resultado.setText("Reprovado"+ "\n" + "Nota Final: " + Media + "\n" + "Faltas: " + Faltas)
                Resultado.setTextColor(Color.RED)

            }
        }
    }
}