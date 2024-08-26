package singletonMultiThread;

import SingletonSingleThread.SingletonST;

public class TreadOne implements Runnable{

    @Override
    public void run() {
        SingletonST singleton = SingletonST.getInstance(666666);
        System.out.println(singleton.value);
    }
}
