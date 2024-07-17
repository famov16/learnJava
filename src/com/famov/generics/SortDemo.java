/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mozvil
 */
public class SortDemo {

    private static void sortDemo1() {
        String arr[] = {
            "x", "m", "c", "u", "i", "o", "d", "a"
        };

        for (String s : arr) {
            System.out.print(s + ", ");
        }
        System.out.println("");

        Arrays.sort(arr);

        for (String s : arr) {
            System.out.print(s + ", ");
        }
        System.out.println("");

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int cmp = o1.compareTo(o2);
                if (cmp > 0) {
                    return -1;
                } else if (cmp < 0) {
                    return 1;
                }

                return cmp;
            }
        });

        for (String s : arr) {
            System.out.print(s + ", ");
        }
        System.out.println("");
    }
    
    private static void sortDemo2(){
        List<String> list = new ArrayList<>();
        list.add("x");
        list.add("m");
        list.add("c");
        list.add("u");
        list.add("i");
        list.add("o");
        list.add("d");
        list.add("a");
        list.add("w");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
               return o1.compareTo(o2);
            }
        });
        
        for (String s : list) {
            System.out.print(s +", ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        sortDemo2();
    }
}
