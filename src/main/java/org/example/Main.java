package org.example;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List intList = new LinkedList();
        intList.add ("hola");
        Integer x = (Integer) intList.iterator().next();
        List<String> ls = new LinkedList<>();
        fromArrayToCollection(args, ls);
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }
}