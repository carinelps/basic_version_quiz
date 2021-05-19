package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

    lateinit var btn_primeira3 : Button
    lateinit var btn_segunda3 : Button
    lateinit var btn_terceira3 : Button
    lateinit var btn_quarta3 : Button

class ThirdQuestion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_question)

        var intent = intent
        var errada = intent.getIntExtra("errada", errada)
        var certa = intent.getIntExtra("certa", certa)

        carregarElementos()

        btn_primeira3.setOnClickListener {
            certa = certa + 1
            Toast.makeText(this, "Parabéns!!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FourthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_segunda3.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FourthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_terceira3.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FourthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }

        btn_quarta3.setOnClickListener {
            errada = errada + 1
            Toast.makeText(this, "Ops :(", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, FourthQuestion::class.java)
            intent.putExtra("certa", br.com.brq.quizero.certa)
            intent.putExtra("errada", br.com.brq.quizero.errada)
            startActivity(intent)
            finish()
        }
    }



    fun carregarElementos() {
        btn_primeira3 = findViewById(R.id.btn_primeira3)
        btn_segunda3 = findViewById(R.id.btn_segunda3)
        btn_terceira3 = findViewById(R.id.btn_terceira3)
        btn_quarta3 = findViewById(R.id.btn_quarta3)
    }

}