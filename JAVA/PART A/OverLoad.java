import java.util.*;
import java.io.*;

class OverloadDemo {
    void area(double b, double h) {
        System.out.println("The area of the triangle is " + 0.5 * b * h + " sq units");
    }

    void area(int l, int b) {
        System.out.println("The area of the rectangle is " + l * b + " sq units");
    }

    void area(double r) {
        double z = 3.14 * r * r;
        System.out.println("The area of the circle is " + z + " sq units");
    }
}

public class OverLoad {
    public static void main(String args[]) {
        OverloadDemo ob = new OverloadDemo();
        ob.area(5.5, 7.5);
        ob.area(10, 12);
        ob.area(2.5);
    }
}
