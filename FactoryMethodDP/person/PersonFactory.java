package LLD.FactoryMethodDP.person;

public class PersonFactory {
    public static Person getPerson(String gender){
        Person p = null;
        if(gender.equals("male")){
            p = new Male();
        }else{
            p = new Female();
        }

        return p;
    }
}
