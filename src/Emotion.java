public abstract class Emotion implements IEmotion {
    public abstract Emotions GetEmotion();
    public abstract String ShowEmotion();

    @Override
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass())
            return false;
        Emotion others = (Emotion) obj;
        return this.GetEmotion() == others.GetEmotion() && this.ShowEmotion() == others.ShowEmotion();
    }

    public int hashCode() {
        return this.GetEmotion().hashCode() * this.ShowEmotion().hashCode();
    }

    public String toString() {
        return this.ShowEmotion();
    }
}
