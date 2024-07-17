/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mozvil
 */
public class ListCollection {

    private static void arrayListTest() {
        List list = new ArrayList();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        list.add("uno");
        list.add("cuatro");
        list.add("dos");
        list.add("cinco");
        list.add("seis");;
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
        
        // list.get(indice para obtener desde 0)
    }
    private static void linkendListTest() {
        List list = new LinkedList();
        list.add("uno");
        list.add("dos");
        list.add("tres");
        list.add("uno");
        list.add("cuatro");
        list.add("dos");
        list.add("cinco");
        list.add("seis");;
        for (Iterator iterator = list.iterator(); iterator.hasNext();) {
            String next = (String) iterator.next();
            System.out.println(next);
        }
        
        // list.get(indice para obtener desde 0)
    }

    public static void main(String[] args) {

        arrayListTest();
    }

}
