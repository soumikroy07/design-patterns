package LLD.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.sayHello();

        Singleton singleton2 = Singleton.getInstance();
        singleton2.sayHello();
    }
}


// as we keep the constructor private so, here we can see only one object is created by using a method,
// anytime whenever we are trying to create another object it always returns the previous created object

// ue are using Singleton class for DB access just because only one instance provide all DB data;