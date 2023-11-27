package actions;

import actions.Action;

public class CryAction extends Action {
    @Override
    public Actions GetAction() {
        return Actions.CRY;
    }

    @Override
    public String DoAction() {
        return " плачет";
    }
}
