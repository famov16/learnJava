
package com.famov.generics;


public class MutableObjectTest {
    
    private static boolean someMethod(MutableObject0 result) {
        result.set("Hola mundo");
        return true;
    }
    
    public static void main(String[] args) {
        String myResult = null;
        
        MutableObject0 byRefArg = new MutableObject0();
        if (someMethod(byRefArg) == true) {
            myResult = (String) byRefArg.get();
        }
        System.out.println(myResult);
    }
}
