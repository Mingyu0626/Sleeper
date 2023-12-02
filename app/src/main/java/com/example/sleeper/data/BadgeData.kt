package com.example.sleeper.data

import android.os.Parcel
import android.os.Parcelable

data class BadgeData(
    var badgeName: String = "측정 새내기",
    var getCondition: String = "수면 측정 최초 1회 완료",
    var isUsing: Boolean = false

)

