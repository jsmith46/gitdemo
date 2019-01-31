package com.example.githubtest;
/**
 * Created by Team 15 on 01/30/2019
 */

public abstract class Shape {

    private int  x;

    private int y;

    private String colour="red";

    public void Shape(){

        x = 0;
        y = 0;

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
