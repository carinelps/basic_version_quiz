package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

    lateinit var btn_primeira : Button
    lateinit var btn_segunda : Button
    lateinit var btn_terceira : Button
    lateinit var btn_quarta : Button
    var certa : Int = 0
    var errada : Int = 0



class FirstQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_question)

        carregarElementos()


        btn_primeira.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondQuestion::class.java)
            intent.putExtra("errada", errada)
            intent.putExtra("certa", certa)
            startActivity(intent)
            finish()
        }

        btn_segunda.setOnClickListener {
            certa = certa + 1
            Toast.makeText(this, "Parabéns!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondQuestion::class.java)
            intent.putExtra("certa", certa)
            intent.putExtra("errada", errada)
            startActivity(intent)
            finish()
        }

        btn_terceira.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondQuestion::class.java)
            intent.putExtra("certa", certa)
            intent.putExtra("errada", errada)
            startActivity(intent)
            finish()
        }

        btn_quarta.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondQuestion::class.java)
            intent.putExtra("certa", certa)
            intent.putExtra("errada", errada)
            startActivity(intent)
            finish()
        }

    }


    fun carregarElementos() {
        btn_primeira = findViewById(R.id.btn_primeira)
        btn_segunda = findViewById(R.id.btn_segunda)
        btn_terceira = findViewById(R.id.btn_terceira)
        btn_quarta = findViewById(R.id.btn_quarta)
    }

}