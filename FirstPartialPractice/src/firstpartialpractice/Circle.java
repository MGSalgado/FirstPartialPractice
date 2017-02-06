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
public class Circle { //Atributos
    private double radius;
    
    public Circle(){ //Constructor 1
        this(1.0);
    }
    
    public Circle(double radius){ //Constructor 2, recibe radio como parametro
        this.radius=radius;
    }
    //getters and setters
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(){
        this.radius=radius;
    }
    //metodo para dar area
    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }
    //metodo para calcular circunferencia
    public double getCircumference(){
        return Math.PI*2*this.radius;
    }
    //metodo para devolver resultados
    @Override
    public String toString(){
        return "Circle(radius="+this.radius+")";
    }
}

