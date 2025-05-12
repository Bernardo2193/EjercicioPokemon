package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();

        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        charmander.atacarAraniazo();
        charmander.atacarLanzaLLamas();
        bulbasaur.atacarAraniazo();
        pikachu.atacarPunioTrueno();
        pikachu.atacarAraniazo();
    }

    }
