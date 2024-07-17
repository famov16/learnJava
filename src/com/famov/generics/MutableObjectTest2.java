
package com.famov.generics;

public class MutableObjectTest2 {
    
    private static boolean someMethod(MutableObject<String> result) {
        result.set("Hola mundo");
        return true;
    }
    
    public static void main(String[] args) {
        String myResult = null;
        
        MutableObject<String> byRefArg = new MutableObject<String>();
        if (someMethod(byRefArg) == true) {
            myResult = byRefArg.get();
        }
        System.out.println(myResult);
    }
}
