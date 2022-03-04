package com.prj.happyperson.domain.fesitval

import android.content.Context
import com.prj.happyperson.data.Festival
import com.prj.happyperson.util.api.SeoulApiClient
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FestivalRepository : FestivalDataSource {
    val key = "7a727869426d7331363674684f7072"
    override fun getAllFestival(): Single<MutableList<Festival>> {
        return SeoulApiClient.getApi()
            .getAllFestival(key,1,5)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { it }
    }

    override fun getSelectFestival(year: String): Single<MutableList<Festival>> {
        TODO("Not yet implemented")
    }

}