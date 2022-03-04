package com.prj.happyperson.screen.festival

import android.os.Bundle
import android.util.Log
import android.view.View
import com.prj.happyperson.base.BaseActivity
import com.prj.happyperson.data.Festival
import com.prj.happyperson.databinding.ActivityFestivalBinding

class FestivalActivty : BaseActivity(), FestivalContract.View{

    private val binding by lazy { ActivityFestivalBinding.inflate(layoutInflater) }
    private var presenter : FestivalPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initPresenter()

        presenter?.getAllFestival()
    }


    override fun initView() {
    }

    override fun initPresenter() {
        presenter = FestivalPresenter()
        presenter?.takeView(this)
    }


    override fun showProgress() {
        binding.progressBar.visibility = View.VISIBLE
    }

    override fun hideProgress() {
        binding.progressBar.visibility = View.GONE
    }

    override fun setItems(items: MutableList<Festival>) {
        hideProgress()
        for(i in 0 until items.size){
            Log.d("TestData", "${items[i].toString()}")
        }
    }


    override fun onDestroy() {
        presenter?.dropView()
        super.onDestroy()
    }
}