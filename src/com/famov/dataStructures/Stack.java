/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

/**
 *
 * @author Mozvil
 */
public class Stack<T> {

    private Object data[];

    private int sp;

    public Stack(int size) {
        data = new Object[size];
        sp = -1;
    }

    public void push(T element) {
        if (sp >= data.length - 1) {
            throw new StackOverflowError();
        }
        sp++;
        data[sp] = element;
    }

    public T pop() {
        if (sp < 0) {
            throw new IllegalStateException("Empty stack.");
        }
        T result = (T) data[sp];
        data[sp] = null; //Avoid memory leak
        sp--;
        return result;
    }

    public T peek() {
        if (sp < 0) {
            throw new IllegalStateException("Empty stack.");
        }
        return (T) data[sp];
    }

    public int getSize() {
        return sp + 1;
    }

    public int length() {
        return data.length;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>(10);

        for (int i = 0; i < st.length(); i++) {
            st.push(i);
            System.out.print(i + " ");
        }
        System.out.println("");
        while (st.getSize() > 0) {
            int i = st.pop();
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println(st.getSize());
        System.out.println(st.length());

    }
}
