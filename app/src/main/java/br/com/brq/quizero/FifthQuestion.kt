package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

    lateinit var btn_primeira5 : Button
    lateinit var btn_segunda5 : Button
    lateinit var btn_terceira5 : Button
    lateinit var btn_quarta5 : Button

class FifthQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_question)

        var intent = intent
        var errada = intent.getIntExtra("errada", errada)
        var certa = intent.getIntExtra("certa", certa)

        carregarElementos()

        btn_primeira5.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_segunda5.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_terceira5.setOnClickListener {
            certa = certa + 1
            Toast.makeText(this, "Parabéns!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_quarta5.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

    }


    fun carregarElementos() {
        btn_primeira5 = findViewById(R.id.btn_primeira5)
        btn_segunda5 = findViewById(R.id.btn_segunda5)
        btn_terceira5 = findViewById(R.id.btn_terceira5)
        btn_quarta5 = findViewById(R.id.btn_quarta5)
    }

}