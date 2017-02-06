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
public class Book {//Atributos
    private String name;
    private Author author;
    private double price;
    private int qty=0;
    
    public Book(String name, Author author, double price){//Constructor, recibe 3 atributos
        this.name=name;
        this.author=author;
        this.price=price;
    }
    
    public Book(String name, Author author, double price, int qty){//Constructor recibe 3+1 atributos
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    //Getters y setters
    public String getName(){
        return this.name;
    }
    
    public Author getAuthor(){
        return this.author;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setQty(int qty){
        this.qty=qty;
    }
    //Metodo para devolver resultados
    @Override
    public String toString(){
        return "Book[name= "+this.name+
                ", Author[name= "+author.getName()+
                ", email= "+author.getEmail()+
                ", gender= "+author.getGender()+"], price= "+
                this.price+", qty= "+this.qty+"]";
                
                
                
                
    }
}
