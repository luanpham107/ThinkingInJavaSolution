package chap11HoldingYourObject.ex04;

import java.util.*;

public class MovieNameGenerator {
    private static int i = -1;
    static ArrayList<String> characterNames = new ArrayList<String>(){
    };

    public MovieNameGenerator(){
        characterNames.add("Leo Messi");
        characterNames.add("Van Dijk");
        characterNames.add("Mohamed Salah");
        characterNames.add("Lampard");
        characterNames.add("Pirlo");
    }
    public Boolean end(){
        if(i++ < characterNames.size() - 1) {
            return false;
        }
        else
            return true;
    }
    public String next(){
        return characterNames.get(i);
    }

    public int size() {
        return characterNames.size();
    }

    public Collection fill(Collection<String> collection){
        for(int j = 0; j < characterNames.size(); j++)
            collection.add(characterNames.get(j));
        return collection;
    }

    public static void main(String[] args) {
        MovieNameGenerator mvCharacter = new MovieNameGenerator();
        System.out.println("Size of mv Character: " + mvCharacter.size());
        ArrayList<String> arrList = new ArrayList<String>();
        LinkedList<String> linkList = new LinkedList<String>();
        HashSet<String> hashSet = new HashSet<String>();
        LinkedHashSet<String> linkHashSet = new LinkedHashSet<String>();
        TreeSet<String> treeSet = new TreeSet<String>();

        System.out.println("Normal add method");
        while(!mvCharacter.end()){
            arrList.add(mvCharacter.next());
            linkList.add(mvCharacter.next());
            hashSet.add(mvCharacter.next());
            linkHashSet.add(mvCharacter.next());
        }
        System.out.println("ArrayList " + arrList);
        System.out.println("LinkList: " +linkList);
        System.out.println("Link Hash Set" + linkHashSet);
        System.out.println("Hash Set " + hashSet);

        System.out.println("Fill collect method");
        treeSet = (TreeSet<String>) mvCharacter.fill(new TreeSet<String>());
        System.out.println("Tree set" + treeSet);
    }

}
