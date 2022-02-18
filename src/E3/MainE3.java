package E3;

import java.util.Scanner;

public class MainE3 {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int[] asientos= new int[20];
        int libre=20;
        for (int i=1; i<21; i++) {
            System.out.println("Se va a reservar un nuevo asiento para el vuelo");
            boolean fuma = Utilidades.esFumador();
            fuma = Avion.asientosLibres(asientos, fuma);
            int lugar = Avion.asignarAsientos(asientos, fuma);
            asientos[lugar]=1;
            libre--;
        }
        if (libre==0){
            System.out.println();
            System.out.println("No hay sitios libres, el siguiente vuelo disponible es a las "+(int)(Math.random()*24)+":"+(int)(Math.random()*60)+" horas");
        }
    }
}