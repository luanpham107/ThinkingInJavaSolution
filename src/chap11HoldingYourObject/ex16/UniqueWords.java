package chap11HoldingYourObject.ex16;

import net.mindview.util.TextFile;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels,
                'U', 'E', 'O', 'A', 'I', 'u', 'e', 'o', 'a', 'i');
        int allVowels = 0;
        for(String s : st) {
            int count = 0;
            for(Character v : s.toCharArray()) {
                if(vowels.contains(v)) {
                    count++;
                    allVowels++;
                }
            }
            System.out.print(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.print("Total vowels: " + allVowels);
    }
    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("src\\chap11HoldingYourObject\\ex16\\SetOperations.java", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}