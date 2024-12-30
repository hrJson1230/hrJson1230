import edu.princeton.cs.algs4.*;
public class RandomWord {
    public static void main(String args[]){
        String st = StdIn.readLine();
        String words = randomWord(st);
        System.out.println(words);
    }
    private static String randomWord(String input){
        String[] words = input.split("\\s");
        int randomIndex = StdRandom.uniformInt(words.length);
        return words[randomIndex];
    }
}
