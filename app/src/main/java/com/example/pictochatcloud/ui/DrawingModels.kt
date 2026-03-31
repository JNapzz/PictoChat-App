package com.example.pictochatcloud.ui

data class Point(
    val x:Float = 0f, //Create an x-coord using 32 bit float numbers
    val y:Float = 0f  //Create an y-coord using 32 bit float numbers
)
data class Stroke(  //Creates a class containing the point coords and puts them into an empty array
    val points: List<Point> = emptyList(), //Creating variable for the array
    val color: Int = 0xFF000000.toInt(),    //Creating variable for the color of the line drawn
    val strokeWidth: Float = 8f     //Creating variable for thickness of line drawn
)

//Everything here is just data points to be used in DrawingView.kt and references for future uses