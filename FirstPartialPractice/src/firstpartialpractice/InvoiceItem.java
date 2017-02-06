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
public class InvoiceItem {//Atributos
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    
    public InvoiceItem(String id, String desc, int qty, double unitPrice){//Constructor, recibe 3+1 parametros
        this.id=id;
        this.desc=desc;
        this.qty=qty;
        this.unitPrice=unitPrice;
    }
    //getters and setters
    public String getId(){
        return this.id;
    }
    
    public String getDesc(){
        return this.desc;
    }
    
    public int getQty(){
        return this.qty;
    }
    
    public void setQty(int qty){
        this.qty=qty;
    }
    
    public double getUnitPrice(){
        return this.unitPrice;
    }
    
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }
    //getter para saber total
    public double getTotal(){
        return this.unitPrice*this.qty;
    }//Metodo para devolver resultados
    @Override
    public String toString(){
        return "InvoiceItem[id= "+this.id+", desc= "+this.desc+", qty= "+this.qty+", unitPrice= "+this.unitPrice+"]";
    }
}
