

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wrightj41@gator.uhd.edu
 */
public class Odometer {
    
    private int miles_driven = 0;
    private int mpg = 100;
    
    public void reset()
    {
        this.miles_driven = 0;
    }
    
    public void set_mpg(int mpg)
    {
        this.mpg = mpg;
    }
    
    public int add_mileage(int miles)
    {
        this.miles_driven += miles;
    }
    
    public int fuel_use()
    {
        return (miles_driven/mpg);
    }
    
    public Odometer ()
            {
                miles_driven = 0;
                mpg = 50;
            }
    
    
    
}
