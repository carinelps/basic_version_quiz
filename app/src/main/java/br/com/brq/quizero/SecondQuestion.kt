package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.properties.Delegates
    lateinit var btn_primeira2 : Button
    lateinit var btn_segunda2 : Button
    lateinit var btn_terceira2 : Button
    lateinit var btn_quarta2 : Button


class SecondQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_question)

        var intent = intent
        var errada = intent.getIntExtra("errada", errada)
        var certa = intent.getIntExtra("certa", certa)

        carregarElementos()

        btn_primeira2.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this,"Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ThirdQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_segunda2.setOnClickListener {
            certa = certa + 1
            Toast.makeText(this,"Parabéns!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ThirdQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_terceira2.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this,"Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ThirdQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_quarta2.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this,"Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ThirdQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }
    }

    fun carregarElementos(){
        btn_primeira2 = findViewById(R.id.btn_primeira2)
        btn_segunda2 = findViewById(R.id.btn_segunda2)
        btn_terceira2 = findViewById(R.id.btn_terceira2)
        btn_quarta2 = findViewById(R.id.btn_quarta2)
    }

}