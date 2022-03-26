package com.example.testretro.POJO

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName

class Player(
    @SerializedName("match_id")
    @Expose
    val matchId: Int,

    @SerializedName("account_id")
    @Expose
    val accountId: Int,

    @SerializedName("assists")
    @Expose
    val assists: Int,

    @SerializedName("hero_id")
    @Expose
    val heroId: Int,

    @SerializedName("kills")
    @Expose
    val kills: Int,

    @SerializedName("level")
    @Expose
    val level: Int,

    @SerializedName("tower_damage")
    @Expose
    val towerDamage: Int
)