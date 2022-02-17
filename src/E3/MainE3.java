package E3;

import java.util.Scanner;

public class MainE3 {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int[] asientos= new int[20];
        int libre=20, cant;
        for (int i=1; i<21; i++) {
            System.out.println("Se va a reservar un nuevo asiento para el vuelo");
            boolean fuma = esFumador();
            fuma = asientosLibres(asientos, fuma);
            int lugar = asignarAsientos(asientos, fuma);
            asientos[lugar]=1;
            libre--;
        }
        if (libre==0){
            System.out.println();
            System.out.println("No hay sitios libres, el siguiente vuelo disponible es a las "+(int)(Math.random()*24)+":"+(int)(Math.random()*60)+" horas");
        }
    }
    public static boolean esFumador(){
        System.out.println("Introduzca 1 si desea sentarse en fumadores y otro número para no fumadores");
        return s.nextInt()==1;
    }
    public static boolean asientosLibres(int[] asientos, boolean fuma){
        int sitios=0;
        boolean libre=false;
        System.out.println("Los asientos libres son:");
        for (int veces=0; veces<2&&!libre; veces++){
            if (fuma) {
                for (int lugar = 16; lugar > 15 && lugar < 20; lugar++) {
                    sitios=escribirAsientos(asientos, lugar, sitios);
                }
            } else {
                for (int lugar = 0; lugar < 16; lugar++) {
                    sitios=escribirAsientos(asientos, lugar, sitios);
                }
            }
            if (sitios>0) {
                libre=true;
            }else {
                System.out.println();
                System.out.println("No hay sitios libres en esta categoría");
                fuma=esFumador();
            }
        }
        return  fuma;
    }
    public static int escribirAsientos(int[] asientos, int lugar, int sitios){
        if (comprobarAsientoLibre(asientos[lugar])) {
            System.out.print((lugar + 1) + "  ");
            sitios++;
        }
        return sitios;
    }
    public static boolean comprobarAsientoLibre(int asiento){
        return asiento == 0;
    }
    public static int asignarAsientos(int[] asiento, boolean fuma){
        int lugarIntr=0;
        boolean seguir=true;
        while (seguir) {
            System.out.println("Introduzca el asiento que desea ");
            lugarIntr=s.nextInt()-1;
            if (fuma && lugarIntr>15 && lugarIntr<20) {
                if (asientoCorrecto(asiento, lugarIntr)){
                    seguir=false;
                }
            }else  if (fuma && lugarIntr<15 || lugarIntr>20){
                System.out.println("El asiento no es correcto");
            }
            if (!fuma && lugarIntr>-1 && lugarIntr<=15) {
                if (asientoCorrecto(asiento, lugarIntr)){
                    seguir=false;
                }
            }else  if (!fuma && lugarIntr<-1 || lugarIntr>15){
                System.out.println("El asiento no es correcto");
            }
        }
        return lugarIntr;
    }
    public static boolean asientoCorrecto(int[] asiento, int lugarIntr){
        if (comprobarAsientoLibre(asiento[lugarIntr])) {
            return true;
        } else {
            System.out.println("ese asiento no está disponible, elija otro");
            return false;
        }
    }

}