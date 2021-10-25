    package at.solutions;

public class Problem1859 {

    public String sortSentence(String s) {
        String[] words = s.split("\\s+");
        String[] byIndex = new String[words.length];

        for(String word : words) {
            int lastIndex = word.length() - 1;
            byIndex[word.charAt(lastIndex) - '0' - 1] = word.substring(0, lastIndex);
        }

        return String.join(" ", byIndex);
    }

}
