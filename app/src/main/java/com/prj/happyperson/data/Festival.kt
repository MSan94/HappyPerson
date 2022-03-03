package com.prj.happyperson.data

import com.google.gson.annotations.SerializedName

data class Festival(
    @SerializedName("JOBFAIR_NAME") val jobfair_Name : String?, //행사명
    @SerializedName("JOBFAIR_YEAR") val jobfair_Year : String?, //박람회 년도
    @SerializedName("JOBFAIR_TURN") val jobfair_Turn : String?, //박람회 회차
    @SerializedName("JOBFAIR_DATE") val jobfair_Date : String?, //행사 일자
    @SerializedName("JOBFAIR_FRTIME") val jobfair_Frtime : String?, //행사시작 시간
    @SerializedName("JOBFAIR_EDTIME") val jobfair_Edtime : String?, //행사종료 시간
    @SerializedName("JOBFAIR_LOCATION") val jobfair_Location : String?, // 행사장소
    @SerializedName("JOBFAIR_URL") val jobfair_Url : String?, //약도 url
    @SerializedName("GUIDE_IMG") val jobfair_Img : String?, //안내 이미지
    @SerializedName("GUIDE_INTRO") val jobfair_Intro : String? //안내 내용
)
