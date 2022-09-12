/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */
import java.util.Arrays;
import static java.util.Arrays.*;

public class Exceptions {
    
    public static void main(String [] args)
    {
        int[] original = {3,4, 100, 1, 23};
             
        try{
            System.out.println("Original array: "+Arrays.toString(original));
            sort(original);
            System.out.println("Successful Sort: "+Arrays.toString(original));
            
        }
        catch(Exception e)
        {
            System.out.println("Error found: "+e);
            
        }
        try{
            System.out.println("Exceptional Case 1: fromIndex > to Index");
            sort(original,2,1);
            System.out.println("Successful Sort: "+Arrays.toString(original));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Error found: "+e);
            
        }
        try{
            System.out.println("Exceptional Case 2: fromIndex < 0 or toIndex > a.length");
            sort(original,-100,1);
            System.out.println("Successful Sort: "+Arrays.toString(original));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error found: "+e);
            
        }
    }
    
}
