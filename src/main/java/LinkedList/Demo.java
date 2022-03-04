package LinkedList;

import java.util.LinkedList;

public class Demo {
    public static void main(String[] args){
        LinkedList List = new LinkedList();

        List.add("1");
        List.add("2");
        List.add("3");
        List.add("4");
        List.add("5");
        System.out.println("First element is : " + List.getFirst());
        System.out.println("Last element is : " + List.getLast());

    }
}
