package org.example.prototypeExample2;

public interface IPrototype<T extends IPrototype> extends Cloneable{ //<T extends IPrototype> you can clone any object that implement Iproto... interface

    public T clone(); // simple clone

    public T deepClone(); // deep clone
    



}
