package com.prj.happyperson.screen.main

import android.os.Bundle
import com.prj.happyperson.R
import com.prj.happyperson.base.BaseActivity

class MainActivity : BaseActivity(), MainContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}