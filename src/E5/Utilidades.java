package E5;

public class Utilidades {
    public static int[] rellenarArray (int[] array, int n){
        for (int i = 0; i < 4; i++){
            array[i] = n;
            System.out.println(array[i]+" ");
        }
        return array;
    }
}
