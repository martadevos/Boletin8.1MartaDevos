package E5;

public class Utilidades {
    public static void normas(){
        System.out.println("Se va a iniciar el juego.");
        System.out.println("Dispone de 12 rondas para adivinar una serie de 4 números del 0 al 9.");
        System.out.println("Cada vez que se acierte se mostrarán tantos 0 como números se hayan acertado,");
        System.out.println("1 por los números cuya posición sea correcta y x en los lugares de los no acertados");
    }

    public static boolean ganador (int iguales, boolean salir){
        System.out.println();
        if (iguales == 4){
            salir = true;
            System.out.println("Felicidades, has acertado todos los números");
        }
        return salir;
    }

    public static void perdedor (int veces){
        if (veces > 12){
            System.out.println("Se te han acabado las oportunidades, has perdido");
        }
    }

    public static void rellenarAleatorio (int [] nums){
        for (int i = 0; i < 4; i++){
            nums[i] = (int)(Math.random()*10);
            System.out.println(nums[i]+" ");
        }
    }

    public static void rellenarTeclado (int [] numsIntroduc){
        System.out.println("Introduzca 4 números del 0 al 9");
        for (int i = 0; i < 4; i++){
            numsIntroduc[i] = MainE5.s.nextInt();
        }
    }

    public static boolean correcto(String i){
        System.out.print(i);
        return true;
    }

    public static int comprobacion(int iguales, int[] nums, int[] numsIntroduc){
        for (int i=0; i<4; i++) {
            boolean esIgual = false;
            if (nums[i] == numsIntroduc[i]){
                esIgual=correcto("1 ");
                iguales++;
            }else {
                for (int m : numsIntroduc) {
                    if (nums[i] == m) {
                        esIgual=correcto("0 ");
                    }
                }
            }if (!esIgual){
                System.out.print("x ");
            }
        }
        return iguales;
    }
}
