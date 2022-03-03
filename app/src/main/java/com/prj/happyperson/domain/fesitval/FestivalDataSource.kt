package com.prj.happyperson.domain.fesitval

import com.prj.happyperson.data.Festival
import io.reactivex.Single


interface FestivalDataSource {

    fun getAllFestival() : Single<MutableList<Festival>>
    fun getSelectFestival(year : String) : Single<MutableList<Festival>>


}