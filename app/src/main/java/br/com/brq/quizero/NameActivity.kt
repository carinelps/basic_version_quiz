package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

    lateinit var txt_name: EditText
    lateinit var btn_comecar: Button

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)


        //Tirando a Action Bar
        supportActionBar?.hide()

        carregarElementos()

        btn_comecar.setOnClickListener {
            if (txt_name.text.toString().isEmpty() || txt_name.text == null) {
                Toast.makeText(this, "Por favor, digiter seu nome", Toast.LENGTH_LONG).show()
            } else {
                Intent(this, FirstQuestion::class.java).apply {
                    startActivity(this)
                }
            }
        }
    }

    fun carregarElementos() {
        txt_name = findViewById<EditText>(R.id.txt_name)
        btn_comecar = findViewById<Button>(R.id.btn_comecar)

    }
}

