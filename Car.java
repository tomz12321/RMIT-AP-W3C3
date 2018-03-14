import java.util.*;
import java.io.*;

/**
 * Write a description of class Car here.
 * 
 * @author Jyhwoei Yang 
 * @version 14/03/2018
 */
public class Car
{
    // instance variables - replace the example below with your own
    private int maxSpeed; 
    private double regularPrice; 
    private String color; 

    /**
     * Constructor for objects of class Car
     */
    public Car()
    {
        // initialise instance variables
        maxSpeed = 0;
        regularPrice = 0;
        color = "";
    }

    public Car(int maxSpeed, double regularPrice, String color)
    {
        // initialise instance variables
        this.maxSpeed = maxSpeed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    /**
     * double getSalePrice(); // 4% off the regular price
     * 
     * @param      _regularPrice  a regularPrice
     * @return     double the return value 4% off the regular price 
     */
    public double getSalePrice(double _regularPrice)
    {
        // put your code here
        double salePrice = 0;
        salePrice = _regularPrice * 0.96;
        return salePrice;
    }

    //getter
    
    /**
    * Method getName
    *
    * @return String The return value
    */
    public double getMaxSpeed()
    {
        return maxSpeed;
    }

    /**
    * Method getAge
    *
    * @return String The return value
    */
    public double getRegularPrice()
    {
        return regularPrice;
    }

    /**
    * Method getId
    *
    * @return String The return value
    */
    public String getColor()
    {
        return color;
    }
    
    public void display()
    {
        System.out.println("=========== Car =============");
        System.out.println("MaxSpeed:"+ maxSpeed);
        System.out.println("RegularPrice:"+ regularPrice);
        System.out.println("Color:"+ color);
        System.out.println("=============================");
    }
}
