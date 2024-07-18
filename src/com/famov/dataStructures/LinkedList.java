/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

/**
 *
 * @author Mozvil
 */
public class LinkedList<T> {

    private DNode<T> head;
    private DNode<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public DNode<T> add(T data) {
        DNode<T> newNode = new DNode<>();
        newNode.data = data;
        if (head == null) { // Lista vacía
            head = newNode;
            tail = newNode;
        } else { // Lista no vacía
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        return newNode;
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }
        DNode<T> temp = head;
        DNode<T> prev = null;
        while ((temp != null) && (!temp.data.equals(data))) {
            prev = temp;
            temp = temp.next;
        }
        if (temp != null) {
            if (prev == null) {
                head = head.next;
                head.prev = null;
            } else {
                prev.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = prev;
                }

            }

        }

    }

    public void printList() {
        DNode<T> current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    
    public void printListReverse() {
        DNode<T> current = tail;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}
