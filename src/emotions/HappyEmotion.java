package emotions;

public class HappyEmotion extends Emotion {

    @Override
    public Emotions GetEmotion() {
        return Emotions.HAPPY;
    }

    @Override
    public String ShowEmotion() {
        return " счастлив";
    }
}
