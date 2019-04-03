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
public class Voz extends Instrumento{

    private String opc[] = {"Coro", "Vocalista", "Cantante"};
    private int random = (int) (Math.random() * 3);
    private String nombre = opc[random];

    public Voz() {
        this.setNombre(nombre);
        this.setAfinado(false);
    }

    @Override
    public void afinacion() {
        if (this.isAfinado() != true) {
            System.out.println("Practicando escalas");
            this.setAfinado(true);
        }
    }
    
}
