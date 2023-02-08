package runnableinterface;

public class myThread2 implements Runnable{

    @Override
    public void run() {
        //code to be excecuted
        System.out.println("Thread using Runnable interface");
    }


    public static void main(String[] args) {
        Thread t1 = new Thread(new myThread2());

        t1.start();
    }
}
