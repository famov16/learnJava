/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

/**
 *
 * @author Mozvil
 */
public class TestLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Lista inicial:");
        list.printList();

        // Remover un elemento
        list.remove(4);

        System.out.println("Lista después de remover 'dos':");
        list.printList();
    }

}
