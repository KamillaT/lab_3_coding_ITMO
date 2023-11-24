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
        if (action == Actions.COME) {
            Writer.Write(Name + " приходит " + str);
        }
    }

    @Override
    public void ReturnEmotion(IEmotion emo) {
        Emotions emotion = emo.GetEmotion();
        switch (emotion) {
            case HAPPY:
                Writer.Write(Name + " счастлив");
                break;
        }
    }
}
