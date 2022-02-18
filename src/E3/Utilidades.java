package E3;

public class Utilidades {
    public static boolean esFumador(){
        System.out.println("Introduzca 1 si desea sentarse en fumadores y otro número para no fumadores");
        return MainE3.s.nextInt()==1;
    }

    public static boolean comprobarAsientoLibre(int asiento){
        return asiento == 0;
    }
}
