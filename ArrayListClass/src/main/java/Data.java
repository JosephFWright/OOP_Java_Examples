/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */

import java.util.ArrayList;
import java.util.Scanner;
        
public class Data {
   private static ArrayList<Integer> numbers;
   private static Scanner in = new Scanner(System.in);
   
    public Data()
    {
        numbers = new ArrayList<Integer>();
    }
  
    static int Display_Menu()
    {
        int input = 999;
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("       Main Menu        ");
            System.out.println("0 - Quit");
            System.out.println("1 - Input Numbers");
            System.out.println("2 - Display Numbers");
            System.out.println("3 - Search Numbers");
            System.out.println("4 - Delete Numbers");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
            
            input = in.nextInt();
            if (input > 4)
            {
                System.out.println("Invalid Option");
                Display_Menu();
            }
                
        return input;
    }
    
    static void Input_Numbers()
    {
        int size;
        System.out.println("     Input Numbers     ");
        System.out.println("-----------------------\n");
        System.out.println("How many numbers would you like to input?");
        size = in.nextInt();
        for(int i = 0;i < size;i++)
        {
            System.out.println("Enter number "+i+" -> ");
            numbers.add(in.nextInt());
        }
        return;
    }
    
    static void Display_Numbers()
    {
        System.out.println("    Display Numbers     ");
        System.out.println("-----------------------\n");
        for(int i : numbers)
        {
            System.out.println(i);
        }
    }
    
    static int Search_Numbers()
    {
        System.out.println("    Search Numbers     ");
        System.out.println("-----------------------\n");
        System.out.println("Which number would you like to search for? ");
        int searchNum = in.nextInt();
        int find = numbers.indexOf(searchNum);
        if(find == -1)
        {
            System.out.println("Number was not found!");
            return -1;
        }
        System.out.println(searchNum+" was found at position number "+find);        
        return 0;
    }
    
    static void Delete_Numbers()
    {
        System.out.println("   Delete Numbers     ");
        System.out.println("-----------------------\n");
        System.out.println("Which number would you like to delete? ");
        int searchNum = in.nextInt();
        int find = numbers.indexOf(searchNum);
        if(find == -1)
        {
            System.out.println("Number was not found!");
            return;
        }
        numbers.remove(find);
        System.out.println(searchNum+" was erased at position number "+find);        
        
    }
    
    
    public static void main(String[] args){
        Data dat = new Data();
        int switchNum = Display_Menu();
        do{
            switch(switchNum)
            {
                case 1:
                        Input_Numbers();
                        switchNum = Display_Menu();
                        break;
                case 2:
                        Display_Numbers();
                        switchNum = Display_Menu();
                        break;
                case 3:
                        Search_Numbers();
                        switchNum = Display_Menu();
                        break;
                case 4: 
                        Delete_Numbers();
                        switchNum = Display_Menu();
                        break;
                case 999:
                        System.out.println("You did not enter a valid number!");
                        switchNum = Display_Menu();
                        break;
            }
        }while(switchNum != 0);
        System.out.println("Bye!");
    }
}
