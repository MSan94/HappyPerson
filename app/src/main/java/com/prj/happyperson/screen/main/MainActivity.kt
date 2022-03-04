package com.prj.happyperson.screen.main

import android.content.Intent
import android.os.Bundle
import com.prj.happyperson.base.BaseActivity
import com.prj.happyperson.custom.CustomView
import com.prj.happyperson.databinding.ActivityMainBinding
import com.prj.happyperson.screen.festival.FestivalActivty

class MainActivity : BaseActivity(), MainContract.View {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private var presenter : MainPresenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initView()
        initPresenter()
    }

    override fun initView() {

        val customView = CustomView(this)
        binding.test.addView(customView)

        binding.btnFestival.setOnClickListener {
            val intent = Intent(this,FestivalActivty::class.java)
            startActivity(intent)
        }

    }

    override fun initPresenter() {
        presenter = MainPresenter()
        presenter?.takeView(this)
    }

    override fun onDestroy() {
        presenter?.dropView()
        super.onDestroy()
    }
}