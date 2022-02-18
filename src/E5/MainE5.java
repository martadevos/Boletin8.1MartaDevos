package E5;

import java.util.Scanner;

public class MainE5 {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = new int[4];
        int[] numsIntroduc = new int[4];
        boolean salir = false, esIgual;
        int iguales = 0, veces=1;
        System.out.println("Se va a iniciar el juego.");
        System.out.println("Dispone de 12 rondas para adivinar una serie de 4 números del 0 al 9.");
        System.out.println("Cada vez que se acierte se mostrarán tantos 0 como números se hayan acertado" +
                ", 1 por los números cuya posición sea correcta y x en los lugares de los no acertados");
        nums=Utilidades.rellenarArray(nums, (int)(Math.random()*10));
        while (veces < 13 && !salir) {
            System.out.println("Introduzca 4 números del 0 al 9");
            numsIntroduc=Utilidades.rellenarArray(numsIntroduc, s.nextInt())
            for (int i=0; i<4; i++) {
                esIgual = false;
                if (nums[i] == numsIntroduc[i]){
                    System.out.print(1 + " ");
                    esIgual = true;
                    iguales++;
                }else {
                    for (int m : numsIntroduc) {
                        if (nums[i] == m) {
                            System.out.print(0 + " ");
                            esIgual = true;
                        }
                    }
                }if (!esIgual){
                    System.out.print("x ");
                }
            }
            System.out.println();
            if (iguales == 4){
                salir = true;
                System.out.println("Felicidades, has acertado todos los números");
            }
            iguales=0;
            veces++;
        }
        if (veces > 12){
            System.out.println("Se te han acabado las oportunidades, has perdido");
        }
    }
}
