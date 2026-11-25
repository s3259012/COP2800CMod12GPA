// DataWrapper.java
// Gabriela Hernandez
// 11/24/2026
// Generic utility class for wrapping and displaying data

package edu.fscj.cop2800c.util;

import java.util.List;

public class DataWrapper<T> {
    private T value;

    // Constructor
    public DataWrapper(T value) {
        this.value = value;
    }

    // Getter method
    public T getValue() {
        return value;
    }

    // Display wrapped objects
    public static <T> void displayList(List<DataWrapper<T>> list) {
        for (DataWrapper<T> element : list) {
            System.out.println(element.getValue());
        }
    }
}