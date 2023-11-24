public class BoredEmotion extends Emotion {
    @Override
    public Emotions GetEmotion() {
        return Emotions.BORED;
    }

    @Override
    public String ShowEmotion() {
        return " утомлен";
    }
}
