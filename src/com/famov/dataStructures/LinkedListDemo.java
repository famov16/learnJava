/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

/**
 *
 * @author Mozvil
 */
public class LinkedListDemo {
    
    private static void nodeDemo(){
        Node n = new Node();
        n.name = "uno";
        n.next = null;  
        
        Node head = n;
        Node tail = head;
        
        n= new Node();
        n.name = "dos";
        n.next = null;
        tail.next = n;
        tail = tail.next;
        
        n = new Node();
        n.name = "tres";
        n.next = null;
        tail.next = n;
        tail = tail.next;
        
        n = head;
        
        while(n !=null){
            System.out.println(n.name);
            n =  n.next;
        }
        
    }
    public static void main(String[] args) {
        nodeDemo();
    }
}
