package LLD.FactoryMethodDP.person;

public class MainWish {
    public static void main(String[] args) {
        Person p = PersonFactory.getPerson("male");
        p.wish();
    }
}
