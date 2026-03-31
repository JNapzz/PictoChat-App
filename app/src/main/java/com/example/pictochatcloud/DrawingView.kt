package com.example.pictochatcloud
import com.example.pictochatcloud.ui.Point
import com.example.pictochatcloud.ui.Stroke
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import android.view.MotionEvent
//Allows Android OS to recognize this class as a visual element that can be sized and drawn on
class DrawingView(context:Context, attrs:AttributeSet):View(context,attrs){
    private var activeStroke:Stroke? = null
    //Like short term RAM, holds the exact line thats being drawn in the moment
    private val completedStrokes = mutableListOf<Stroke>()
    //Like a hard drive, holds the ever growing list of lines created since opening the app

    override fun performClick():Boolean {
        super.performClick()
        return true
    }
    //Accessibility for Android standards
    override fun onTouchEvent(event:MotionEvent): Boolean{
        val touchX = event.x
        val touchY = event.y
        //Creates the X/Y coords when the screen is touched and inputs those points
        // into Point and Stroke blueprints and saves it to the memory banks
        when(event.action){
            MotionEvent.ACTION_DOWN-> {
                //TODO: Logic to start a new stroke gesture goes here
                val startingPoint = Point(touchX,touchY)
                activeStroke = Stroke(
                    points = listOf(startingPoint),
                    color = 0xFF000000.toInt(),
                    strokeWidth = 8f
                )
            }
            MotionEvent.ACTION_MOVE -> {
                //TODO: Logic to add points to the current stroke
                activeStroke?.let { stroke->
                    val newPoint = Point(touchX,touchY)
                    activeStroke = stroke.copy(points = stroke.points + newPoint)
                }
            }
            MotionEvent.ACTION_UP -> {
                //TODO: Logic to finalize the stroke goes here
                activeStroke?.let{stroke ->
                    completedStrokes.add(stroke)
                }
                activeStroke = null
                performClick()
            }
            else-> {
                //Do nothing, just ignore unhandled touch states
            }
        }
        invalidate()
        return true
    }
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
