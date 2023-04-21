/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ir.rectanglemahdimokaripour;

/**
 *
 * @author mAAhdi
 */
public class Rectangle {
    
    private int width;
    private int length;
    
    public void setWidth(int width){
        this.width = width; 
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public int calculateArea(){
        return width*length;
    }
    
    public int calculatePrimeter(){
        return (width+length)*2;
    }

    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle();
        rect1.setLength(5);
        rect1.setWidth(3);
        
        System.out.println("Rectangle Area is::" + rect1.calculateArea());
        System.out.println("Rectangle Primeter is::" + rect1.calculatePrimeter());
    }
}
