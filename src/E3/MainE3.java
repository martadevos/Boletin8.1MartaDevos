package E3;

import java.util.Scanner;

public class MainE3 {
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
    }
    public static boolean esFumador(){
        Scanner s=new Scanner(System.in);
        System.out.println("Introduzca 1 si es fumador y 0 si no lo es");
        return s.nextInt()==1;
    }
    public static void asientosLibres(int[] asientos){
        int libres=0;
        System.out.println("Los asientos libres son:");
        if (esFumador()){
            for (int lugar=16; lugar>15 && lugar<20; lugar++) {
                if (asientos[lugar] == 0) {
                    System.out.print((lugar+1) + "  ");
                    libres++;
                }
            }
        }else {
            for (int lugar=0; lugar<16; lugar++) {
                if (asientos[lugar] == 0) {
                    System.out.print((lugar+1) + "  ");
                    libres++;
                }
            }
        }
    }
}
