/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */
//import javax.swing.*;
import java.util.Scanner;

public class PrimeNumbers {
    
    static void Primes(int cap){
        for(int i = 2;i <= cap;i++)
        {
           int count = 0;
           for(int j=i;j>0;j--)
           {
               if((i % j) == 0)
               {
                  count++;
               }
               if (count >= 3)
                   break;
           }
            if(count == 2)
            {
                System.out.print(i + " " );   
            }

        }
        
    }
    
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String cont = null;
        int input = 0;
        do{
            System.out.println("Enter a positive integer: ");
            input = in.nextInt();            
            System.out.print("The prime numbers from 2 to "+input+" are: ");
            Primes(input);
            System.out.println("\nWould you like to continue? (y/n)");
            cont = in.next();
        }while(cont.equals("y") || cont.equals("Y"));

    }
    
    
}
