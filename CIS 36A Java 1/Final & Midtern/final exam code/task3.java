/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

class numbers{
    public int numbers(int number) {
        int n = number;
        
        if(n == 100) {
            System.out.println(n + "\n");
            return 0;
        } else {
            System.out.println(n + "\n");
            return numbers(n + 1);
        }
    }
}

public class task3 {

    public static void main(String[] args) {
        numbers sample = new numbers();
        sample.numbers(89);
    }
    
}
