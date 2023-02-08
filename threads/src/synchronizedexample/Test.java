package synchronizedexample;

public class Test {
    public static void main(String args[]){
        Table obj = new Table();
        MyThread2 t2=new MyThread2(obj);
        MyThread1 t1=new MyThread1(obj);


        t2.start();
        t1.start();


    }
}
