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
public class Employee { //Atributos
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    
    
    public Employee(int id, String firstName,String lastName, int salary){ //Constructor, recibe 3+1 argumentos
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.salary=salary;
    }
    //getters and setters
    public int getID(){
        return this.id;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String getName(){
        return this.firstName+" "+this.lastName;
    }
    
    public int getSalary(){
        return this.salary;
    }
    
    public void setSalary(int salary){
        this.salary=salary;
    }
    
    public int getAnnualSalary(){//getter para saber el salario anual
        return salary*12;
    }
    //Metodo para aumentar salario
    public int raiseSalary(int percent){
        this.salary=(percent+100)*salary/100;
        return this.salary;
    }//Metodo para devolver resultados
    @Override
    public String toString(){
        return "Employee(id= "+id+", name="+firstName+" "+lastName+", salary= "+salary+")";
    }
}
