package com.example.githubtest;
/**
 * Created by Team 15 on 01/30/2019
 */

public abstract class Shape {

    private int  x;

    private int y;
    
    private int z;
	    
    private String color;

    private String color;

    public void Shape(){

        x = 0;
        y = 0;
        z = 0;
      
	    color = "white";
    }
    public void Shape(int x, int y, int z, String color){
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    public void setCoords(int a, int b){

        x = a;
        y = b;
    }

    public int[] getCoords(){
        int c[] = new int[2];
        c[0] = x;
        c[1] = y;
        return c;
    }
}
