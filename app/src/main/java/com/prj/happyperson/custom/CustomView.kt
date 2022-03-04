package com.prj.happyperson.custom

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomView : View {
    private var myShapeColor : Int? = null
    // 코드에서 View 객체를 생성할 때 주로 호출하는 생성자
    constructor(context : Context?) : super(context)

    // 레이아웃 xml에 등록한 View가 안드로이드에 의해 inflate될 때 호출되는 생성자
    // 매개변수 AttributeSet 객체를 통해 attrs.xml에 정의한 커스텀 속성 사용 가능
    constructor(context: Context?, attrs:AttributeSet?) : super(context, attrs)


    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val paint = Paint()
        paint.color = Color.GREEN
        paint.style = Paint.Style.FILL
        canvas?.drawCircle(200f,200f,150f,paint)

    }
}