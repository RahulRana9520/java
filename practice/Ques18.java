import java.io.*;

public class Ques18 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("myfile.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words) {
                word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                if (word.length() > 1 && isPalindrome(word)) {
                    count++;
                }
            }
        }

        br.close();
        System.out.println("Total palindromes: " + count);
    }

    static boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
