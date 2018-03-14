
/**
 * Write a description of class SportCar here.
 * 
 * @author Jyhwoei Yang 
 * @version 14/03/2018
 */
public class SportCar extends Car
{
    // instance variables - replace the example below with your own
    private int horsePower;

    /**
     * Constructor for objects of class SportCar
     */
    public SportCar()
    {
        // initialise instance variables
        this.horsePower = 0;
    }
    
    public SportCar(int horsePower)
    {
        // initialise instance variables
        this.horsePower = horsePower;
    }

    /**
     * double getSalePrice(); 
     * // if horsePower > 400, 5% discount. Otherwise, 10% discount.
     * 
     * @param      _regularPrice  a regularPrice
     * @return     the salePrice 
     */
    public double getSalePrice(double _regularPrice)
    {
        // put your code here
        double salePrice = 0;
        if (horsePower > 400)
        {
            salePrice = _regularPrice * 0.95;
            return salePrice;
        }
        salePrice = _regularPrice * 0.90;
        return salePrice;
    }
    
    public void display()
    {
        System.out.println("======== Sport car ==========");
        System.out.println("MaxSpeed:"+ getMaxSpeed() + "");
        System.out.println("RegularPrice:"+ getRegularPrice() + "");
        System.out.println("Color:"+ getColor() + "");
        System.out.println("HorsePower:"+ horsePower + "");
        System.out.println("=============================");
    }
}
