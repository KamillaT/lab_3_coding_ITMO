package people;

import actions.IAction;
import emotions.IEmotion;
import locations.ILocation;
import seasons.ISeason;
import actions.Actions;
import emotions.Emotions;
import locations.Locations;
import seasons.Seasons;

public class PropellerMan extends Human {

    public PropellerMan(String nm, IWriter wrt)
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
            case LAY -> Writer.Write(Name + str + " и уплетает пончики");
            case CRY, TURN -> Writer.Write(Name + str);
            case COME -> Writer.Write(Name + str + " на день рождения друга");
            case TRAVEL -> Writer.Write(Name + str + " на велосипеде к другу домой");
            case WAIT -> Writer.Write(Name + str + " возвращения друга и ест варенье");
        }
    }

    @Override
    public void ReturnEmotion(IEmotion emo) {
        Emotions emotion = emo.GetEmotion();
        String str = emo.ShowEmotion();
        switch (emotion) {
            case HAPPY, SAD, BORED -> Writer.Write(Name + str);
            case MISSING -> Writer.Write(Name + str + " по развлечениям с другом и очень ждёт его");
        }
    }

    @Override
    public void ShowLocation(ILocation loc) {
        Locations location = loc.GetLocation();
        String str = loc.ReturnLocation();
        switch (location) {
            case HOME -> Writer.Write(Name + str + " у своего друга. " + Name + " помогает сделать важные дела, " +
                    "чтобы поскорее отдохнуть");
            case VILLAGE -> Writer.Write(Name + " не бывает" + str);
            case SCHOOL -> Writer.Write(Name + str + " не учится");
            case ROOF -> Writer.Write(Name + " живёт" + str);
        }
    }

    @Override
    public void WriteSeason(ISeason seas) {
        Seasons season = seas.GetSeason();
        String str = seas.ReturnSeason();
        switch (season) {
            case SUMMER -> Writer.Write(Name + " любит" + str + ". В это время года почти каждый день светит солнце " +
                    "и очень тепло");
            case WINTER -> Writer.Write(Name + " любит" + str + ". На новогодних каникулах он много времени проводит с другом");
            case SPRING -> Writer.Write(Name + " весной с нетерпением ждёт лето");
            case AUTUMN -> Writer.Write(Name + " не любит" + str + ", потому что его друг ходит в школу, а веселиться не с кем");
        }
    }
}
