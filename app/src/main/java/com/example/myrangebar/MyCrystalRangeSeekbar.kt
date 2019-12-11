package com.example.myrangebar

import android.content.Context
import android.content.res.TypedArray
import android.util.AttributeSet
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar

class MyCrystalRangeSeekbar : CrystalRangeSeekbar {

    constructor(context: Context) : super(context)

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun getBarHeight(): Float {
        return 6.toFloat()
    }


    override fun getThumbWidth(): Float {
        return 36.toFloat()
    }

    override fun getThumbHeight(): Float {
        return 36.toFloat()
    }
    override fun getCornerRadius(typedArray: TypedArray?): Float {
        return 8.toFloat()
    }
}