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
public class Book2 {//Atributos
    private String name;
    private Author [] authors;
    private double price;
    private int qty = 0;
    
    public Book2(String name, Author [] authors, double price){//constructor
        this.name=name;
        this.authors=authors;
        this.price=price;
    }
    public Book2(String name, Author[] authors, double price, int qty){//Constructor
        this.name=name;
        this.authors=authors;
        this.price=price;
        this.qty=qty;
    }//Getters y setters
    public String getName(){
        return this.name;
    }
    
    public Author[] getAuthors(){
        return this.authors;
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
    }//metodo para devolver resultados, aqui hubo falla :/
    @Override
    /*public String toString(){
        return "Book[name= "+this.name+", authors= {Author[name= "+
                authors.name+", email= "+authors.email+", gender= "+
                authors.gender+"],...}, price= "+this.price+
                ", qty= "+this.qty+"]";
    }
    
    public String getAuthorNames(){
        return 
    }
}
