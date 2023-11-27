package actions;

import actions.Action;

public class WaitAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.WAIT;
    }

    @Override
    public String DoAction() {
        return " ждёт";
    }
}
