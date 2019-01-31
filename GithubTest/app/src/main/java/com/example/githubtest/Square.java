package com.example.githubtest;

/**
* Created by jds1 on 1/30/19
*/

public class Square extends Shape {

    private int sidelength;

    public void Square() {
        sidelength = 0;

    }

    public void setSidelength(int side){
        sidelength = side;

    }

    public int getSidelength(){
        return sidelength;
        
    }
}
