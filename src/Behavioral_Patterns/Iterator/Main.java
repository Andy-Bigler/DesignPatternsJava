package Behavioral_Patterns.Iterator;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new List<>();

        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");

        for (String string : myList)
            System.out.println(string);
    }
}
