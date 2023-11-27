package emotions;

public class SadEmotion extends Emotion {
    @Override
    public Emotions GetEmotion() {
        return Emotions.SAD;
    }

    @Override
    public String ShowEmotion() {
        return " грустит";
    }
}
