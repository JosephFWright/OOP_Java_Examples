/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */
public class Movie {
    private String rating = "Not Rated";
    private int IDnum = 1233456;
    private String title = "Generic Title";
    
    public Movie(int IDnum)
    {
        this.IDnum = IDnum;
    }
    
    void setRating(String rating)
    {
        this.rating = rating;
    }
    
    void setID(int num)
    {
        this.IDnum = num;
    }
    
    void setTitle(String tit)
    {
        this.title = tit;
    }
    
    String getRating()
    {
        return this.rating;
    }
    
    String getTitle()
    {
        return this.title;
    }
    
    int getID()
    {
        return this.IDnum;
    }
    
    public String calcLateFees()
    {
        return "The total amount paid was "+String.format("%.2f",this.getPayment())+".";
        
    }
}
 
class CashPayment extends Payment{
    private String method = "Cash";
    
    public CashPayment(double amount){
        super(amount);
            
}
    
    public String paymentDetails()
    {
        return "The total amount paid via "+method+" was "+String.format("%.2f",this.getPayment())+"\n";
    }
}
 class CreditCardPayment extends Payment{
     private String method = "Credit Card";
     private String name = "";
     private int month = 0;
     private int year = 00;
     private long cardNum = 123456789000L;
     
    public CreditCardPayment(double amount, String name, int month, int year,long cardNum)
    {
        super(amount);
        this.name = name;
        this.month = month;
        this.year = year;
        this.cardNum = cardNum;
    }
    
    public String paymentDetails()
    {
        return "The total amount paid via "+method+" was "+String.format("%.2f",this.getPayment())
                +"\nThe name on the card is: "+this.name
                +"\nThe card's expiration date is: "+this.month+"/"+this.year
                +"\nThe credit card number is: "+this.cardNum+"\n";
    }
 }
    
}
