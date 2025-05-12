package org.example;

public class Charmander extends Pokemon implements IFuego  {


    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi Ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi Ataque Araniazo");
    }

    @Override
    protected void atacarMordisco() {
            System.out.println("Hola soy Charmander y este es mi Ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy Charmander y este es mi Ataque Punio Fuego");
    }

    @Override
    public void atacarLanzaLLamas() {
            System.out.println("Hola soy Charmander y este es mi Lanza LLamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy Charmander y este es mi Ataque Ascuas");

    }
}
