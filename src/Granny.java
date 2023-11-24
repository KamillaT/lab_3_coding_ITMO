public class Granny extends Human {

    public Granny(String nm, IWriter wrt)
    {
        Name = nm;
        Writer = wrt;
    }
    @Override
    public void WriteAction(IAction act) {
        Actions action = act.GetAction();
        String str = act.DoAction();
        switch (action) {
            case LAY -> Writer.Write(Name + str + " на диване");
            case CRY, TURN -> Writer.Write(Name + str);
            case COME -> Writer.Write(Name + str + " домой");
            case TRAVEL -> Writer.Write(Name + str + "к семье");
            case WAIT -> Writer.Write(Name + str + " своего внука");
        }
    }

    @Override
    public void ReturnEmotion(IEmotion emo) {
        Emotions emotion = emo.GetEmotion();
        String str = emo.ShowEmotion();
        switch (emotion) {
            case HAPPY, BORED -> Writer.Write(Name + str + "а");
            case SAD -> Writer.Write(Name + str);
            case MISSING -> Writer.Write(Name + str + " по своему внуку");
        }
    }

    @Override
    public void ShowLocation(ILocation loc) {
        Locations location = loc.GetLocation();
        String str = loc.ReturnLocation();
        switch (location) {
            case HOME -> Writer.Write(Name + str + " у родных. Наконец-то она проводит с ними много времени");
            case VILLAGE -> Writer.Write(Name + str + ". Здесь у неё хватает дел до приезда внука");
            case SCHOOL -> Writer.Write(Name + str + " не учится, а уже давно её закончила");
            case ROOF -> Writer.Write(Name + " не живёт" + str);
        }
    }

    @Override
    public void WriteSeason(ISeason seas) {
        Seasons season = seas.GetSeason();
        String str = seas.ReturnSeason();
        switch (season) {
            case SUMMER -> Writer.Write(Name + " любит" + str + " и с нетерпением ждёт внука");
            case WINTER -> Writer.Write(Name + " любит" + str + ", к тому же у неё день рождения в январе, а тогда " +
                    "она приезжает навестить близких");
            case SPRING -> Writer.Write(Name + " любит" + str + ", ведь скоро к ней приедет любимый внук");
            case AUTUMN -> Writer.Write(Name + " не любит" + str + ", потому что переживает за внука");
        }
    }
}
