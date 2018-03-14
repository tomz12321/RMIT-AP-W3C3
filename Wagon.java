
/**
 * Write a description of class Wagon here.
 * 
 * @author Jyh-woei Yang 
 * @version 14/03/2018
 */
public class Wagon extends Car
{
    // instance variables - replace the example below with your own
    private double length; 
    // if length < 5 meters, 5% discount. Otherwise, 10% discount.


    /**
     * Constructor for objects of class Wagon
     */
    public Wagon()
    {
        // initialise instance variables
        length = 0;
    }
    
    public Wagon(double length, int maxSpeed, double regularPrice, String color)
    {
        // initialise instance variables
        //Use super(...) method in the constructor for initializing the fields of the superclass.
        super(maxSpeed, regularPrice, color);
        this.length = length;       
    }

    /**
     * double getSalePrice(); 
     * // if length < 5 meters, 5% discount. Otherwise, 10% discount.
     * 
     * @param      _regularPrice  a regularPrice
     * @return     the salePrice 
     */
    public double getSalePrice(double _regularPrice)
    {
        // put your code here
        double salePrice = 0;
        if (length < 5)
        {
            salePrice = _regularPrice * 0.95;
            return salePrice;
        }
        salePrice = _regularPrice * 0.90;
        return salePrice;
    }
    
    public void display()
    {
        System.out.println("========== Wagon ============");
        System.out.println("MaxSpeed:"+ getMaxSpeed() + "");
        System.out.println("RegularPrice:"+ getRegularPrice() + "");
        System.out.println("Color:"+ getColor() + "");
        System.out.println("Length:"+ length + "");
        System.out.println("=============================");
    }
}
