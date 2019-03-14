# carPark

This code is accompanying an introductory blog to scala I wrote: https://schirrmeister.wordpress.com/2018/11/08/first-steps-in-scala-part-2/
The main objective was to play around with objects in scala.

## First object: a car
My car object will have the fields: color, make and position and the method: move()
Looking at some simple code to build your first car object below. I named the project “carPark”. 
It contains a main method, the entry point to our program which always starts with main(args:Array[String]). 
In the main method we will create a car object (based on the template defined in the Car class), named “fiat” and 
check its fields, color, make and position in a print statement (The print statement has a variable reference embedded 
(s”$variable”). I mentioned string interpolation already in my last post.). The Car-class defines the features 
for our car object and enables us to build as many cars as we like, which will all share the fields, color 
(user defined, immutable), make (user defined, immutable) and position.

## adding methods
Adding a function move() will actually enable us to access the mutable data stored in car.position within the car class 
and transform these. If you imagined a grid(x,y) we could now move our object car within that grid 
starting from position(0,0) to position(2,2).

## adding a visual output
For simple visual solution on the position of your car, you could add a Grid class to display its position 
(I marked the position of the car with “X”)
In the Grid class I used a multidimensional Array. A multidimensional array stores data in a matrix. 
It might be worth having a look at arrays first. In the above example car.position is an array. 
Arrays in scala are a collection of data, just like arrays in java. Examples of different arrays: 
(I) var numbers: Array[Int] = Array(1,2,3,4) ; (II) var strings: Array[String] = Array(“hello”,”goodbye”, “servus”)

