public abstract class Season implements ISeason {
    public abstract Seasons GetSeason();
    public abstract String ReturnSeason();

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Season others = (Season) obj;
        return this.GetSeason() == others.GetSeason() && this.ReturnSeason() == others.ReturnSeason();
    }

    public int hashCode() {
        return this.GetSeason().hashCode() * this.ReturnSeason().hashCode();
    }

    public String toString() {
        return this.ReturnSeason();
    }
}
