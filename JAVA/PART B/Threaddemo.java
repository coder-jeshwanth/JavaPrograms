import java.lang.Thread;

class Newthread implements Runnable {
    Thread t;

    Newthread() {
        t = new Thread(this, " Demo thread");
        System.out.println(" Child thread");
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(" Child thread " + i);
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println(" Child interrupted ");
        }
        System.out.println(" Existing child thread");
    }
}

class Threaddemo {
    public static void main(String args[]) {
        new Newthread();
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(" Main thread " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(" Main Interrupted");
        }
        System.out.println(" Existing main thread");
    }
}
