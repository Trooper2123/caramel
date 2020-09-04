package br.com.tereza.carameloftheday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_cookie.*

class DogActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cookie)
        supportActionBar?.hide()


        var caramelImageView: ImageView = findViewById(R.id.caramelImage)

        val caramel = arrayListOf(
            R.drawable.tenor,
            R.drawable.capa,
            R.drawable.dog_1,
            R.drawable.dog_2,
            R.drawable.dog_3,
            R.drawable.dog_4,
            R.drawable.dog_5,
            R.drawable.dog_6,
            R.drawable.dog_7,
            R.drawable.dog_8,
            R.drawable.dog_9,
            R.drawable.dog_10
        )

        giveCookieButton.setOnClickListener {
            val n : Int = caramel.lastIndex
            val randomNumber = (0..n).random()


            caramelImageView.setImageResource(caramel[randomNumber]);

        }

        noMoreButton.setOnClickListener {
            val mIntent = Intent(this, SplashActivity::class.java)
            startActivity(mIntent)
        }
    }
}