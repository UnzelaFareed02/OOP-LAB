public class Main {
    public static void main(String[] args) {


        String paragraph = "Object-oriented programming (OOP) is a programming paradigm." + "\n" +
                "Based on the concept 7 of 'objects', which can contain data and code." + "\n" +
                "Data in the form of fields 4 6 (often known as attributes or properties." + "   \n"+
                "And code, in the form of procedures (often known as methods)." + "\n"+
                "In OOP, computer programs are designed by making them out of objects.";


       /*
       // Splitting the paragraph into sentences
       String[] sentences = paragraph.split("\\.");


       // Printing each sentence
       for (String sentence : sentences) {
           System.out.println(sentence.trim() + ".");
       }   */




        // Splitting the paragraph into sentences
        String[] sentences = paragraph.split("\\.");


        // Printing each sentence
        for (String sentence : sentences) {
            System.out.println(sentence.trim() + ".");
            countCharactersAndNumbers(sentence);
        }
    }


    // Method to count characters and numbers
    private static void countCharactersAndNumbers(String sentence) {
        int characterCount = 0;
        int numberCount = 0;
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                characterCount++;
            } else if (Character.isDigit(c)) {
                numberCount++;
            }
        }
        System.out.println("Character count: " + characterCount);
        System.out.println("Number count: " + numberCount);
    }
}
