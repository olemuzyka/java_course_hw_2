package com.company;

public class Main {

    public static void main(String[] args) {
        char[][] arr = new char[5][5];
        char s = '*';
        for (int i = 0; i < arr.length; i++) {
            int a = arr.length-1;
            int b = -1;
            for (int j = 0; j < arr[i].length; j++) {
                if (i < a-- && j <= arr.length - b++) {
                    arr[i][j] = ' ';
                }else{
                    arr[i][j] = '*';
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
