------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: RMIT-AP-W3C3
PURPOSE OF PROJECT: OO Design Practice for COSC11295 Advanced Programming
VERSION or DATE: 14/03/2018
HOW TO START THIS PROJECT: 
14/03/2018 OO design and Implementation  


AUTHORS: Jyhwoei Yang (Tom)

SYSTEM REQUIREMENTS:

a.) Create a super class called Car. 

The Car class supports the following fields and methods. 

int maxSpeed; 
double regularPrice; 
String color; 
double getSalePrice(); // 4% off the regular price

b.) Create a subclass of Car class and name it as SportsCar. 

This class has the following fields and methods

int horsePower; 
double getSalePrice(); // if horsePower > 400, 5% discount. Otherwise, 10% discount.

c.) Create a subclass of Car class and name it as FordCar. 

The Ford class supports the following fields and methods

int year; 
double manufacturerDiscount; 
double getSalePrice(); 
// from the sale price computed from class Car, subtract the manufacturer discount, which is usually 3% if year > 1.

d.) Create a subclass of Car class and name it as Wagon. 

This class has the following fields and method:

double length; 
double getSalePrice(); 
// if length < 5 meters, 5% discount. Otherwise, 10% discount.

e.) Create MyAutoShop class which contains the main() method. 

Perform the following within the main() method.

* Create an instance of Wagon and initialize all the fields with reasonable values. 

* Use super(...) method in the constructor for initializing the fields of the superclass.

* Create two FordCar instances and initialize all the fields with reasonable values.

* Use super(...) method in the constructor for initializing the fields of the superclass.

* Create an instance of Car and initialize all the fields with appropriate values.

* Display the sale prices of all instances.


