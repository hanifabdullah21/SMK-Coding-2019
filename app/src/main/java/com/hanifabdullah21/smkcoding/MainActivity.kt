package com.hanifabdullah21.smkcoding

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation: AnimationDrawable = cl_container.background as AnimationDrawable
        animation.setEnterFadeDuration(6000)
        animation.setExitFadeDuration(2000)
        animation.start()

        btn_list_movie.onClick {
//            val intent =
//                Intent(this@MainActivity, ListMovieActivity::class.java)
//            startActivity(intent)
            startActivity(intentFor<ListMovieActivity>())
        }
    }

}
