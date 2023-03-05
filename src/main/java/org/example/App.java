package org.example;

/**
 * Ejercicio1
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int sumaDiagonal = sumarDiagonal(matriz, 0, 0);
        System.out.println(imprimirMatriz(matriz));
        System.out.println("\nLa suma de la diagonal de la matriz: " + sumaDiagonal);
    }

    public static int sumarDiagonal(int[][] matriz, int fila, int columna) {
        if (fila == matriz.length) {
            return 0;
        }
        return matriz[fila][columna] + sumarDiagonal(matriz, fila + 1, columna + 1);
    }

    public static int [][] imprimirMatriz (int [][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        return matriz;
    }
}
