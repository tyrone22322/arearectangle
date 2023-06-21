package com.mycompany.arearectangle;

import java.util.Scanner;

public class Arearectangle  {
    private int length;
    private int width;
    private int area;
    private int perimeter; 

    
    public static void main(String[] args) {
        Arearectangle rectangle = new Arearectangle();
        rectangle.getRectangleDimensions();
        rectangle.computeAreaAndPerimeter();
        rectangle.displayAreaAndPerimeter();
}

     public void getRectangleDimensions(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the length of the rectangle");
        length = scanner.nextInt();
        
        System.out.print("Enter the width of the rectangle");
        width = scanner.nextInt();
    }
    
    public void computeAreaAndPerimeter(){
    area = length * width;
    perimeter = 2 * (length + width);        
    }
    
    public void displayAreaAndPerimeter(){
    System.out.println("Area" + area);
    System.out.println("Perimeter" + perimeter);    
    } 
    
}

