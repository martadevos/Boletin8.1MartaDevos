package E2;

import java.util.Scanner;

public class MainE2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int numAlumnos, resp;
        System.out.println("Introduzca el número de alumnos");
        numAlumnos=s.nextInt();
        int[] notas=new int[numAlumnos];
        E1.Metodos.arrayRandom(notas, 1, 10);
        System.out.print("Las notas son ");
        for (int nota:notas){
            System.out.print(nota+", ");
        }
        System.out.println();
        do {
            menu(notas);
            System.out.println("Para continuar pulse 1 y para salir cualquier otro número");
            resp=s.nextInt();
        } while (resp==1);
    }
    public static void menu(int[] array){
        Scanner s=new Scanner(System.in);
        int resp;
        System.out.println("Introduzca el número de la accion que desea realizar"+
                        System.lineSeparator()+ "1.- nota mas alta"+System.lineSeparator()+
                        "2.- nota mas baja"+System.lineSeparator()+ "3.- nota media"+
                        System.lineSeparator()+ "4.- número de alumnos por encima de la media"+
                        System.lineSeparator()+ "5.- número de alumnos por debajo de la media");
        resp=s.nextInt();
        switch (resp){
            case 1 -> System.out.println("La nota más alta es: "+mayorArray(array));
            case 2 -> System.out.println("La nota más baja es: "+menorArray(array));
            case 3 -> System.out.println("La nota media es: "+mediaArray(array));
            case 4 -> System.out.println("Hay "+bajoMedia(array)+ " alumnos por debajo de la media");
            case 5-> System.out.println("Hay "+encimaMedia(array)+ " alumnos por encima de la media");
        }
    }
    public static int encimaMedia(int[] array){
        int cant=0;
        for (int num:array){
            if (num>mediaArray(array)){
                cant++;
            }
        }
        return cant;
    }
    public static int bajoMedia(int[] array){
        int cant=0;
        for (int num:array){
            if (num<mediaArray(array)){
                cant++;
            }
        }
        return cant;
    }
    public static int mayorArray (int[] array){
        int mayor=array[0];
        for (int num: array){
            if (num>mayor){
                mayor=num;
            }
        }
        return mayor;
    }
    public static int menorArray (int[] array){
        int menor=array[0];
        for (int num: array){
            if (num<menor){
                menor=num;
            }
        }
        return menor;
    }
    public static double mediaArray(int[] array){
        int suma=0;
        for (int num:array){
            suma+=num;
        }
        return (double) suma/array.length;
    }
}
