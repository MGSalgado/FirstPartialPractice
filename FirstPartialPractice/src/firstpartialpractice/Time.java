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
public class Time {//Parametros, de acuerdo a la ppt no pide validación de datos
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second){//Constructor
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //Getters and setters
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void setHour(int hour){
        this.hour=hour;
    }
    public void setMinute(int minute){
        this.minute=minute;
    }
    public void setSecond(int second){
        this.second=second;
    }
    public void setTime(int hour, int minute, int second){
        this.hour=hour;
        this.minute=minute;
        this.second=second;
    }
    //metodo para devolver hora
    @Override
    public String toString(){
        return String.format("%02d", this.hour)+":"
                + String.format("%02d", this.minute)+":"
                + String.format("%02d",this.second);
                    }
    
    //Aqui hubo falla y no supe hacer estos dos metodos :/
    public void nextSecond(){

    }
    
    public void previousSecond(){  
    }
    
    }
            