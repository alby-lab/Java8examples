package com.demo.java8;

public interface B {
	default void printName() {
        System.out.println("from B");
    }
}
