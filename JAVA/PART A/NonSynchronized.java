class Parentheses{
    synchronized void display(String s){
        System.out.print("(" + s);

        try{
            Thread.sleep(500);
        }catch(InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.print(")");
        System.out.println("");
    }
}
class MyThread extends Thread{
    String s1;
    Parentheses p1;
    Thread t;
    public MyThread(Parentheses p2,String s2)
    {
        p1=p2;
        s1=s2;
    }
    public void run(){
        p1.display(s1);
    }
}
class NonSynchronized{
    public static void main(String args[])
    {
        Parentheses p3 = new Parentheses();
        MyThread ta1 =new MyThread(p3,"Srikanth");
        Thread t1 = new Thread(ta1);
        MyThread ta2 = new MyThread(p3,"Snigdha");
        Thread t2 = new Thread(ta2);
        t1.start();
        t2.start();
    }
}