package com.prj.happyperson.screen.festival

import android.annotation.SuppressLint
import com.prj.happyperson.domain.fesitval.FestivalRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class FestivalPresenter : FestivalContract.Presenter {

    private var view : FestivalContract.View? = null
    private val festivalRepository = FestivalRepository()

    @SuppressLint("CheckResult")
    override fun getAllFestival() {
        view?.showProgress()
        festivalRepository.getAllFestival()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe{ items ->
                view?.setItems(items)
            }
    }

    override fun takeView(view: FestivalContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}