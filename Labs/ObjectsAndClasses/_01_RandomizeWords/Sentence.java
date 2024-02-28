package Labs.ObjectsAndClasses._01_RandomizeWords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Sentence {
    private final List<String> sentence;
    private final int count;
    private final Random rnd;

    public Sentence(String sentence) {
        this.sentence = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        this.count = this.sentence.size();
        this.rnd = new Random();
    }

    public String getRandomWord() {
        if (!this.sentence.isEmpty()) {
            int index = this.rnd.nextInt(this.sentence.size());
            return this.sentence.remove(index);
        } else {
            return "";
        }
    }

    public int getRandomWordsCount() {
        return this.count;
    }
}
