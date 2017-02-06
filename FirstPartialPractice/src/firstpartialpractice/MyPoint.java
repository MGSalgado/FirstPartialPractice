/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialpractice;

import java.util.Arrays;

/**
 *
 * @author Miguel
 */
public class MyPoint {//Atributos
    private int x=0;
    private int y=0;
    
    public MyPoint(){//constructor sin parametros
        this.x=0;
        this.y=0;
    }
    public MyPoint(int x, int y){//constructor recibiendo x,y
        this.x=x;
        this.y=y;
    }//Getters y seterrs
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getY(){
        return this.y;
    }
    public void setY(int y){
        this.y=y;
    }
    public int [] getXY(){
        int [] array= new int [2];
        array[0]=this.x;
        array[1]=this.y;
        return  array;
    }
    
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }//metodo para devolver resultado
    @Override
    public String toString(){
        return "(x,y)";
    }//metodo para calcular distancia entre dos puntos
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x),2)+Math.pow((this.y-y),2));
    }
    //metodo para deolver distancia entre dos objetos "MyPoint"
    public double distance(MyPoint another){
      return Math.sqrt(Math.pow((this.x-another.x),2)+Math.pow((this.y-another.y),2));
    }

    public double distance(){
        return Math.sqrt(Math.pow((this.x-0),2)+Math.pow((this.y-0),2));
    }
    
}
