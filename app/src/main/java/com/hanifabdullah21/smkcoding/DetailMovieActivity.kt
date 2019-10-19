package com.hanifabdullah21.smkcoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.hanifabdullah21.smkcoding.model.ResultsItem
import kotlinx.android.synthetic.main.activity_detail_movie.*

class DetailMovieActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        val movie =
            intent.getParcelableExtra<ResultsItem>("movie")

        tv_title_movie.text = movie.title
        tv_rating_movie.text = "Rating : ${movie.popularity}"
        tv_description_movie.text = movie.overview
        Glide.with(this).load("https://image.tmdb.org/t/p/w500"+movie?.posterPath).into(iv_poster_movie)
    }
}
