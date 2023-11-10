public class CryAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.CRY;
    }

    @Override
    public String DoAction() {
        return "так горько, что сердце разрывается";
    }
}
