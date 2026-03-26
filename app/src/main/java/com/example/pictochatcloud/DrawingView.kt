package com.example.pictochatcloud
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
//Allows Android OS to recognize this class as a visual element that can be sized and drawn on
class DrawingView(context:Context, attrs:AttributeSet):View(context,attrs){
private val currentPath = Path() //Memory for current Drawing
    private val drawPaint = Paint().apply{ //Brush definitions (Adjust as needed)
        color = Color.BLACK
        style = Paint.Style.STROKE
        strokeJoin = Paint.Join.ROUND
        strokeCap = Paint.Cap.ROUND
        strokeWidth = 12f
        isAntiAlias = true
    }
    //Force injecting our custom path to the OS for Path Tracking and Paint rendering logic
    override fun onDraw(canvas:Canvas){
        super.onDraw(canvas)
        canvas.drawPath(currentPath, drawPaint)
    }

}
