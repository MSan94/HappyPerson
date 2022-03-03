package com.prj.happyperson.base

interface BasePresenter<T> {

    fun takeView(view : T)
    fun dropView()

}