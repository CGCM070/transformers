package org.iesvdm.transformer;

@FunctionalInterface  //porque solo tiene un metodo abstracto
public interface Transformer<T>{
    public T transform(T obj);
}

