package Singleton;

public class ExampleSingleton{

    private static ExampleSingleton uniqueInstance = null;

    protected ExampleSingleton(){

        System.out.println("only one instance");
    }

    public static ExampleSingleton getInstance(){
        if(uniqueInstance==null){
            uniqueInstance =new ExampleSingleton();
        }

        return uniqueInstance;
    }

    public static void print(){
        System.out.println("data set is printed");
    }
}