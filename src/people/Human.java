package people;

import actions.IAction;
import emotions.IEmotion;
import locations.ILocation;
import seasons.ISeason;

public abstract class Human
{
    public String Name;
    protected IWriter Writer;
    public abstract void WriteAction(IAction act);
    public abstract void ReturnEmotion(IEmotion emo);
    public abstract void ShowLocation(ILocation loc);
    public abstract void WriteSeason(ISeason seas);

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Human others = (Human) obj;
        return this.Name == others.Name;
    }

    public int hashCode() {
        return this.Name.hashCode() * this.Writer.hashCode();
    }

    public String toString() {
        return this.Name;
    }
}
