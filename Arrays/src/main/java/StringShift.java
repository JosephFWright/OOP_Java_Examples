
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */
public class StringShift {
    
    static int getInt(String str)
    {
        int value = 100;
        
        while(true && value > 99)
        {
            try
            {
                value = Integer.parseInt(str);
                if (value < 100){
                    break;
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,str+" is not a valid number!","Error",JOptionPane.ERROR_MESSAGE);
            }
            str = JOptionPane.showInputDialog(null,"Please enter a valid number: ","(0-99)");
         
        }
        return value;
    }
    
    static void Shifter(String str, int shift)
    {
        String crypto = null;
        
        JOptionPane.showMessageDialog(null,"Shifted String: "+crypto, "Shifted String",JOptionPane.PLAIN_MESSAGE);
        return;
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String cont = null;
        int shift = 0;
        do{
            String str = str = JOptionPane.showInputDialog(null,"Please enter a string: ");
            shift = getInt(str);
            Shifter(str, shift);
            cont = JOptionPane.showInputDialog(null,"Would you like to continue?","Y or N");
        }while(cont.equals("y") || cont.equals("Y"));
        }
}
