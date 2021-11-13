package com.example.kotlin1hw2.extension

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.load(uri: String) {
    Glide.with(this).load(uri).into(this)
}