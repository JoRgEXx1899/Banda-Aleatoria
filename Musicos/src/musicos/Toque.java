/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicos;

import instrumentos.*;

/**
 *
 * @author X550Z
 */
public class Toque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Banda nueva = new Banda();
        Musico disponibles[]=new Musico[nueva.revisarDisp()];
        
        int a = 0;
        for (int i = 0; i < nueva.tamano(); i++) {
            if (nueva.getBandaPosi(i).isDisponibilidad()==true) {
                disponibles[a] = nueva.getBandaPosi(i);
                a++;
            }
        }
        
        nueva.imprimir(disponibles.length, disponibles);

        // TODO code application logic here
    }

}
