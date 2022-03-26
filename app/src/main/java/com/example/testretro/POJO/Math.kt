package com.example.testretro.POJO

import com.google.gson.annotations.Expose

import com.google.gson.annotations.SerializedName


class Example(
    @SerializedName("match_id")
    @Expose
    val matchId: Int,

    @SerializedName("first_blood_time")
    @Expose
    val firstBloodTime: Int,

    @SerializedName("radiant_win")
    @Expose
    val radiantWin: Boolean,

    @SerializedName("version")
    @Expose
    val version: Int,

    @SerializedName("players")
    @Expose
    val players: List<Player>
)