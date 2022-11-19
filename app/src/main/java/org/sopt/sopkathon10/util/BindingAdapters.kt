package org.sopt.sopkathon10.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("app:image")
fun ImageView.setImage(imageUrl: String) {
    this.load(imageUrl)
}