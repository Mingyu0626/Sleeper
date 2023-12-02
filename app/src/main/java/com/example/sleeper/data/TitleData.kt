package com.example.sleeper.data

import android.os.Parcel
import android.os.Parcelable

data class TitleData (
    var TitleName: String = "꿈꾸는",
    var getCondition: String = "수면 측정 최초 1회 완료",
    var isUsing: Boolean = false
// 1이면 이벤트 아이템, 2이면 일정 아이템이 recyclerView에 추가되는 방식

)