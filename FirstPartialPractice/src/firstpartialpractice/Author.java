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
public class Author {//Atributos
    private String name;
    private String email;
    private char gender;
    
    public Author(String name, String email, char gender){//Constructor, recibe 3 parametros
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    //getters and setters
    public String getName(){
        return this.name;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return this.gender;
    }
    //metodo para devolver resultados
    @Override
    public String toString(){
        return "Author[name= "+this.name+", email= "+this.email+", gender= "+this.gender+"]";
    }
    
}
