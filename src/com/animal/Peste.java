package com.animal;

import jdk.jshell.spi.ExecutionControl;

public class Peste implements IAnimal {

    public void hraneste() {
        System.out.println("Peste hraneste");
    }

    @Override
    public void adapa() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu poti adapa un peste!");
    }

    public void curata() {
        System.out.println("Peste curata");
    }

    @Override
    public void plimba() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Nu poti plimba un peste!");
    }

}
