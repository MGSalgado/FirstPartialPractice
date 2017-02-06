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
public class FirstPartialPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint a = new MyPoint(0,0);
        MyPoint b= new MyPoint(0,3);
        MyRectangle test1 =new MyRectangle(a,b);
        //MyCircle test2 =new MyCircle();
        
        System.out.println(test1.toString());
        System.out.println(test1.getPerimeter());
        System.out.println(test1.getType());

        
        //System.out.println(test2.toString());
        
    }
    
}
