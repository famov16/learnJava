/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Mozvil
 */
public class SortListFiles {

    private static boolean isDigit(char ch) {
        return (ch >= '0') && (ch <= '9');
    }

    public static void sortFilesNames() {
        List<String> list = new ArrayList<>();
        list.add("Archivo 1.txt");
        list.add("Archivo 2.txt");
        list.add("Archivo 3.txt");
        list.add("Archivo 4b.txt");
        list.add("Archivo 0004a.txt");
        list.add("Archivo 10.txt");
        list.add("Archivo 11.txt");
        list.add("Archivo 12.txt");
        list.add("Archivo 20.txt");
        list.add("Archivo 21.txt");
        list.add("Archivo 21.21.txt");
        list.add("Archivo 21.2.txt");
        list.add("Archivo 21.12txt");
        list.add("Prueba.txt");
        list.add("Prueba.exe");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int idx1 = 0;
                int idx2 = 0;
                while ((idx1 < s1.length()) && (idx2 < s2.length())) {
                    char ch1 = s1.charAt(idx1);
                    char ch2 = s2.charAt(idx2);
                    /* if (ch1 > ch2) {
                      return 1;
                  }else if (ch1<ch2) {
                      return -1;
                  }
                  idx++;
                     */

                    if (isDigit(ch1) && isDigit(ch2)) {
                        StringBuilder sb1 = new StringBuilder();
                        StringBuilder sb2 = new StringBuilder();
                        while (isDigit(ch1)) {
                            sb1.append(ch1);
                            idx1++;
                            if (idx1 >= s1.length() - 1) {
                                break;
                            }
                            ch1 = s1.charAt(idx1);
                        }
                        while (isDigit(ch2)) {
                            sb2.append(ch2);
                            idx2++;
                            if (idx2 >= s2.length() - 1) {
                                break;
                            }
                            ch2 = s2.charAt(idx2);
                        }
                        
                        int i1= Integer.parseInt(sb1.toString());
                        int i2= Integer.parseInt(sb2.toString());
                        
                        if(i1!=i2)
                            return i1 - i2;
                        else
                            continue;
                        
                    } else {
                        if (ch1 != ch2) {
                            return ch1 - ch2;
                        }
                    }

                    idx1++;
                    idx2++;
                }
                if (s1.length() == s2.length()) {
                    return 0;
                } else if (s1.length() > s2.length()) {
                    return -1;
                } else {
                    return 1;
                }

            }
        });

        for (String ar : list) {
            System.out.println(ar);
        }

    }

    public static void main(String[] args) {
        sortFilesNames();
    }
}
