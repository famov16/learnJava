
package com.famov.generics;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class WildcardsDemo {
    
    public static void process(List<? extends Number> list) {
        /* ... */
    }
    
    public static void process2(List<? super Integer> list) {
        /* ,,, */
    }
    
    public static void processTest() {
        List<Integer> list = new LinkedList<>();
        process(list); // OK
    }
    
    public static int nullCount(Collection<?> list) {
        if (list == null)
            return 0;
        int count = 0;
        for (Object o : list) {
            if (o == null)
                count++;
        }
        return count;
    }
    
    public static void nullCountTest() {
        List<Integer> list = new LinkedList<>();
        int n = nullCount(list); // OK
    }
    
    void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
//        Number temp = l1.get(0);
//        l1.set(0, l2.get(0));   // expected a CAP#1 extends Number,
//                                // got a CAP#2 extends Number;
//                                // same bound, but different types
//        l2.set(0, temp);        // expected a CAP#1 extends Number,
//                                // got a Number
    }
    
    void foo(List<?> i) {
//        i.set(0, i.get(0));
//        fooHelper(i);
    }
    
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
    
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        process(list); // error: incompatible types: List<Integer> cannot be converted to List<Number>
    }
}
