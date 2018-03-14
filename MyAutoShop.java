
/**
 * Write a description of class MyAutoShop here.
 * 
 * @author Jyh-woei Yang 
 * @version 14/03/2018
 */
public class MyAutoShop
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MyAutoShop
     */
    public MyAutoShop()
    {
        // initialise instance variables
        
    }

    /**
     * Main method
     * 
     * @param   String[] args
     * @return  void
     */
    public static void main(String[] args)
    {   
        //Create an instance of Wagon and initialize all the fields with reasonable values. 
        Wagon wagon2m = new Wagon(2,80,100000,"Red");
        
        //Use super(...) method in the constructor for initializing the fields of the superclass.
        //wrote super(80,100000,"Red"); in Wagon's constructor's first statement
        
        //Create two FordCar instances and initialize all the fields with reasonable values.
        FordCar fordCar1 = new FordCar(3,80,100000,"Blue");
        FordCar fordCar2 = new FordCar(0,80,100000,"Grey");
        //Use super(...) method in the constructor for initializing the fields of the superclass.
        //wrote super(80,100000,"Blue"); in Wagon's constructor's first statement
        
        //wrote super(80,100000,"Grey"); in Wagon's constructor's first statement
        
        //Create an instance of Car and initialize all the fields with appropriate values.
        Car car1 = new Car(80,100000,"SkyBlue");
        //Display the sale prices of all instances
        wagon2m.display();
        fordCar1.display();
        fordCar2.display();
        car1.display();
    }
}
