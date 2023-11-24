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
        switch (action)
        {
            case LAY:
                Writer.Write(Name + " лежит " + str);
                break;
            case CRY:
                Writer.Write(Name + " плачет " + str);
                break;
            case TURN:
                Writer.Write(Name + "у исполнится " + str);
                break;
            case WAIT:
                Writer.Write(Name + " ждёт " + str);
                break;
        }
    }

    @Override
    public void ReturnEmotion(IEmotion emo) {
        Emotions emotion = emo.GetEmotion();
        switch (emotion) {
            case SAD:
                Writer.Write(Name + " грустно");
                break;
            case BORED:
                Writer.Write(Name + " скучно");
                break;
            case HAPPY:
                Writer.Write(Name + " счастлив");
        }
    }
}
