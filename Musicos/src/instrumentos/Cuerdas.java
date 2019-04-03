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
public class Cuerdas extends Instrumento {

    private String opc[] = {"Guitarra", "Bajo", "Violin", "Ukelele"};
    private int random = (int) (Math.random() * 4);
    private String nombre = opc[random];

    public Cuerdas() {
        this.setNombre(nombre);
        this.setAfinado(false);
    }

    @Override
    public void afinacion() {
        if (this.isAfinado() != true) {
            System.out.println("Ajustando cuerdas");
            this.setAfinado(true);
        }
    }

}
