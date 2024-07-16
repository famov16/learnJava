/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mozvil
 */
public class SetCollection {
    
    private static void testSet(){
        Set s = new HashSet();
        s.add("uno");
        s.add("dos");
        s.add("tres");
        s.add("uno");
        s.add("cuatro");
        s.add("dos");
        
        System.out.println("s.size() : " + s.size());
    }
    
    private static void equalsTest(){
        Object ob1 = new String("500");
        Object ob2 = new String("005");
        System.out.println(ob1.hashCode() + " : " + ob2.hashCode());
    }
    
    public static void main(String[] args) {
        testSet(); 
        equalsTest();
    }
}
