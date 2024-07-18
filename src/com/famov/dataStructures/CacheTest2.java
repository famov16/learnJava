/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.dataStructures;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;


/**
 *
 * @author Mozvil
 */
public class CacheTest2 {


    class Cache {

        int size;
        private java.util.LinkedList<SlowWord> list;
        
        
        public Cache(int size) {
            this.size = size;
            list = new java.util.LinkedList<>();
        }

     
        void add(SlowWord element) {
            list.addFirst(element);
            if (list.size() > size) 
                list.remove();
        }

        SlowWord get(String word) {
            
            for(Iterator<SlowWord> it = list.iterator(); it.hasNext();){
                SlowWord sw = it.next();
                if (sw.word.equals(word)) {
                    it.remove();
                    list.addFirst(sw);
                    System.out.println("               Hit");
                    return sw;
                }
            }

            SlowWord sw = new SlowWord(word);
            add(sw);
            System.out.println("              Miss");
            return sw;
        }
        
        int getSize(){
            return this.list.size();
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
                CacheTest2.class.getResourceAsStream("/com/famov/oop/quijote.txt")));

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
        new CacheTest2().run();
    }

}
