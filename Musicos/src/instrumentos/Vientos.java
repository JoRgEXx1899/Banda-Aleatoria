/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author X550Z
 */
public class Vientos extends Instrumento {

    private String opc[] = {"Flauta", "Trompeta", "Clarinete", "trombon", "Saxofon"};
    private int random = (int) (Math.random() * 5);
    private String nombre = opc[random];

    public Vientos() {
        this.setNombre(nombre);
        this.setAfinado(false);
    }

    @Override
    public void afinacion() {
        if (this.isAfinado() != true) {
            System.out.println("Ajustando boquilla");
            this.setAfinado(true);
        }
    }

}
