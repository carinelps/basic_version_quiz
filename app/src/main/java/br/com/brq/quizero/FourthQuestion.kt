package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

    lateinit var btn_primeira4 : Button
    lateinit var btn_segunda4 : Button
    lateinit var btn_terceira4 : Button
    lateinit var btn_quarta4 : Button


class FourthQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_question)

        var intent = intent
        var errada = intent.getIntExtra("errada", errada)
        var certa = intent.getIntExtra("certa", certa)

        carregarElementos()

        btn_primeira4.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FifthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_segunda4.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FifthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_terceira4.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FifthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_quarta4.setOnClickListener {
            certa = certa + 1
            Toast.makeText(this, "Parabéns!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FifthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }
    }



    fun carregarElementos() {
        btn_primeira4 = findViewById(R.id.btn_primeira4)
        btn_segunda4 = findViewById(R.id.btn_segunda4)
        btn_terceira4 = findViewById(R.id.btn_terceira4)
        btn_quarta4 = findViewById(R.id.btn_quarta4)
    }

}