package com.example.sleeper.data

data class SleepReportData(
    var month: Int = 11,
    var day: Int = 13,
    var yoil: String = "월",
    var time: String = "00:38",
    var numOfWakeUp: Int = 1,
    var shallowSleep: Int = 104,
    var deepSleep: Int = 147,
    var score: Int = 72
)