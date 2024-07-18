/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author Mozvil
 */
public class CacheTest {

    class CacheNode {

        SlowWord slowWord;
        CacheNode next;

        public CacheNode(SlowWord slowWord) {
            this.slowWord = slowWord;
            next = null;
        }

    }

    class Cache {

        int size;
        int count;

        private CacheNode head;

        public Cache(int size) {
            this.size = size;
            count = 0;
        }

        private void addNode(CacheNode newNode) {
            if (head == null) {
                head = newNode;

            } else {
                newNode.next = head;
                head = newNode;

            }
            count++;
        }
        
        private void removeNode(CacheNode old){
            if(head == null){
                return;
            }
            CacheNode prev = null;
            CacheNode cur = head;
            while ((cur != null) &&(cur != old)) {
                prev = cur;
                cur = cur.next;

            }
            if(cur !=null){
                if(prev ==null){
                    head = cur.next;
                }else 
                    prev.next = cur.next;
                count--;
            }
        }
        private void removeLast() {
            if (head == null) 
                return;

            CacheNode  node = head;
            while(node.next != null){
                node = node.next;
            }
            removeNode(node);
        }

        void add(SlowWord element) {
            CacheNode newNode = new CacheNode(element);

            addNode(newNode);
            if (count > size) {
               removeLast();
            }

        }

        SlowWord get(String word) {
            CacheNode node = head;
            while (node != null) {
                if (node.slowWord.word.equals(word)) {
                    removeNode(node);
                    addNode(node);
                    System.out.println("               Hit");
                    return node.slowWord;
                }

                node = node.next;
            }

            SlowWord sw = new SlowWord(word);
            add(sw);
            System.out.println("              Miss");
            return sw;
        }
        
        int getSize(){
            return this.count;
        }

    }

    class SlowWord {

        String word;

        public SlowWord(String word) {
            this.word = word;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }

        String getWord() {
            return this.word;
        }
    }

    private void run() throws Exception {
        Set<String> words = new HashSet<>();
        int nLines = 0;
        int nWords = 0;

        Cache cache = new Cache(256);

        BufferedReader br = new BufferedReader(new InputStreamReader(
                CacheTest.class.getResourceAsStream("/com/famov/oop/quijote.txt")));

        String line = br.readLine();
        nLines++;
        while (line != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String word = st.nextToken().trim();
                if (word.length() > 0) {
                    words.add(word);

                    SlowWord sw = cache.get(word);
                    //SlowWord sw = new SlowWord(word);
                    System.out.println(sw.getWord() + "( " + cache.getSize() + ")");
                    nWords++;
                }
            }
            line = br.readLine();
            nLines++;
        }
        br.close();
        System.out.println("Lines : " + nLines);
        System.out.println("Words: " + nWords);
        System.out.println("Distinct words: " + words.size());

    }

    public static void main(String[] args) throws Exception {
        new CacheTest().run();
    }

}
