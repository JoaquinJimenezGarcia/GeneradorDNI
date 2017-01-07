package com.joaquinjimenezgarcia;

public class Main {

    public static void main(String[] args) {
        //int numero[] = new int[8];

        int dni = 0;
        int calculo = 0;
        final char LETRADNI[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        final int LIMITE = 99999999;

        generarDNI(dni, LIMITE, calculo, LETRADNI);
    }

    static void generarDNI(int numeracion, int maximo, int formula, char letras[]){
        numeracion = (int)(Math.random()*maximo+10000000);

        formula = numeracion%23;

        System.out.println("El DNI completo es: " + numeracion+letras[formula]);
    }
}
