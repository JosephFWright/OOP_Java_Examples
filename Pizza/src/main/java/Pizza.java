
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
public class Pizza {
    
    private String size = "X";
    
    private int ham = 0;
    private int cheese = 0;
    private int pepp = 0;
    
    private double cost = 0.0;
    
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
    
    public Pizza()
    {
     size = "supersize";
     cheese = 999;
     ham = 999;
     pepp = 999;
     cost = 99.99;
    }
       
    public void set_cheese_toppings(int num)
    {
        this.cheese = num;
    }
    
    public void set_ham_toppings(int num)
    {
        this.ham = num;
    }
    
    public void set_pepp_toppings(int num)
    {
        this.pepp = num;
    }
    
    public void set_size(String str)
    {
        this.size = str;
    }
    
    public int get_toppings()
    {
        return (this.cheese + this.ham + this.pepp);
    }
    
    public double calc_Cost()
    {
        if(this.size.equals("Small"))
            cost = 10 + 2*get_toppings();
        else if(this.size.equals("Medium"))
                cost = 12 + 2*get_toppings();
        else if(this.size.equals("Large"))
                cost = 14 + 2*get_toppings();
        
       return cost;              
    }
    
    public String get_Description()
    {
        return "Size: "+this.size+" Cheese toppings: "+this.cheese+" Ham toppings: "+this.ham+" Pepperoni toppings: "+this.pepp+"\nCost: $"+calc_Cost()+"0";
    }
    
    public static void main(String[] args){
        
        double total = 0.0;
        
        Object[] sizes = {"Small","Medium","Large"};
        
        String str = JOptionPane.showInputDialog("How many pizzas would you like?");
        int pizzaCount=getInt(str);
        
    
        for(int i = 1;i <= pizzaCount;i++)
                {
                    Pizza newPizza = new Pizza();
                    //System.out.println("Pizza made!");
                    newPizza.set_size(JOptionPane.showInputDialog(null,"Which size pizza would you like?","Pizza Size",JOptionPane.QUESTION_MESSAGE,null,sizes,sizes[1]).toString());                       
                    newPizza.set_cheese_toppings(getInt(JOptionPane.showInputDialog("How many cheese toppings would you like?")));
                    newPizza.set_ham_toppings(getInt(JOptionPane.showInputDialog("How many ham toppings would you like?")));
                    newPizza.set_pepp_toppings(getInt(JOptionPane.showInputDialog("How many pepperoni toppings would you like?")));
                    JOptionPane.showMessageDialog(null, newPizza.get_Description(), "Pizza Order", JOptionPane.PLAIN_MESSAGE);
                    total += newPizza.calc_Cost();
                }
   
    JOptionPane.showMessageDialog(null,"Your total is: $"+total+"0", "Pizza Order",JOptionPane.PLAIN_MESSAGE);
    }
}
