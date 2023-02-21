import java.util.*;
class Vectordemo
{
public static void main(String args[]) 
{
Vector v= new Vector() ;
v.add(" C") ;
v.add("C++") ;
v.add(" Java") ;
v.add(" J2EE") ;
System.out.println(" Initially the vector content :"+v.toString()) ;
System.out.println(" The last element is "+ v.lastElement()) ;
v.insertElementAt(" VB", 1) ;
v.insertElementAt ("C#", 0) ;
System.out.println(" After inserting the vector content"+v.toString()) ;
v.removeElementAt(3) ;
System.out.println(" After remove element at 3, the vector content "+ v.toString()) ;
v.setElementAt(" C++", 1) ;
v.removeElement("VB") ;
System.out.println(" After removing VB, the vector content "+v.toString()) ;
}
}
