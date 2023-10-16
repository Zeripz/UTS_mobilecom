package com.example.uts_mobilecom.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class MataKuliah(
    @StringRes val matkulR: Int,
    @StringRes val sksR : Int,
    @DrawableRes val imageR: Int
)