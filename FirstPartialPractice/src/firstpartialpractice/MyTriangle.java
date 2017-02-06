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
public class MyTriangle {//atributos
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3){//constructor a partir de coordenadas
        x1=0;
        y1=0;
        x2=0;
        y2=0;
        x3=0;
        y3=0;
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){//constructor a partir de 3 objetos MyPoint
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    @Override//metodo para devolver resultados
    public String toString (){
        return "MyTriangle[v1= ("+v1.getX()+", "+v1.getY()+"), v2= ("+
                v2.getX()+", "+v2.getY()+"), v3= ("+v3.getX()+", "+
                v3.getY()+")]";
    }//metodo para sacar perimetro
    public double getPerimeter(){
        return v1.distance(v2)+v2.distance(v3)+v3.distance(v1);
    }
    //metodo para conocer el tipo de triangulo
    public String getType(){
        if(v1.distance(v2)==v2.distance(v3)&&v2.distance(v3)==v3.distance(v1)&&v3.distance(v1)==v1.distance(v2)){
            return "Equilateral";
        }
        if(v1.distance(v2)!=v2.distance(v3)&&v2.distance(v3)!=v3.distance(v1)&&v3.distance(v1)!=v1.distance(v2)){
            return "Escaleno";
        }else{return "Isosceles";}
    }
}
