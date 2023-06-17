package LLD.BuilderPattern;

public class IglooHouseBuilder implements HouseBuilder{
    House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement(){
        house.setBasement("Basement is made by ICE");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice curving");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
