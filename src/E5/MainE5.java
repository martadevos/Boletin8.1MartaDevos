package E5;

import java.util.Scanner;

public class MainE5 {
    public static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = new int[4];
        int[] numsIntroduc = new int[4];
        boolean salir;
        int iguales = 0, veces=1;
        Utilidades.normas();
        Utilidades.rellenarAleatorio(nums);
        do {
            Utilidades.rellenarTeclado(numsIntroduc);
            iguales=Utilidades.comprobacion(iguales, nums, numsIntroduc);
            salir=Utilidades.ganador(iguales, false);
            iguales=0;
            veces++;
        } while (veces < 13 && !salir);
        Utilidades.perdedor(veces);
    }
}
