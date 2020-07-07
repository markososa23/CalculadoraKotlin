package com.marcosoft.calculadorakotlin

import android.annotation.SuppressLint
import android.os.Bundle

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    val varNumero1:Double=0.0
    val varNumero2:Double=0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSumar.setOnClickListener{if (!comprobarValores()) RealizaSuma() else Toast.makeText(this,"NO DEJE NINGUN cAMPO VACIO BOLUDO",Toast.LENGTH_SHORT).show()}
        btnRestar.setOnClickListener{comprobarResta()}
        btnMultiplicar.setOnClickListener{comprobarMultiplicacion()}
        btnDividir.setOnClickListener{comprobarDivision()}

    }

    @SuppressLint("SetTextI18n")
    private fun RealizaSuma() {
        val varNumero1 = txtNum1.text.toString().toDouble()
        val varNumero2 =   txtNum2.text.toString().toDouble()
        txtResultado.text = "Resultado: ${Sumar(varNumero1,varNumero2)}"
        txtAuxiliar1.text = varNumero1.toString()
        txtAuxiliar2.text = varNumero2.toString()
    }

    private fun Sumar(varNumero1: Double, varNumero2: Double):Double {
    return  varNumero1 + varNumero2
    }

    private fun comprobarDivision() {
        TODO("Not yet implemented")
    }

    private fun comprobarMultiplicacion() {
        TODO("Not yet implemented")
    }

    @SuppressLint("SetTextI18n")
    private fun comprobarResta() =
        if (txtNum1.text.toString().isEmpty() || txtNum2.text.toString().isEmpty()) {
            Toast.makeText(this,"NO DEJE NINGUN cAMPO VACIO BOLUDO",Toast.LENGTH_SHORT).show()
        }else{
            val varNumero1 =txtNum1.text.toString().toDouble()
            val varNumero2 =   txtNum2.text.toString().toDouble()
            val resta = varNumero1 - varNumero2
            txtResultado.text = "Resultado: $resta"
        }

    fun comprobarValores():Boolean {
        return (txtNum1.text.toString().isEmpty() || txtNum2.text.toString().isEmpty())
    }

}