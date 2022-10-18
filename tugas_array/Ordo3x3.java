/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tugas_array;

/**
 *
 * @author User
 */
public class Ordo3x3 {
    public static void main(String []args){
        
        int matrix1[][] = new int[3][3];
        matrix1[0][0]=5;
        matrix1[0][1]=9;
        matrix1[0][2]=4;
        matrix1[1][0]=10;
        matrix1[1][1]=8;
        matrix1[1][2]=3;
        matrix1[2][0]=15;
        matrix1[2][1]=7;
        matrix1[2][2]=5;
        
        int matrix2[][] = new int[3][3];
        matrix2[0][0]=3;
        matrix2[0][1]=5;
        matrix2[0][2]=9;
        matrix2[1][0]=12;
        matrix2[1][1]=6;
        matrix2[1][2]=3;
        matrix2[2][0]=12;
        matrix2[2][1]=5;
        matrix2[2][2]=1;
        
        
        System.out.println("Matrix 1");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matrix 2");
        
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[0].length; j++)
            {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Penjumlahan");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] + matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Pengurangan");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] - matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Perkalian");
        
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                int hasil = matrix1[i][j] * matrix2[i][j];
                System.out.print(hasil + " ");
            }
            System.out.println("");
        }
        
    }
}
