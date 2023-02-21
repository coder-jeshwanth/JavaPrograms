import java.lang.*;
import java.io.*;
import java.util.*;

public class VectorDemo {
 
 public static void main(String args[]) {
  
  Vector list = new Vector();
  int len=args.length;
  for(int i=0;i<len;i++) 
  {
   
   list.addElement(args[i]);
  }
  
  System.out.println("Vector elements before sorting: ");
    for(int i=0; i < list.size(); i++)
     {
       //get(i) method fetches the element from index i
       System.out.println(list.get(i));
     }

  Collections.sort(list);
 
    //Display Vector elements after sorting using Collection.sort
    System.out.println("Vector elements after sorting: :");
    for(int i=0; i < list.size(); i++)
    {
       System.out.println(list.get(i));
    }
}

}
