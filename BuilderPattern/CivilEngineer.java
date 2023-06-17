package LLD.BuilderPattern;

public class CivilEngineer {

    private  HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse(){
        return houseBuilder.getHouse();
    }

    public void constructHouse(){
        houseBuilder.buildBasement();
        houseBuilder.buildStructure();
        houseBuilder.buildInterior();
        houseBuilder.buildRoof();
    }
}
