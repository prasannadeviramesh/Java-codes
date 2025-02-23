public class RepeatedWords {
    public static void main(String[] args) {
       
        String str = "Hi Iam prasanna Iam from mayiladuthurai  ,";
        
        // Convert the string to lowercase to make the counting case-insensitive
        str = str.toLowerCase();

        // Create an array to store words (we'll split the words manually)
        String[] words = new String[100];  // assuming no more than 100 words
        int wordCount = 0;
        
        // Split the string into words manually (without using split())
        String word = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                if (!word.isEmpty()) {
                    words[wordCount] = word;
                    wordCount++;
                    word = "";
                }
            } else {
                word += ch;
            }
        }
        // To add the last word
        if (!word.isEmpty()) {
            words[wordCount] = word;
            wordCount++;
        }

        // Count repeated words manually
        for (int i = 0; i < wordCount; i++) {
            int count = 1;
            if (words[i] != null) {
                // Check if this word has been counted already
                for (int j = i + 1; j < wordCount; j++) {
                    if (words[i].equals(words[j])) {
                        count++;
                        words[j] = null;  // Mark the word as counted by setting it to null
                    }
                }
                // Print the word and its count if it is repeated
                if (count > 1) {
                    System.out.println(words[i] + ": " + count);
                }
            }
        }

        // Print the total number of words
        System.out.println("\nTotal word count: " + wordCount);
    }
}
