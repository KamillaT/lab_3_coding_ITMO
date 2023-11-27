package locations;

public class RoofLocation extends Location {
    @Override
    public Locations GetLocation() {
        return Locations.ROOF;
    }

    @Override
    public String ReturnLocation() {
        return " на крыше";
    }
}
