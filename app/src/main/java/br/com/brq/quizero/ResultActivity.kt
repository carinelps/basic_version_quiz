package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

    lateinit var txtResult : TextView
    lateinit var btn_voltar : Button

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var intent = intent
        var errada = intent.getIntExtra("errada", errada)
        var certa = intent.getIntExtra("certa", certa)

        txtResult = findViewById(R.id.textView)
        btn_voltar = findViewById(R.id.btn_volta)

        txtResult.text = certa.toString() + "/5"

        btn_voltar.setOnClickListener({
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
        })


    }
}