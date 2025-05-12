package org.example;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y  este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y  este es mi ataque Araniazo ");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y  este es mi ataque Mordisco");

    }

    @Override
    public void atacarImpacTrueno() {
        System.out.println("Hola soy Pikachu y  este es mi ataque Impac Trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Pikachu y  este es mi ataque Punio Trueno");

    }
}
