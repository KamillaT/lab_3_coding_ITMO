public class Granny extends Human {

    public Granny(String nm, IWriter wrt)
    {
        Name = nm;
        Writer = wrt;
    }
    @Override
    public void WriteAction(IAction act) {

    }

    @Override
    public void ReturnEmotion(IEmotion emo) {
        Emotions emotion = emo.GetEmotion();
        switch (emotion) {
            case HAPPY:
                Writer.Write(Name + " счастлива");
                break;
            case BORED:
                Writer.Write(Name + " скучно");
                break;
        }
    }
}
