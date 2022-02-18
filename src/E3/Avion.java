package E3;

public class Avion {
    public static boolean asientosLibres(int[] asientos, boolean fuma){
        int sitios=0;
        boolean libre=false;
        System.out.println("Los asientos libres son:");
        for (int veces=0; veces<2&&!libre; veces++){
            if (fuma) {
                    sitios=escribirAsientos(asientos, sitios, 15, 20);
            } else {
                    sitios=escribirAsientos(asientos, sitios, -1, 16);
            }
            if (sitios>0) {
                libre=true;
            }else {
                System.out.println();
                System.out.println("No hay sitios libres en esta categoría");
                fuma=Utilidades.esFumador();
            }
        }
        return  fuma;
    }

    public static int escribirAsientos(int[] asientos, int sitios, int min, int max){
        for (int lugar = min+1; lugar > min && lugar < max; lugar++) {
            if (Utilidades.comprobarAsientoLibre(asientos[lugar])) {
                System.out.print((lugar + 1) + "  ");
                sitios++;
            }
        }
        return sitios;
    }

    public static int asignarAsientos(int[] asiento, boolean fuma){
        int lugarIntr=0;
        boolean seguir=true;
        while (seguir) {
            System.out.println("Introduzca el asiento que desea ");
            lugarIntr=MainE3.s.nextInt()-1;
            if (fuma){
                seguir=asientoCorrecto(asiento, lugarIntr, 15, 20);
            }else {
                seguir=asientoCorrecto(asiento, lugarIntr, -1, 16);
            }
        }
        return lugarIntr;
    }

    public static boolean asientoCorrecto(int[] asiento, int lugarIntr, int min, int max){
        boolean seguir=false;
        if (lugarIntr>min && lugarIntr<max) {
            if (!Utilidades.comprobarAsientoLibre(asiento[lugarIntr])) {
                System.out.println("ese asiento no está disponible, elija otro");
                seguir=true;
            }
        }else{
            System.out.println("El asiento no es correcto");
        }
        return seguir;
    }
}
