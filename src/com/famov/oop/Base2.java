
package com.famov.oop;

public class Base2 {
    private String field;
    
    public Base2() {
        field = "Hello";
    }
    
    public class Nested {
        public void run() {
            System.out.println("SubClass.run: " + field);
        }
    }
    
    public void run() {
        System.out.println("Base.run: " + field);
        new Nested().run();
    }
    
    public static void main(String[] args) {
        new Base2().run();
    }
}
