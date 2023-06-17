package LLD.Singleton;

public class Singleton {

    static Singleton singleton = null;

    private Singleton(){

    }

    // Not thread safe

//    static Singleton getInstance(){
//        if(singleton == null){
//            singleton = new Singleton();
//            return singleton;
//        }
//        return singleton;
//    }

    // double check locking

    public static Singleton getInstance(){

        if (singleton == null){     // single check
            synchronized (Singleton.class){
                if (singleton == null){     // Double check
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void sayHello(){
        System.out.println("Hi..! I am singleton 1");
        System.out.println(singleton);
    }
}
