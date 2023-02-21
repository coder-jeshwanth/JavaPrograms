import java.io.*;
import java.util.*;
public class StackDemo{
    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);
        System.out.println("initial stack: " + stack);
        System.out.println("popped stack: " + stack.pop());
        System.out.println("popped stack: " + stack.pop());
        System.out.println("Stack after pop operation: "+ stack);

    }
}