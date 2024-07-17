
package com.famov.generics;

public class MutableObject<T> {
    private T value;
    
    public MutableObject() {
    }
    
    public MutableObject(T value) {
        this.value = value;
    }
    
    public void set(T value) {
        this.value = value;
    }
    
    public T get() {
        return value;
    }
    
}
