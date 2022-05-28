package Homework03;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {



        LinkedList<String> list = new LinkedList<String>();
        list.add(0,"One");
        list.add(1,"Two");
        list.add(2,"Three");
        list.add(3,"Four");
        list.addLast("Five");


        System.out.println("This is the LinkedList: "+list);

        LinkedList<String> reverse = new LinkedList<String>();
        for(int i = list.size()-1; i>=0;i--){
            reverse.add(list.get(i));
        }
        System.out.println("This is the reverse list "+reverse);


    }
}
