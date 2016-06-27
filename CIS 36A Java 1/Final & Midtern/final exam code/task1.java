/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.util.Scanner;

class TaxRate{
    
    void print() {
        try {
            System.out.print("Please Enter Your TaxRate: ");
            Scanner input = new Scanner(System.in);
            Double tax = input.nextDouble();
            System.out.println("Income tax for a single person making $" + 
                    String.format("%.2f", tax) + " is " + String.format("%.2f", yourtax(tax)));
        } catch(Exception e) {
            System.out.println("Input Errors");
        }
    }
    
    public double yourtax(double newValue) {
        double tax = newValue;
        if(tax < 0) {
            System.out.println("You entered a neagtive value!");
        } 
        
        if(tax >= 0) {
            if(tax < 6001) {
                tax = tax * 0.10;
            }
            if((tax >= 6001) && (tax <= 27950)){
                tax = tax * 0.15;
            }
            if((tax >= 27951) && (tax <= 67700)){
                tax = tax * 0.27;
            }
            if((tax >= 67701) && (tax <= 141250)){
                tax = tax * 0.30;
            }
            if((tax >= 141251) && (tax <= 307050)){
                tax = tax * 0.35;
            }
            if(tax > 307051) {
                tax = tax * 0.386;
            }
        }
        return tax;
    }
       
    
}

public class task1 {

    public static void main(String[] args) {
        TaxRate t = new TaxRate();
        
        t. print();
    }
    
}
