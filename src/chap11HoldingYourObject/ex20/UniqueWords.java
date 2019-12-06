package chap11HoldingYourObject.ex20;

import net.mindview.util.TextFile;

import java.util.*;

public class UniqueWords {
    static void vowelCounter(Set<String> st) {
        Set<Character> vowels = new TreeSet<Character>();
        Collections.addAll(vowels,
                'U', 'E', 'O', 'A', 'I', 'u', 'e', 'o', 'a', 'i');
        List<Integer> vowelCountValue = new ArrayList<Integer>(vowels.size());
        Map<String, Integer> vowelAppearCount = new HashMap<String, Integer>();

        for (Character c: vowels) {
            String _t = c.toString();
            vowelAppearCount.put(_t, 0);
        }

        int allVowels = 0;
        for(String s : st) {
            int count = 0;
            for(Character v : s.toCharArray()) {
                if(vowels.contains(v)) {
                    count++;
                    allVowels++;
                    if(vowelAppearCount.containsKey(v)){
                        int i = vowelAppearCount.get(v);
                        vowelAppearCount.put(v.toString(), i+1);
                    }
                }
            }
            System.out.print(s + ": " + count + ", ");
        }
        System.out.println();
        System.out.print("Total vowels: " + allVowels);
        // Sort
        List<String> x =  new LinkedList<>(vowelAppearCount.keySet());
        Collections.sort(x, String.CASE_INSENSITIVE_ORDER);
        System.out.println();
        for(String i : x){
            System.out.print("Vowels occurrence: " + i + vowelAppearCount.get(i));
        }
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("src\\chap11HoldingYourObject\\ex20\\SetOperations.java", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}