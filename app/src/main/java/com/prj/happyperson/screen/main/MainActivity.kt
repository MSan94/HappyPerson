package com.prj.happyperson.screen.main

import android.os.Bundle
import com.prj.happyperson.R
import com.prj.happyperson.base.BaseActivity
import com.prj.happyperson.databinding.ActivityMainBinding

class MainActivity : BaseActivity(), MainContract.View {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    override fun initView() {

        binding.btnFestival.setOnClickListener {
//
        }

    }

    override fun initPresenter() {

    }


}