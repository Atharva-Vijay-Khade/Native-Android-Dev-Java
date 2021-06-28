import java.util.Scanner;
import java.lang.*;

class MyThread1 extends Thread {

    @Override
    public void run() {
        
        for(int i=0;i<100;i++) {
            System.out.println("111111");
            try{
                MyThread1.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Caught Exception");
            }
        }

    }

}

class MyThread2 extends Thread {

    @Override
    public void run() {

        for(int i=0;i<100;i++)
            System.out.println("222222");

    }

}

class MyThread3 extends Thread {

    @Override
    public void run() {
        
        for(int i=0;i<100;i++)
            System.out.println("333333");

    }

}

class start {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();   
        System.out.println(a);

        float f = sc.nextFloat();
        System.out.println(f);
        
        sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(s);

        MyThread1 myT1 = new MyThread1();
        MyThread2 myT2 = new MyThread2();
        MyThread3 myT3 = new MyThread3(); // new born threads in java

        // for(int i=0;i<5;i++) {

        //     myT1.start();                // runnable thread in java, becomes running when goes in processor queue
        //     myT2.start();
        //     myT3.start();

        // }

        String str = new String();
        str = "HelloWorld";

        System.out.println(str);


        
    }

}