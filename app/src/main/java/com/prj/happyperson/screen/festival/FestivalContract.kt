package com.prj.happyperson.screen.festival

import com.prj.happyperson.base.BasePresenter
import com.prj.happyperson.base.BaseView
import com.prj.happyperson.data.Festival

interface FestivalContract {

    interface Presenter : BasePresenter<View> {
        fun getAllFestival()
    }

    interface View : BaseView {
        fun showProgress()
        fun hideProgress()
        fun setItems(items : MutableList<Festival>)
    }

}