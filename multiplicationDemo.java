/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication_demo;

/**
 *
 * @author Abbie
 */
public class Multiplication_demo {

    // command line arguments
    public static void main(String[] args) {
        // declare three integers and assign their values
        int first_number, second_number, product;
        first_number = 53;
        second_number = 12;
        // "product" is the product of the first two numbers
        product = first_number * second_number;
        
        // print first and second numbers with assigned values
        System.out.println("First number = " + first_number + ".");
        System.out.println("Second number = " + second_number + ".");
       
        // print arithmetic operation and product
        System.out.println("53 * 12 = " + product);
        System.out.println("Thus, the answer is " + product + ".");
    }
    
}
