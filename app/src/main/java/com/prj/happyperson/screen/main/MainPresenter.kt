package com.prj.happyperson.screen.main

class MainPresenter : MainContract.Presenter {

    private var view : MainContract.View? = null

    override fun takeView(view: MainContract.View) {
        this.view = view
    }

    override fun dropView() {
        view = null
    }
}