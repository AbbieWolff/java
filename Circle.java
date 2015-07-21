/*  

* Abbie Wolff  

* July 2015  

*  

* Java Programming Week 7 Assignment:  

* A program that includes two classes: 1) circle and 2) a class that  

* demonstrates the circle. When users enter the radius, the program calculates  

* and returns the area and circumference. The formula used to calculate

* the area of a circle is Math.PI * radius

* radius. The formula used to  

* calculate the circumference of a circle is 2 * pi * radius. The circle class  

* has a few methods, including setRadius, getRadius, getArea, getCircumference.  

*  

* This Java class, Circle, contains the methods,  

* descriptors, constructors, etc. The other class in this program, UseCircle,  

* interacts with the user and demonstrates the circle.  

*/

 

package circle;

 

// Import Java packages.

import java.util.Scanner;

 

public class Circle {

 

    // Utilize Java Scanner library package to enable user input.

    Scanner userInput = new Scanner (System.in);

 

    // Declare radius, area and circumference.

    double radius;

    double area;

    double circumference;

 

    // Declare the radius method, setRadius, which assigns the radius value

    // by requesting user input.

    public void setRadius(double r) {

        System.out.print("\n Please enter the circle's radius: ");

        r = userInput.nextDouble();

    }

 

    // Declare the radius method, getRadius, which returns the radius value;

    public double getRadius(double r) {

        return r;

    }

 

    // Declare the getArea method, which calculates area using the formula

    // Math.PI * radius * radius.

    public double getArea(double a) {

        a = Math.PI * radius * radius;

        return a;

    }

 

    // Declare the getCircumference method, which calculates circumference

    // using the formula 2 * Math.PI * radius.

    public double getCircumference(double c) {

        c = 2 * Math.PI * radius;
        
        return c;

    }

 

    // Declare and initialize UseCircle class, an instance of Circle.

    public Circle UseCircle = new Circle();

 

        // Declare and define setValue method using UseCircle sub-class.

       public void setValues() {

 

        // Call setRadius and getRadius methods to request user input

        // for the value of radius and return that value.

        UseCircle.setRadius(UseCircle.radius);

        radius = UseCircle.getRadius(UseCircle.radius);

 

         // Assign area by calculating it using getArea method.

        area = UseCircle.getArea(UseCircle.area);

       

        // Assign circumference by calculating it with the

        // getCircumference method.

        circumference = UseCircle.getCircumference(UseCircle.circumference);

        }

         

    // Command line arguments.

    public void static main(String[] args) {

       

        // Utilize Java Scanner library package to enable user input.

        Scanner userInput = new Scanner (System.in);

       

        // Introduce program to user.

        System.out.print("\n Hey there! Welcome to the circle program.");

        System.out.println("\n In this program, we'll calculate the "+

                " area and circumference of a circle using its radius." +

                "\n Let's begin... ");

 

       // Call the display method.

        setValues();

 

        // Print area by calculating it using getArea method.

        System.out.print("\n The circle's area is ");

        System.out.printf("%.2f", UseCircle.area);

        System.out.print(". ");

        

        // Print circumference by calculating it with the

        // getCircumference method.

        System.out.print("\n The circle's circumference is ");

        System.out.printf("%.2f", UseCircle.circumference);

        System.out.print(". ");

        

        // Thank the user.

        System.out.println("\n Thanks! Have a great day. \n");

    }

}

----------------------------------------------------------------------------------------------

Note: I had issues with static v. non-static variables. My professor offered good suggestions and corrections to fix it.
This is the original (broken) version of the program, before those suggestions.
