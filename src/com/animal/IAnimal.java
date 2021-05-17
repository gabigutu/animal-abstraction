package com.animal;

import jdk.jshell.spi.ExecutionControl;

public interface IAnimal {

    void hraneste();
    void adapa() throws ExecutionControl.NotImplementedException;
    void curata();
    void plimba() throws ExecutionControl.NotImplementedException;

}
