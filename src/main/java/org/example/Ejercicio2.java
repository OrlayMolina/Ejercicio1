package org.example;

public class Ejercicio2 {

    public static void main( String[] args ) {
        String palabra = "hola";
        String reversedStr = palabraAlReves(palabra );
        System.out.println(reversedStr);
    }

    public static String palabraAlReves(String palabra ) {
        if (palabra  == null || palabra .length() <= 1) {
            return palabra ;
        }
        return palabraAlReves(palabra .substring(1)) + palabra .charAt(0);
    }
}
