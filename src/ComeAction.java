public class ComeAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.COME;
    }

    @Override
    public String DoAction() {
        return " приходит";
    }
}
