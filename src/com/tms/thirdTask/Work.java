package com.tms.thirdTask;

@FunctionalInterface
public interface Work<T> {
    T func(T t);
}
