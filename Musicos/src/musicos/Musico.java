/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicos;

import instrumentos.*;
import instrumentos.Instrumento;

/**
 *
 * @author X550Z
 */
public class Musico implements Afinar{

    private String rol = "";
    private Instrumento ins;
    private double rd = Math.random();
    private boolean disponibilidad;

    private int num = (int) (Math.random() * 4);
    private String tipo[] = {"Cuerdas", "Vientos", "Percusion", "Voz"};

    public Musico() {
        rol = tipo[num];
        if (rol == "Cuerdas") {
            ins = new Cuerdas();
        } else if (rol == "Vientos") {
            ins = new Vientos();
        } else if (rol == "Percusion") {
            ins = new Percusion();
        } else {
            ins = new Voz();
        }
        if (rd < 0.5) {
            disponibilidad = true;
        } else {
            disponibilidad = false;
        }
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public String nombreInst() {
        return ins.getNombre();
    }

    public String getRol() {
        return rol;
    }
    

    public void setRol(String rol) {
        this.rol = rol;
    }
    public String tocar(){
        //instrumento.tocar()
        return "♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫♪♫...";
    }

    @Override
    public void afinacion() {
        this.ins.afinacion();
    }

}
