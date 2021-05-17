package com.animal;


import jdk.jshell.spi.ExecutionControl;

public class Parinte { /* Program to abstractions not concretions */

    public enum TipAnimal {
        PESTE,
        CAINE,
        PISICA
    };

    private Peste cumparaPeste() {
        Peste peste = new Peste();
        return peste;
    }

    private Caine cumparaCaine() {
        Caine caine = new Caine();
        return caine;
    }

    private IAnimal cumparaAnimal(TipAnimal tipAnimal) {
        IAnimal animal;
        switch (tipAnimal) {
            case CAINE:
                animal = new Caine();
                return animal;
            case PESTE:
                animal = new Peste();
                return animal;
            case PISICA:
                animal = new Pisica();
                return animal;
        }
        return null;
    }

    public static void main(String[] args) throws ExecutionControl.NotImplementedException {
        Parinte parinte = new Parinte();
        IAnimal animal = parinte.cumparaAnimal(TipAnimal.PISICA);
//        animal.adapa( );
        animal.curata();
        animal.hraneste();
//        animal.plimba();
    }
}
