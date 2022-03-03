package com.prj.happyperson.domain.fesitval

import android.content.Context
import com.prj.happyperson.data.Festival
import io.reactivex.Single

class FestivalRepository : FestivalDataSource {

    override fun getAllFestival(): Single<MutableList<Festival>> {
        TODO("Not yet implemented")
    }

    override fun getSelectFestival(year: String): Single<MutableList<Festival>> {
        TODO("Not yet implemented")
    }

}