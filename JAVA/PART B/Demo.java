import java.io.*;

class Staticdemo {
    static int val = 1024;

    static int valmethod() {
        return val / 2;
    }
}

class Demo {
    public static void main(String args[]) {
        System.out.println(" Value is" + Staticdemo.val);
        Staticdemo.val = 4;
        System.out.println(" Value is" + Staticdemo.val);
        System.out.println("calling static method" + Staticdemo.valmethod());
    }
}
