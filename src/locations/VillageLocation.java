package locations;

public class VillageLocation extends Location {
    @Override
    public Locations GetLocation() {
        return Locations.VILLAGE;
    }

    @Override
    public String ReturnLocation() {
        return " в деревне";
    }
}
