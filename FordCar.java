
/**
 * Write a description of class FordCar here.
 * 
 * @author Jyh-woei Yang 
 * @version 14/03/2018
 */
public class FordCar extends Car
{
    // instance variables - replace the example below with your own
    private int year;
    private double manufacturerDiscount;

    /**
     * Constructor for objects of class FordCar
     */
    public FordCar()
    {
        // initialise instance variables
        year = 0;
    }

    public FordCar(int year, int maxSpeed, double regularPrice, String color)
    {
        // initialise instance variables
        //Use super(...) method in the constructor for initializing the fields of the superclass.
        super(maxSpeed, regularPrice, color);
        this.year = year;
    }
    
    /**
     * from the sale price computed from class Car,
     * subtract the manufacturer discount, which is usually 3% if year > 1.
     * 
     * @param      _regularPrice  a regularPrice
     * @return     the salePrice
     */
    public double getSalePrice(double _regularPrice)
    {
        // put your code here
        double salePrice = 0;
        if (year > 1)
        {
            salePrice = _regularPrice * 0.97;
            return salePrice;   
        }
        return salePrice;
    }
    
    public void display()
    {
        System.out.println("======== Ford car ===========");
        System.out.println("MaxSpeed:"+ getMaxSpeed() + "");
        System.out.println("RegularPrice:"+ getRegularPrice() + "");
        System.out.println("Color:"+ getColor() + "");
        System.out.println("Year:"+ year + "");
        System.out.println("=============================");
    }
}
