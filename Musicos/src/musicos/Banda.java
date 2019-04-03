/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package musicos;

/**
 *
 * @author X550Z
 */
public class Banda implements ImprimirInfo {

    private int grupo = 20;
    private Musico banda[] = new Musico[grupo];
    

    Musico disponibles[];

    
     

    public Banda() {
        this.crearBanda();
        this.revisarDisp();
        
    }

    public void crearBanda() {
        for (int i = 0; i < grupo; i++) {
            banda[i] = new Musico();
        }
    }

    public int revisarDisp() {
        int disp = 0;
        for (int i = 0; i < grupo; i++) {
            if (banda[i].isDisponibilidad()==true) {
                disp++;
            }
        }
        return disp;
    }
    public Musico getBandaPosi(int pos){
        return this.banda[pos];
    }
    public int tamano(){
        return this.banda.length;
    }

    

    @Override
    public void imprimir(int dispo, Musico disponibles[]) {
        
        System.out.println("numero de integrantes: " + grupo
                + "\n Integrantes disponibles: " + this.revisarDisp()
                + "\n intrumentos de los integrantes disponibles: ");
        for (int i =0;i< dispo;i++) {
            
            System.out.println("\t" + (i+1) + "-  " + disponibles[i].nombreInst());
        }
        System.out.println("Los "+ disponibles.length 
                + " musicos llegan al lugar del toque\n" 
                +"Los musicos van a afinar sus instrumentos:");
        for (int i =0;i< dispo;i++) {
            System.out.print("\t" + (i+1) + "-  ");
            disponibles[i].afinacion();
        }
        System.out.println("Inicia toque:");
        for (int i =0;i< dispo;i++) {
            System.out.println("\t" + (i+1) + "-  "+disponibles[i].tocar());
        }
    }

}
