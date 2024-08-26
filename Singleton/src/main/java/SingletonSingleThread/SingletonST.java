package SingletonSingleThread;

public class SingletonST {

    private static SingletonST instance;
    public int value;

    private SingletonST(int value){
        this.value = value;
        System.out.println("instance created... constructor. value: " + this.value);
    }

    public static SingletonST getInstance(int value){
        if (instance == null){
            instance = new SingletonST(value);
            return instance;
        }
        return instance;

    }


}
