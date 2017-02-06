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
public class MyRectangle {//Atributos
    private MyPoint nwc;
    private MyPoint sec;
    
    public MyRectangle(int x1, int y1, int x2, int y2){//constructor a partir de vertices
        x1=0;
        y1=0;
        x2=0;
        y2=0;
    }
    
    public MyRectangle(MyPoint nwc, MyPoint sec){//Constructor a partir de 2 objetos MyPoint
        this.nwc=nwc;
        this.sec=sec;
    }
    //getters y setters
    public MyPoint getNWC(){
        return this.nwc;
    }
    
    public void setNWC(MyPoint nwc){
        this.nwc=nwc;
    }
    
    public MyPoint getSEC(){
        return this.sec;
    }
    public void setSEC(MyPoint sec){
        this.sec=sec;
    }
    
}
