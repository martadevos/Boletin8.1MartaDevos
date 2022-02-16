package E3;

import java.util.Scanner;

public class MainE3 {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int[] asientos= new int[20];
        int n=0;
        for (int i=0; i<20; i++){
            asientos[i]=0;
        }
        for (int lugar:asientos){
            if (lugar==0){
                System.out.print((n+1)+"  ");
            }
            n++;
        }
        asientosLibres(asientos);
    }
    public static boolean esFumador(){
        Scanner s=new Scanner(System.in);
        System.out.println("Introduzca 1 si desea sentarse en fumadores y 0 si desea sentarse en no fumadores");
        return s.nextInt()==1;
    }
    public static void asientosLibres(int[] asientos){
        int sitios=0;
        boolean libre=false;
        System.out.println("Los asientos libres son:");
        for (int veces=0; veces<2&&!libre; veces++){
            if (esFumador()) {
                for (int lugar = 16; lugar > 15 && lugar < 20; lugar++) {
                    sitios=comprobarAsientos(asientos[lugar], lugar);
                    int sitios=0;
                    System.out.print((lugar + 1) + "  ");
                    sitios++;
                    return sitios;
                }
            } else {
                for (int lugar = 0; lugar < 16; lugar++) {
                    sitios=comprobarAsientos(asientos[lugar], lugar);
                }
            }
            if (sitios>0) {
                libre=true;
            }else {
                System.out.println("No hay sitios libres en esta categoría");
            }
        }
        if (libre){
            System.out.println("No hay sitios libres, elija otro vuelo");
        }
    }
    public static boolean comprobarAsientos(int asiento){
        return asiento == 0;
    }
    public static void asignarAsientos(){
        int asiento, asientoIntr;
        System.out.println("Introduzca el asiento que desea ");
        asientoIntr=s.nextInt();
        if (comprobarAsientos(asientoIntr)){
            asiento=asientoIntr;
        }else {
            System.out.println("");
        }
    }
}