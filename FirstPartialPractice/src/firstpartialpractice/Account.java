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
public class Account {//Atributos
    private String id;
    private String name;
    private int balance;
    
    public Account(String id, String name){//Constructor recibe 2 atributos
        this.id=id;
        this.name=name;
        balance=0;
    }
    public Account(String id, String name, int balance){//Constructor recibe 3 atributos
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    //Getters y setters
    public String getID(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getBalance(){
        return this.balance;
    }
    //metodo credi, suma al balance el amount
    public int credit(int amount){
        this.balance=this.balance+amount;
        return this.balance;
        
    }
    //metodo debit resta al balance el amount
    public int debit(int amount){
        if(amount<=this.balance){
            this.balance=this.balance-amount;
        }else{System.out.println("Amount exceeded balance");
                }return balance;
    }//Metodo transfer, transfiere una cantidad de una cuenta a otra
    public int transfer(Account another, int amount){
        if(amount<=this.balance){
            another.credit(amount);
        }else{
            System.out.println("Amount exceeded balance");
        }return this.balance;}
    //Devuelve resultados
    @Override
    public String toString(){
        return "Account[id= "+this.id+", name= "+this.name+", balance= "+this.balance+"]";
    }
   
}
