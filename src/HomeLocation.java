public class HomeLocation extends Location {
    @Override
    public Locations GetLocation() {
        return Locations.HOME;
    }

    @Override
    public String ReturnLocation() {
        return " дома";
    }
}
