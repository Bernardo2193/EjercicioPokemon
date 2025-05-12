package org.example;

public class Clefairy extends Pokemon implements IEncantamiento{

    public Clefairy() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Clefairy y este es mi ataque Placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Clefairy y este es mi ataque Araniazo");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Clefairy y este es mi ataque Mordisco");

    }

    @Override
    public void granEncanto() {
        System.out.println("Hola soy Clefairy y este es mi ataque Gran Encanto");

    }

    @Override
    public void muroMagico() {
        System.out.println("Hola soy Clefairy y este es mi ataque Muro Magico") ;

    }
}
