public class TurnAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.TURN;
    }

    @Override
    public String DoAction() {
        return "8 лет";
    }
}
