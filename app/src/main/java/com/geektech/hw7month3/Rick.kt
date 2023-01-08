package com.geektech.hw7month3

import java.io.Serializable

data class Rick(
    var img: Int,
    var name: String? = "неизвестно",
    var aliveOrNot: AliveOrNot? = AliveOrNot.IDK

): Serializable
