package LLD.BuilderPattern;

public class MainCustomer {

    public static void main(String[] args) {
        // we want to build house like igloo
        HouseBuilder igloo = new IglooHouseBuilder();

        // Ask our Director(Civil Engineer) to build

        CivilEngineer civilEngineer = new CivilEngineer(igloo);

        // Civil Engineer start constructing the house
        civilEngineer.constructHouse();

        // fetch all the details of that house
        House house = civilEngineer.getHouse();

        //Show house is prepared or not
        System.out.println("The house is :"+house);




        // Now ask to build a tree house

        HouseBuilder treeHouseBuilder = new TreeHouseBuilder();

        // pass the idea to the civil engineer

        CivilEngineer engineer = new CivilEngineer(treeHouseBuilder);

        // engineer start building the house

        engineer.constructHouse();

        //handover the house

        House treeHouse = engineer.getHouse();

        System.out.println("My three house is "+ treeHouse);

    }
}
