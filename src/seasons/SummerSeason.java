package seasons;

public class SummerSeason extends Season {
    @Override
    public Seasons GetSeason() {
        return Seasons.SUMMER;
    }

    @Override
    public String ReturnSeason() {
        return " лето";
    }
}
