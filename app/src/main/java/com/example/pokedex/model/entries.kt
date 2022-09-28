package com.example.pokedex.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class entries(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)
