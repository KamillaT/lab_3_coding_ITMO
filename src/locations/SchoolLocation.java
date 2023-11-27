package locations;

public class SchoolLocation extends Location {
    @Override
    public Locations GetLocation() {
        return Locations.SCHOOL;
    }

    @Override
    public String ReturnLocation() {
        return " в школе";
    }
}
