/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.generics;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Mozvil
 */
public class DestType {
    public static <T> List<T> loadData() {
        return new LinkedList<>();
    }
    
    public static void toLower(List<String> list) {
        for (int n=0; n<list.size(); n++) {
            list.set(n, list.get(n).toLowerCase());
        }
    }
    
    public static void main(String[] args) {
        List<String> data = loadData();
        toLower(DestType.loadData()); // Error en Java 7
    }
}
