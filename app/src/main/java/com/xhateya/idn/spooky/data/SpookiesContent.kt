package com.xhateya.idn.spooky.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class SpookiesContent(
    var title : String = "",
    var review : String = " ",
    var stories : String = " ",
    var picture : Int = 0
): Parcelable
