public class WaitAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.WAIT;
    }

    @Override
    public String DoAction() {
        return "так долго своего дня рождения";
    }
}
