package threadclass;

public class ThreadClass extends Thread{

    public void run(){
        //code to be excecuted
        System.out.println("Thread is running  extending parent Thread class");
    }

    public static void main(String[] args)
    {

        // Creating object of our thread class inside main()
        // method
        ThreadClass myThread = new ThreadClass();
        ThreadClass myThread2 = new ThreadClass();

        // Starting the thread
        myThread.start();
        myThread2.start();
    }

}
