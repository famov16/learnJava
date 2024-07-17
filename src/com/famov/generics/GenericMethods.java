/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.generics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Mozvil
 */
public class GenericMethods {
    public static <T> List<T> copySetToList(Set<T> set, List<T> list){
        list.clear();
        for (T element : set) {
            list.add(element);
        }
        
        return list;
    }
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        
        List<String> list = new ArrayList<>();
        list = GenericMethods.<String>copySetToList(set, list);
        for (String s : list) {
            System.out.println(s);
        }
        
    }
}
