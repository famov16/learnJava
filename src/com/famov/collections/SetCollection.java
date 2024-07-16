/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Mozvil
 */
public class SetCollection {

    // HashSet es cuando se guarda el orden segun los ultimos digitos del hashcode pro lo que no tiene orden
    private static void testHashSet() {
        Set s = new HashSet();
        s.add("uno");
        s.add("dos");
        s.add("tres");
        s.add("uno");
        s.add("cuatro");
        s.add("dos");
        s.add("cinco");
        s.add("seis");

        System.out.println("s.size() : " + s.size());
        for (Iterator iterator = s.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
    }

    // LinkedHashSet guarda como hashcode pero aparte generera una lista enlazada y  ordenada segun el ingreso 
    private static void testLinkedHashSet() {
        Set s = new LinkedHashSet();
        s.add("uno");
        s.add("dos");
        s.add("tres");
        s.add("uno");
        s.add("cuatro");
        s.add("dos");
        s.add("cinco");
        s.add("seis");

        System.out.println("s.size() : " + s.size());
        for (Iterator iterator = s.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
    }
        
         
    //Guarda los datos segun el orden natural alpanumericamente
    private static void testTreeSet(){
        Set s = new TreeSet();
        s.add("uno");
        s.add("dos");
        s.add("tres");
        s.add("uno");
        s.add("cuatro");
        s.add("dos");
        s.add("cinco");
        s.add("seis");

        System.out.println("s.size() : " + s.size());
        for (Iterator iterator = s.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
    }

    private static void equalsTest() {
        Object ob1 = new String("500");
        Object ob2 = new String("005");
        System.out.println(ob1.hashCode() + " : " + ob2.hashCode());
    }

    public static void main(String[] args) {
        testTreeSet();
        equalsTest();
    }
}
