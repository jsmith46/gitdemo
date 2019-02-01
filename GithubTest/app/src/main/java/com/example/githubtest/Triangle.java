package com.example.githubtest;
/**
 * Created by Team 15 on 01/30/2019
 */

public abstract class Triangle extends Shape {
	private String color;
	private int sideLength;
	private void Triangle(){
		color = black;
	}
	public getSideLength(){
		return sideLength;
	}
    public setSideLength(int a){
		sideLength = a;
	}
}
