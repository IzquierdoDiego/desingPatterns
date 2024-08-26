package singletonMultiThread;

import SingletonSingleThread.SingletonST;

public class ThreadTow implements Runnable{
    @Override
    public void run() {
        SingletonST singleton = SingletonST.getInstance(77777);
        System.out.println(singleton.value);
    }
}
