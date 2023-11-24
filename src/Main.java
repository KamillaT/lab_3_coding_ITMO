public class Main {
    public static void main(String[] args)
    {
        Narrator nar = new Narrator();
        Boy Malysh = new Boy("Малыш", nar);
        PropellerMan Karlson = new PropellerMan("Карлсон", nar);

        Malysh.WriteAction(new LayAction());
        Malysh.WriteAction(new CryAction());
        Malysh.WriteAction(new WaitAction());
        Malysh.WriteAction(new TurnAction());
        Karlson.WriteAction(new ComeAction());
        Malysh.ReturnEmotion(new HappyEmotion());
    }
}
