/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */
public class HotDogStand {
    
    private static int total = 0;
    
    private int standID = 99999;
    private int hotdogsSold = 0;
    
    public HotDogStand()
    {
        standID = 99999;
        hotdogsSold = 0;
    }
    
    public HotDogStand(int sID, int sold )
    {
        standID = sID;
        hotdogsSold = sold;
        total += sold;
    }
    
    public void justSold()
    {
       hotdogsSold++;
       total++;
    }
    
    public int howMany()
    {
        return hotdogsSold;
    }
    
    static int howManyTotal()
    {
        return total;
    }
    
    public static void main(String[] args)
    {
        HotDogStand st1 = new HotDogStand(001, 4);
        HotDogStand st2 = new HotDogStand(002, 1);
        HotDogStand st3 = new HotDogStand(003, 6);
        System.out.println("Stand "+st1.standID+" sold "+st1.howMany());
        System.out.println("Stand "+st2.standID+" sold "+st2.howMany());
        System.out.println("Stand "+st3.standID+" sold "+st3.howMany());
        System.out.println("Total sold: "+howManyTotal()+"\n");
        
        st1.justSold();
        st3.justSold();
        System.out.println("Stand "+st1.standID+" sold "+st1.howMany());
        System.out.println("Stand "+st2.standID+" sold "+st2.howMany());
        System.out.println("Stand "+st3.standID+" sold "+st3.howMany());
        System.out.println("Total sold: "+howManyTotal()+"\n");
        
        
        
    }
}
