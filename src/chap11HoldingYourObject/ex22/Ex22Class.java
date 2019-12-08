package chap11HoldingYourObject.ex22;

import net.mindview.util.TextFile;

import java.util.*;

class Word {
    String strWord;
    int wordCount;

    Word(String srtWord, int wordCount){
        this.strWord = srtWord;
        this. wordCount = wordCount;
    }

    @Override
    public String toString() {
        return strWord + " : " + wordCount;
    }
}

public class Ex22Class {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>(
                new TextFile("src\\chap11HoldingYourObject\\ex20\\SetOperations.java", "\\W+"));
        Collections.sort(words, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Words to work again:");
        System.out.println(words);
        Iterator<String> it = words.iterator();
        Set<Word> wordOjects = new HashSet<Word>();
        while(it.hasNext()){
            int count = 0;
            String s = it.next();
//            System.out.println("String: " + s);
//            System.out.println("Words sire : " + words.size());
            for(int i = 0; i < words.size(); i++){
                if(s.equals(words.get(i))){
                    count++;
                }
            }
            wordOjects.add(new Word(s, count));
        }
        System.out.println(wordOjects);
    }
}
