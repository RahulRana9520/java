import java.util.*;

class WordExample {
    private String strdata;

    public WordExample(String str) {
        if (str.endsWith(".") || str.endsWith("?") || str.endsWith("!")) {
            this.strdata = str.trim();
        } else {
            throw new IllegalArgumentException("Sentence must end with '.', '?' or '!'");
        }
    }

    private boolean isVowel(char ch) {
        return "AEIOU".indexOf(ch) != -1;
    }

    public void countWord() {
        String[] words = strdata.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.length() > 1 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                count++;
            }
        }

        System.out.println("Number of words beginning and ending with a vowel: " + count);
    }

    public void placeWord() {
        String[] words = strdata.split("\\s+");
        List<String> vowelWords = new ArrayList<>();
        List<String> otherWords = new ArrayList<>();

        for (String word : words) {
            if (word.length() > 1 && isVowel(word.charAt(0)) && isVowel(word.charAt(word.length() - 1))) {
                vowelWords.add(word);
            } else {
                otherWords.add(word);
            }
        }

        vowelWords.addAll(otherWords);
        System.out.println("Rearranged sentence: " + String.join(" ", vowelWords));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence ending with '.', '?' or '!': ");
        String sentence = sc.nextLine().toUpperCase();

        try {
            WordExample obj = new WordExample(sentence);
            obj.countWord();
            obj.placeWord();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
