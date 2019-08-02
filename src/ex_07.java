/*
 *                     GNU GENERAL PUBLIC LICENSE
 *                        Version 3, 29 June 2007
 *
 *  Copyright (C) 2007 Free Software Foundation, Inc. <https://fsf.org/>
 *  Everyone is permitted to copy and distribute verbatim copies
 *  of this license document, but changing it is not allowed.
 *
 *                             Preamble
 *
 *   The GNU General Public License is a free, copyleft license for
 * software and other kinds of works.
 */

import java.util.Scanner;

/**
 * @author neo
 * @create 01/08/2019
 */
public class ex_07 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double lado = 0;

        System.out.println("Calcular área de um quadrado");
        System.out.print("Informe lado do quadrado: ");
        lado = imput.nextDouble();

        System.out.println("Área do quadrado é de " + Math.pow(lado, 2));
    }
}
