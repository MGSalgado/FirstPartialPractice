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
public class Date {//Atributos, de acuerdo al ppt no pide validación de datos
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){//Constructor, recibe 3 parametros
        this.day=day;
        this.month=month;
        this.year=year;
                   }
    //getters y setters
    public int getDay(){
        return this.day;
    }
    
    public int getMonth(){
        return this.month;
    }
    
    public int getYear(){
        return this.year;
    }
    
    public void setDay(int day){
        this.day=day;
    }
    public void setMonth(int month){
        this.month=month;
    }
    
    public void setYear(int year){
        this.year=year;
    }
    public void setDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }
    //Metodo para devolver fecha
    @Override
    public String toString(){
       /*if(day<10&&month<10){
            return "0"+this.day+"/0"+this.month+"/"+this.year;
        }
                if(day<10&&month>10){
            return "0"+this.day+"/"+this.month+"/"+this.year;
        }
                if(day>10&&month<10){
            return +this.day+"/0"+this.month+"/"+this.year;
        }
        if(day>10&&month>10){
            return +this.day+"/"+this.month+"/"+this.year;
        }else{return "Blah";}*/
        return String.format("%02d", this.day)+"/"
                + String.format("%02d", this.month)+"/"
                + String.format("%04d",this.year);

        }
    }
