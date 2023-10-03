package com.example.the_circle_of_life

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.the_circle_of_life.databinding.BienvenidaBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById<Button>(R.id.button)
        boton.text = "Login"



        var texto = findViewById<TextView>(R.id.textView3)
        var nombre = findViewById<EditText>(R.id.editTextText)

        boton.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?){
                val bienvenida= BienvenidaBinding.inflate(layoutInflater)
                setContentView(bienvenida.root)

                bienvenida.textView3.text = "${bienvenida.textView3.text} ${nombre.text}"
                val toast = Toast.makeText(
                    applicationContext,
                    "¡¡Me has pulsado!!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }

    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)

    }
}