package com.company;
public class Metodos {

    public static int[] arrayRandom(int[] array, int max, int min){
        for (int i=0; i<array.length; i++){
            array[i]=(int)(min+Math.random()*(max-min+1));
        }
        return array;
    }

    public static int[] pares(int[] aleatorios){
        int n=0;
        int[] pares=new int[aleatorios.length];
        for (int aleatorio : aleatorios) {
            if (aleatorio % 2 == 0) {
                pares[n] = aleatorio;
                n++;
            }
        }
        return pares;
    }

    public static int[] comprobarArray(int x, int min, int max){
        int n, i=0, m=0;
        int[] nums=new int[x];
        boolean dist=false;
        while (i<x){
            n=(int)(min+Math.random()*(max-min+1));
            do {
                    dist = n != nums[m];
                    m++;
            }while (dist&&m<x);
            m=0;
            if (dist){
                nums[i]=n;
                i++;
            }
        }
        return nums;
    }

    public static int[] primos(int[] aleatorios){
        int n=0;
        int[] primos=new int[aleatorios.length];
        for (int aleatorio : aleatorios) {
            boolean primo=(aleatorio>=2);
            for (int i = aleatorio/2; primo && i >= 2; i--) {
                primo= aleatorio % i != 0;
            }
            if (primo){
                primos[n] = aleatorio;
                n++;
            }
        }
        return primos;
    }

    public static int posicionArray (int[] array, int num){
        int pos=0;
        boolean igual=false;
        for (int i=0; !igual && i<array.length;i++){
            igual= num==array[i];
            pos=i;
        }
        if (!igual){
            pos=-1;
        }
        return pos;
    }

    public static int[] delReves(int[] array){
        int[] delReves= new int[array.length];
        int i=0;
        for (int nums: array){
            int volteado=0;
        while (nums > 0) {
            volteado = (volteado * 10) + (nums % 10);
            nums /= 10;
        }
        delReves[i]=volteado;
        i++;
        }
        return delReves;
    }

    public static void main(String[] args) {
        int[] array=new int[20];
        //int[] array2=new int[20];
        arrayRandom(array, 1001, 0);
        array[15]=545;
        //array2=delReves(array);
        int pos=posicionArray(array, 545);
        for (int i=0; i<20; i++) {
            System.out.print(array[i]+"   ");
        }
        System.out.println();
        System.out.println(pos);
       /* System.out.println();
        for (int i=0; i<20; i++) {
            System.out.print(array2[i]+"   ");
        }*/
    }
}
