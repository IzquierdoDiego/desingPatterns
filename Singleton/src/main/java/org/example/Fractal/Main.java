package org.example.Fractal;

import SingletonSingleThread.SingletonST;
import singletonMultiThread.ThreadTow;
import singletonMultiThread.TreadOne;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Singleton!");
        System.out.println();

        //singleThread(2453);

        multiThread(); // generate more than one instance

    }

    private static void multiThread() {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadOne = new Thread(new TreadOne());
        Thread threadTow = new Thread(new ThreadTow());
        threadOne.start();
        threadTow.start();

    }


    public static void singleThread(int value){

        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        SingletonST singletonST = SingletonST.getInstance(value);
        SingletonST singletonSTCopy = SingletonST.getInstance(44);

        System.out.println(singletonST.value);
        System.out.println(singletonSTCopy.value);


        boolean rpta = singletonST instanceof SingletonST;
        System.out.println(rpta);
    }

}