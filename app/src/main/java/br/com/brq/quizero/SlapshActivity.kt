package br.com.brq.quizero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

lateinit var handler: Handler

class SlapshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slapsh)

        //Tirando a Action Bar
        supportActionBar?.hide()

        //Chamando a tela name dentro de 3 segundos para abrir outra tela
        handler = Handler()

        handler.postDelayed({
            val intent = Intent(this, NameActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)

    }
}
