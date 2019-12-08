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
        List<String> sortVowels = new LinkedList<String>();
        Iterator<Character> itChar = vowels.iterator();
        while(itChar.hasNext()){
            sortVowels.add(itChar.next().toString());
        }

        Collections.sort(sortVowels, String.CASE_INSENSITIVE_ORDER);
        System.out.println();
        System.out.println("After sorted: " + sortVowels);

        int allVowels = 0;
        for(String s : st) {
            int count = 0;
            for(Character v : s.toCharArray()) {
                if(vowels.contains(v)) {
                    count++;
                    allVowels++;
                    vowelAppearCount.put(v.toString(), count);
                }
            }
        }
        System.out.println();
        System.out.print("Total vowels: " + allVowels);
        // Sort
//        List<String> x =  new LinkedList<>(vowelAppearCount.keySet());
//        Collections.sort(x, String.CASE_INSENSITIVE_ORDER);
        System.out.println();
        System.out.println("Vowels occurrence: " + vowelAppearCount.values());
        System.out.println(vowelAppearCount);
    }

    public static void main(String[] args) {
        Set<String> words = new TreeSet<String>(
                new TextFile("src\\chap11HoldingYourObject\\ex20\\SetOperations.java", "\\W+"));
        System.out.println(words);
        System.out.println();
        vowelCounter(words);
    }
}