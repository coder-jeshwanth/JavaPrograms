import java.lang.Math;
abstract class Shape
{
  abstract void area();
  double area;
}
class Traingle extends Shape{
  double b=50 ,h=40;
  void area(){
    area=(b*h)/2;
    System.out.println("The area of a traingle is ---> "+ area);
  }

class Rectangle extends Shape{
  double l=50 , b=70;
  void area(){
    area=(l*b);
    System.out.println("The area of Rectangle is --> "+ area);
  }

class Circle extends Shape{
  double r;
  area=(3.14*r*r);
  System.out.println("The area of circle is --> "+ area);
}

class AreaDemo{
  public static void main(String args[])
  {
    Traingle t = new Traingle();
    Rectangle r = new Rectangle();
    Circle c = new Circle();
    c.area();
    r.area();
    c.area();
  }
}
}
}