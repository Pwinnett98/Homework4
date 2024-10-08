package com.example.homework4.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Superhero(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    @StringRes val description: Int,
    @StringRes val vuln: Int,
    @StringRes val vulndetail: Int
)