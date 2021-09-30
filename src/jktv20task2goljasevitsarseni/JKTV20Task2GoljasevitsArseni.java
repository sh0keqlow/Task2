/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jktv20task2goljasevitsarseni;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class JKTV20Task2GoljasevitsArseni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println("Сумма цифр числа " +number +" равна "+((number%10)+((number/10)%10)+((number/100)%10)));
    }
    
}
