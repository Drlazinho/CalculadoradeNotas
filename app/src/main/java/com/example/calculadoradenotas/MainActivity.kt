package com.example.calculadoradenotas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calculadoradenotas.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalcular.setOnClickListener{ Calcular() }
    }
    private fun Calcular(){
        val stringNota1 = binding.Nota1.text.toString()
        var intNota1 = stringNota1.toDoubleOrNull()
        if (intNota1 == null){
            intNota1 = 0.0
        }
        val stringNota2 = binding.Nota2.text.toString()
        var intNota2 = stringNota2.toDoubleOrNull()
        if (intNota2 == null){
            intNota2 = 0.0
        }
        val stringNota3 = binding.Nota3.text.toString()
        var intNota3 = stringNota3.toDoubleOrNull()
        if (intNota3 == null){
            intNota3 = 0.0
        }
        val media : Double = (intNota1 + intNota2 + intNota3) / 3
        val resultadoTexto = if (media < 7) {
            "Você foi reprovado com a media %.2f".format(media)
        } else {
            "Você foi Aprovado com a media %.2f".format(media)
        }
        binding.resultado.text = resultadoTexto
    }
}