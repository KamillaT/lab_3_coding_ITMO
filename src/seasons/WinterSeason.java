package seasons;

public class WinterSeason extends Season {
    @Override
    public Seasons GetSeason() {
        return Seasons.WINTER;
    }

    @Override
    public String ReturnSeason() {
        return " зиму";
    }
}
