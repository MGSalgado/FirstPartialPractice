/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstpartialpractice;

/**
 *
 * @author Miguel
 */
public class Rectangle {//Atributos
    private float length;
    private float width;
    
    public Rectangle(){ //Primer constructor
        this.width=1.0f;
        this.length=1.0f;
    }
    
    public Rectangle(float length, float width){ //Segundo constructor, recibe 2 atributos, length y width
        this.length=length;
        this.width=width;
    }
    //Getters y Setters
    public float getLength(){
        return this.length;
    }
    
    public void setLength(float length){
        this.length=length;
    }
    
    public float getWidth(){
        return this.width;
    }
    
    public void setWidth(float width){
        this.length=width;
}
    
    //Metodo para obtener area
    public double getArea(){
        return this.length*this.width;
    }
    //Metodo para obtener perimetro
    public double getPerimeter(){
        return 2*this.length+2*this.width;
    }
    
    //Metodo para devolver resultados
    @Override
    
    public String toString(){
        return "Rectangle(length="+this.length+", width="+this.width+")";
    }

}