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
public class Circle1 { //Atributos de la clase
    private double radius;
    private String color;
    
public Circle1(){ //Primer constructor
    radius=1.0;
    color="red";
    //this(1.0,"red");
}

public Circle1(double radius){ //Segundo Constructor, este recibe radio
    this.radius=radius;
    this.color="red";
    //this(radius,"red")
}

public Circle1(double radius, String color){ //Tercer Constructor, este recibe radio y color
    this.radius=radius;
    this.color=color;
}

public Circle1(String color){ //Cuarto constructor, este solo recibe color
    this.radius=1.0;
    this.color=color;
    //this(1.0,"red);
}
//Getters and setters

public double getRadius(){
    return this.radius;
}

public String getColor(){
    return this.color;
}

public void setRadius(double radius){
    this.radius=radius;
}

public void setColor(String color){
    this.color=color;
}
@Override
public String toString(){ //Metodo toString sobrecargado y listo para mostrar resultados
    /*
    Opcion larga
    String temp;
    temp ="Circle(radius= "+ this.radius + ", color= "+this.color+ ")";
    return temp;*/
    
    return "Circle(radius= "+ this.radius + ", color= "+this.color+ ")";
}

public double getArea(){ //Metodo para calcular área
    return Math.PI*this.radius*this.radius;
}

}
