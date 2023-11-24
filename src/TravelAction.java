public class TravelAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.TRAVEL;
    }

    @Override
    public String DoAction() {
        return " приезжает";
    }
}
