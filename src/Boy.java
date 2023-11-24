public class Boy extends Human
{
    public Boy(String nm, IWriter wrt)
    {
        Name = nm;
        Writer = wrt;
    }

    @Override
    public void WriteAction(IAction act)
    {
        Actions action = act.GetAction();
        String str = act.DoAction();
        switch (action) {
            case LAY -> Writer.Write(Name + str + " ничком");
            case CRY -> Writer.Write(Name + str + " так горько, что сердце разрывается");
            case COME -> Writer.Write(Name + str + " домой");
            case TRAVEL -> Writer.Write(Name + str + " в деревню к бабушке");
            case TURN -> Writer.Write(Name + str + ". Теперь ему 8 лет");
            case WAIT -> Writer.Write(Name + str + " так долго своего дня рождения");
        }
    }

    @Override
    public void ReturnEmotion(IEmotion emo) {
        String str = emo.ShowEmotion();
        Writer.Write(Name + str);
    }

    @Override
    public void ShowLocation(ILocation loc) {
        Locations location = loc.GetLocation();
        String str = loc.ReturnLocation();
        switch (location) {
            case HOME -> Writer.Write(Name + str + ". Он может отдохнуть, а потом заняться делами");
            case VILLAGE -> Writer.Write(Name + str + ". Он каждое утро ест блинчики, которые готовит бабушка, " +
                    "купается в речке, греется на солнце, играет с друзьями");
            case SCHOOL -> Writer.Write(Name + str + ". Хоть он и не любит ходить туда, но старается хорошо учиться. " +
                    "И, конечно, ждёт каникулы");
            case ROOF -> Writer.Write(Name + " не живёт" + str);
        }
    }

    @Override
    public void WriteSeason(ISeason seas) {
        Seasons season = seas.GetSeason();
        String str = seas.ReturnSeason();
        switch (season) {
            case SUMMER -> Writer.Write(Name + " любит" + str + ", потому что не надо ходить в школу, у него день рождения " +
                    "и он навестит свою бабушку");
            case WINTER -> Writer.Write(Name + " любит" + str + ". На новогодних каникулах он много гуляет, играет в снежки, " +
                    "катается на лыжах. А ещё в январе призжает бабушка");
            case SPRING -> Writer.Write(Name + " любит" + str + ", ведь в это время года много праздничных дней, да и лето не за горами");
            case AUTUMN -> Writer.Write(Name + " не любит" + str + ", потому что начинается учёба, а в школу он ходить не любит");
        }
    }
}
