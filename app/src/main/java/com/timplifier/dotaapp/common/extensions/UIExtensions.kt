package com.timplifier.dotaapp.common.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide

fun ImageView.loadImageWithGlide(url: String) = Glide.with(this).load(url).into(this)
