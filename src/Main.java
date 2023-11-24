import static java.lang.Math.random;

public class Main {
    public static void main(String[] args)
    {
        Narrator nar = new Narrator();
        Boy Malysh = new Boy("Малыш", nar);
        Granny Grandma = new Granny("Бабушка", nar);
        PropellerMan Karlson = new PropellerMan("Карлсон", nar);

        int mn = 1;
        int mx = 5;
        int random = (int) (((mx - mn) * random()) + mn);
        switch (random) {
            case 1 -> {
                System.out.println("Сейчас лето :)");
                Malysh.WriteSeason(new SummerSeason());
                Karlson.WriteSeason(new SummerSeason());
                Grandma.WriteSeason(new SummerSeason());
                Malysh.WriteAction(new WaitAction());
                Malysh.WriteAction(new TurnAction());
                Karlson.WriteAction(new ComeAction());
                Malysh.ReturnEmotion(new HappyEmotion());
                Karlson.ReturnEmotion(new HappyEmotion());
                Grandma.WriteAction(new WaitAction());
                Malysh.WriteAction(new TravelAction());
                Karlson.ReturnEmotion(new MissingEmotion());
                Malysh.ShowLocation(new VillageLocation());
                Grandma.ReturnEmotion(new HappyEmotion());
                System.out.println("К сожалению, лето заканчивается, и " + Malysh.Name + " возвращается домой");
                Grandma.ReturnEmotion(new SadEmotion());
            }
            case 2 -> {
                System.out.println("Сейчас осень");
                Malysh.WriteSeason(new AutumnSeason());
                Malysh.WriteAction(new CryAction());
                Karlson.WriteSeason(new AutumnSeason());
                Grandma.WriteSeason(new AutumnSeason());
                Malysh.ShowLocation(new SchoolLocation());
                Karlson.ShowLocation(new SchoolLocation());
                Grandma.ShowLocation(new SchoolLocation());
                Karlson.ShowLocation(new RoofLocation());
                Karlson.WriteAction(new LayAction());
                Karlson.WriteAction(new TravelAction());
                Malysh.ReturnEmotion(new BoredEmotion());
                Karlson.WriteAction(new WaitAction());
                Malysh.WriteAction(new ComeAction());
                Malysh.ShowLocation(new HomeLocation());
                Karlson.ShowLocation(new HomeLocation());
                Grandma.ShowLocation(new VillageLocation());
                Grandma.ReturnEmotion(new MissingEmotion());
                System.out.println("На осенних каникулах " + Malysh.Name + " отдохнул, учился хорошо. Приближаются " +
                        "зимние каникулы");
            }
            case 3 -> {
                System.out.println("Сейчас зима");
                Malysh.WriteSeason(new WinterSeason());
                Karlson.WriteSeason(new WinterSeason());
                Grandma.WriteSeason(new WinterSeason());
                Grandma.WriteAction(new TravelAction());
                Grandma.ShowLocation(new HomeLocation());
                Malysh.ReturnEmotion(new HappyEmotion());
                Grandma.ReturnEmotion(new HappyEmotion());
                Karlson.ReturnEmotion(new HappyEmotion());
                Karlson.WriteAction(new LayAction());
                Grandma.WriteAction(new TurnAction());
                Grandma.WriteAction(new ComeAction());
                Grandma.WriteAction(new LayAction());
                System.out.println("Всё ближе и ближе весна");
            }
            case 4 -> {
                System.out.println("Сейчас весна");
                Malysh.WriteSeason(new SpringSeason());
                Karlson.WriteSeason(new SpringSeason());
                Grandma.WriteSeason(new SpringSeason());
                Malysh.ShowLocation(new SchoolLocation());
                Karlson.ShowLocation(new SchoolLocation());
                Grandma.ShowLocation(new SchoolLocation());
                Karlson.ShowLocation(new RoofLocation());
                Karlson.WriteAction(new LayAction());
                Karlson.WriteAction(new TravelAction());
                Malysh.ReturnEmotion(new BoredEmotion());
                Karlson.WriteAction(new WaitAction());
                Malysh.WriteAction(new ComeAction());
                Malysh.ShowLocation(new HomeLocation());
                Karlson.ShowLocation(new HomeLocation());
                Grandma.ShowLocation(new VillageLocation());
                Grandma.ReturnEmotion(new BoredEmotion());
                Grandma.ReturnEmotion(new MissingEmotion());
                Grandma.WriteAction(new WaitAction());
                System.out.println("Скоро лето :))))");
            }
        }
    }
}
