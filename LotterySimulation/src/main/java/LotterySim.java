/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swjoe
 */
import javax.swing.*;
import java.util.Random;

public class LotterySim {
    
    static int getInt(String str, String position)
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
            str = JOptionPane.showInputDialog(null,"Please enter a valid "+position+" lottery number: ","(0-99)");
         
        }
        return value;
    }
    
    static int lotterySim(int num1,int num2,int num3)
    {
        int count = 0;
        Random rand = new Random();
        while(true)
        {
            int pick1 = rand.nextInt(100);
            int pick2 = rand.nextInt(100);
            int pick3 = rand.nextInt(100);
            count++;
            if(pick1==num1 && pick2==num2 && pick3==num3)
            {
                break;
            }
            
        }
        
        return count;
        
    }
    
    public static void main(String[] args){
    String str = JOptionPane.showInputDialog("Please enter your first lottery number: ","0-99");
    
    int num1=getInt(str,"1st");
    str = JOptionPane.showInputDialog("Please enter your second lottery number: ","0-99");
    int num2=getInt(str,"2nd");
    str = JOptionPane.showInputDialog("Please enter your third lottery number: ","0-99");
    int num3=getInt(str,"3rd");
    int attempts = lotterySim(num1,num2,num3);
    
    JOptionPane.showMessageDialog(null,"Your numbers of "+num1+", "+num2+", and "+num3+" took "+attempts+" tries to hit!", "Lottery Results",JOptionPane.PLAIN_MESSAGE);
    }
    
}
