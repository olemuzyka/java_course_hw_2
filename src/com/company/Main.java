package com.company;

public class Main {

    public static void main(String[] args) {
      int[]array = new int[30];
        for (int i = 0; i <array.length ; i++) {
            //System.out.print(i + " ");
            array[i]=i+1;

        }
        int count = 0;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]%2==0){
                System.out.print(array[i] + " ");
                count++;
            }

        }
        int[]secondArrau = new int[count];
        int x = 0;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]%2==0){
                secondArrau[x]=array[i];
                x++;
            }

        }
        for (int z:secondArrau ) {
            System.out.print(z + " ");
        }
    }
}
