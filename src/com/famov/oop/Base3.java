
package com.rcosio.oop;


public class Base3 {
    private String field;
    
    public Base3() {
        field = "Hello";
    }
    
    public static class Nested {
        public void run() {
            // System.out.println("Nested.run: " + field); // error: field inaccesible.
        }
    }
}
