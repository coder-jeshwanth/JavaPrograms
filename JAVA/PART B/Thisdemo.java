import java.util.*;
import java.io.*;
class Thisdemo
{
int i, j;
Thisdemo()
{ 
this(100) ;
}
Thisdemo(int i, int j) 
{
this.i=i;
this.j=j;
}
Thisdemo(int a) 
{
this(a, 200) ;
}
void display() 
{
System.out.println("i="+i) ;
System.out.println("j="+j) ;
}
public static void main(String args[]) 
{
Thisdemo a1= new Thisdemo() ;
a1.display() ;
}
}
