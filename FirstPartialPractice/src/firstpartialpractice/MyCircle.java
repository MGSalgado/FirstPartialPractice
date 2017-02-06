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
public class MyCircle {//Atributos
    private MyPoint center;
        private int radius=1;
    
    public MyCircle(){//Constructor, no recibe nada
        this.center = new MyPoint(0,0);
    }
    
    public MyCircle(int x, int y, int radius){//Constructor, recibe x, y , radio
        this.center= new MyPoint(x,y);
        this.radius=radius;
    }
    public MyCircle(MyPoint center, int radius){//Constructor recibe un centro desde un objeto MyPoint y un radio
        this.center=center;
        this.radius=radius;
    }
    //getters y setters
    public int getRadius(){
        return this.radius;
    }
    public void setRadius(int radius){
        this.radius=radius;
    }
    public MyPoint getCenter(){
        return this.center;
    }
    public void setCenter(MyPoint center){
        this.center=center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterY(int y){
       this.center.setY(y);
    }
    public int [] getCenterXY(){
        return this.center.getXY();
    }
    public void setCenterXY(int x, int y){
        this.center.setXY(x, y);
    }
    //Metodo para devolver resultados
    @Override
    public String toString(){
       return "MyCircle[radius="+this.radius+", center=("+this.center.getX()+
               ", "+this.center.getY()+")]";
    }//metodo para sacar area
    public double getArea(){
        return Math.PI*this.radius*this.radius;
    }//metodo para sacar circunferencia
    public double getCircumference(){
        return Math.PI*2*this.radius;
    }//metodo para calcular distancia entre dos objetos MyCircle
    public double distance(MyCircle another){
        return this.center.distance(another.center);
    }
}
