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
public class ex_03 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        System.out.println("Somatório");
        System.out.print("Informe número: ");
        num1 = imput.nextDouble();

        System.out.print("Informe número à ser somado: ");
        num2 = imput.nextDouble();

        System.out.println("A soma dos número: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
