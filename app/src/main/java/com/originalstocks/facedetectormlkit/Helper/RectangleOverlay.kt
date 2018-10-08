package com.originalstocks.facedetectormlkit.Helper

import android.graphics.*

class RectangleOverlay internal constructor(overlayHelper: GraphicOverlayHelper,
                                            private val bound: Rect?) :GraphicOverlayHelper.Graphic(overlayHelper){

    private val rectPaint: Paint

    init {
        rectPaint = Paint()
        rectPaint.color = Color.CYAN
        rectPaint.strokeWidth = 4.0f
        rectPaint.style = Paint.Style.STROKE

        postInvalidate()

    }

    override fun draw(canvas: Canvas) {

        val rect = RectF(bound)
        rect.left = translateX(rect.left)
        rect.right = translateX(rect.right)
        rect.top = translateY(rect.top)
        rect.bottom = translateY(rect.bottom)

        canvas.drawRect(rect, rectPaint)


    }
}