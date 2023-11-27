package seasons;

public class SpringSeason extends Season{
    @Override
    public Seasons GetSeason() {
        return Seasons.SPRING;
    }

    @Override
    public String ReturnSeason() {
        return " весну";
    }
}
