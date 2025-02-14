// Class ClObj: Demonstrates creating and using objects in OOP
public class ClObj {
    public static void main(String args[]) {
        // Creating an object of class 'pen' called p1
        pen p1 = new pen();
        
        // Setting the color of the pen to "Blue" using the setColor method
        p1.setColor("Blue");
        
        // Printing the color of the pen to the console
        System.out.println(p1.color);

        // Setting the tip of the pen to 5 using the setTip method
        p1.setTip(5);
        
        // Printing the tip size of the pen to the console
        System.out.println(p1.tip);
    }
}

// Class pen: Represents a pen with color and tip size
class pen {
    // Instance variables (attributes) for the color and tip size of the pen
    String color;
    int tip;

    // Method to set the color of the pen
    void setColor(String newColor) {
        color = newColor;  // Assign the new color to the color attribute
    }

    // Method to set the tip size of the pen
    void setTip(int newTip) {
        tip = newTip;  // Assign the new tip size to the tip attribute
    }
}

// Class Student: Represents a student with name, age, and percentage
class Student {
    // Instance variables (attributes) for the student's name, age, and percentage
    String name;
    int age;
    float percentage;

    // Method to calculate the student's percentage based on marks in three subjects
    void calcPercentage(int physics, int chemistry, int maths) {
        // Calculating the percentage by taking the sum of the marks and dividing by 3
        // Casting the sum to float for accurate division
        percentage = (float)(physics + chemistry + maths) / 3;
    }
}
