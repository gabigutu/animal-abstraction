package com.animal;

import jdk.jshell.spi.ExecutionControl;

public class Pisica implements IAnimal {
    @Override
    public void hraneste() {
        System.out.println("Pisica hraneste");
    }

    @Override
    public void adapa() throws ExecutionControl.NotImplementedException {
        System.out.println("Pisica adapa");
    }

    @Override
    public void curata() {
        System.out.println("Pisica curata");
    }

    @Override
    public void plimba() throws ExecutionControl.NotImplementedException {
        System.out.println("Pisica plimba");
    }
}
