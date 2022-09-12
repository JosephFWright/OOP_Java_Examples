/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */


public class Driver {
    public static void main(String[] args)
    {
        CashPayment cash1 = new CashPayment(50.5);
        System.out.println("Cash1 Details:");
        System.out.println(cash1.paymentDetails());
        
        CashPayment cash2 = new CashPayment(20.45);
        System.out.println("Cash2 Details:");
        System.out.println(cash2.paymentDetails());
        
        CreditCardPayment credit1 = new CreditCardPayment(10.5,"Fred Johnson",10,2010,55542035678L);
        System.out.println("Credit1 Details:");
        System.out.println(credit1.paymentDetails());
        
        CreditCardPayment credit2 = new CreditCardPayment(100.0,"Barney Rubble",11,2009,55598765432L);
        System.out.println("Credit2 Details:");
        System.out.println(credit2.paymentDetails());
    }
    
}
