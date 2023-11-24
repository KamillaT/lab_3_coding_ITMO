public abstract class Location implements ILocation {
    public abstract Locations GetLocation();
    public abstract String ReturnLocation();

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Location others = (Location) obj;
        return this.GetLocation() == others.GetLocation() && this.ReturnLocation() == others.ReturnLocation();
    }

    public int hashCode() {
        return this.GetLocation().hashCode() * this.ReturnLocation().hashCode();
    }

    public String toString() {
        return this.ReturnLocation();
    }
}
