package LLD.BuilderPattern;

public class TreeHouseBuilder implements HouseBuilder{

    House house;


    public TreeHouseBuilder() {
        house = new House();
    }

    @Override
    public void buildBasement(){
        house.setBasement("Wooden basement");
    }

    @Override
    public void buildStructure(){
        house.setStructure("Over the tree");
    }

    @Override
    public void buildInterior(){
        house.setInterior("Interior made by wooden");
    }

    @Override
    public void buildRoof(){
        house.setRoof("Tree leaf");
    }

    @Override
    public House getHouse(){
        return house;
    }

}
