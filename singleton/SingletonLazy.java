package singleton;

public class SingletonLazy {
    private static SingletonLazy sc = null;

    private SingletonLazy(){}
    
    public static SingletonLazy getInstance(){
    
        if(sc==null){
            sc = new SingletonLazy();
        }else{
            System.out.println("the singleton is already created you can't create another one");
        }
        return sc;
    }
}