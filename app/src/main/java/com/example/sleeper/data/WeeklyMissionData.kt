package com.example.sleeper.data

data class WeeklyMissionData(
    var name: String = "6시간 이상 자기",
    var goal: Int = 3,
    var current: Int = 0,
    var rewardExp: Int = 0,
    var isComplete: Boolean = false
)
