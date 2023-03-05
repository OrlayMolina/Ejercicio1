package org.example;

public class Ejercicio3 {
    public static void main( String[] args ) {
        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int  fila = matriz.length-1;
        int columna = matriz[fila].length-1;
        System.out.println("la sumaria: "+ sumarDiagonalInversa(matriz, fila,columna));
    }

    public static int sumarDiagonalInversa(int[][] matriz, int fila, int columna) {
        if(fila>=0){
            if (columna>=0) {
                return matriz[fila][columna] + sumarDiagonalInversa(matriz, fila, columna-1);
            }else {
                columna = matriz[fila].length-1;
                fila=fila-1;

                return sumarDiagonalInversa(matriz, fila, columna);
            }
        }
        return 0;
    }
}

