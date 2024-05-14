
import java.util.ArrayList;
        import java.util.List;


public class paragraph {
    private List<String> sentences;


    public paragraph(String paragraphText) {
        sentences = new ArrayList<>();
        // Splitting the paragraph into sentences
        String[] splitSentences = paragraphText.split("\\.");
        for (String sentence : splitSentences) {
            // Adding each sentence to the list of sentences
            sentences.add(sentence.trim() + ".");
        }
    }


    public List<String> getSentences() {
        return sentences;
    }


    public void setSentences(List<String> sentences) {
        this.sentences = sentences;
    }


    public void printSentences() {
        for (String sentence : sentences) {
            System.out.println(sentence.trim());
        }
    }



}


