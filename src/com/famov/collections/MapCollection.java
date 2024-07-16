/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;

/**
 *
 * @author Mozvil
 */
public class MapCollection {

    private static void hashMapTest() {
        Map map = new HashMap();
        map.put("uno", 1);
        map.put("dos", 2);
        map.put("tres", 3);
        map.put("cuatro", 4);
        map.put("cinco", 5);

        //System.out.println(map.get("uno"));  
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());

        }

        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("key: " + entry.getKey() + ", value:  " + entry.getValue());

        }
    }

    private static void treeMapTest() {
        Map map = new TreeMap();
        map.put("x", "equis");
        map.put("z", "seta");
        map.put("b", "be");
        map.put("j", "jota");

        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("key: " + entry.getKey() + ", value:  " + entry.getValue());

        }
    }

    private static void propertiesTest1() {
        Properties props = new Properties();
        props.put("color", "rojo");
        props.put("maxMem", "512");
        props.put("mensaje", "Hola mundo!");

        System.out.println(props.get("mensaje"));

        try (OutputStream out = new FileOutputStream("c:/temp/params.props")) {
            props.store(out, "Propiedades de mi aplicacion.");
        } catch (IOException e) {
            System.out.println("Error de escritura.");
        }
    }

    private static void propertiesTest2() {
        Properties props = new Properties();
        try (InputStream in = new FileInputStream("c:/temp/params.props")) {
            props.load(in);
        } catch (IOException e) {
            System.out.println("Error de lectura.");
        }

        System.out.println(props.get("mensaje"));
    }

    public static void main(String[] args) {

        treeMapTest();
        propertiesTest1();
        propertiesTest2();
       
    }
}
