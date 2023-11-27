package emotions;

public class MissingEmotion extends Emotion {
    @Override
    public Emotions GetEmotion() {
        return Emotions.MISSING;
    }

    @Override
    public String ShowEmotion() {
        return " скучает";
    }
}
