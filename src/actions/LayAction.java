package actions;

import actions.Action;

public class LayAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.LAY;
    }

    @Override
    public String DoAction() {
        return " лежит";
    }
}
