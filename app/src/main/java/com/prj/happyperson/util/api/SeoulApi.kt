package com.prj.happyperson.util.api

import com.prj.happyperson.data.Festival
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface SeoulApi {

    /**
     * 모든 박람회 불러오기
     */
    @GET("{KEY}/json/JobFairInfo/{START_INDEX}/{END_INDEX}/")
    fun getAllFestival(
        @Path("KEY") key : String,
        @Path("START_INDEX") start_Index : Int,
        @Path("END_INDEX") end_Index : Int
    ) : Single<MutableList<Festival>>

}