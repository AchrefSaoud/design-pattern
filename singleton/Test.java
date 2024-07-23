package singleton;

public class Test {
    public static void main(String[] args) {
        SingletonLazy sl=SingletonLazy.getInstance();
        System.out.println("*****");
        SingletonLazy sl2=SingletonLazy.getInstance();
    }   
}
