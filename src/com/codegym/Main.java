package com.codegym;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số của ma trận vuông: ");
        int edge = scanner.nextInt();
        int[][] matrix = new int[edge][edge];


        for (int row = 0; row < edge; row++) {
            for (int column = 0; column < edge; column++) {
                matrix[row][column] = (int) (Math.random() * 100);
            }
        }
        System.out.println("In ma trận ra màn hình: ");
        for (int row = 0; row < edge; row++) {
            for (int column = 0; column < edge; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println("");
        }

        System.out.println("Tổng của đường chéo chính là:");
        int total1 = 0;
        for (int row = 0; row < edge; row++) {
            for (int column = 0; column < edge; column++) {
                if (row == column){
                    total1 += matrix[row][column];
                }
            }
        }
        System.out.println(total1);

        System.out.println("Tổng của đường chéo phụ là:");
        int total2 = 0;
        for (int row = 0; row < edge; row++) {
            for (int column = 0; column < edge; column++) {
                if (row + column == edge - 1){
                    total2 += matrix[row][column];
                }
            }
        }
        System.out.println(total2);
    }
}