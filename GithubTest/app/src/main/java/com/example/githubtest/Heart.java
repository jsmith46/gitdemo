package com.example.githubtest;

/**
* Created by eisha on 1/31/19
*/

public class Heart extends Shape {

    private int height;
    private int width;
    private int kawaii;

    public void Heart() {
        height = 0;
        width = 0;
        kawaii = 100;

    }

    public void setHeight(int h){
        height = h;

    }

    public int getHeight(){
        return height;
        
    }

    public void setWidth(int w){
        width = w;

    }

    public int getWidth(){
        return width;

    }

    public void setKawaii(int k){
        kawaii = k;

    }

    public int getHeight(){
        return kawaii;

    }


}
