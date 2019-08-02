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
public class ex_10 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int num1 = 0;
    int num2 = 0;
    double real = 0;

    System.out.print("Informe número inteiro: ");
    num1 = imput.nextInt();

    System.out.print("Informe número inteiro: ");
    num2 = imput.nextInt();

    System.out.print("Informe número real: ");
    real = imput.nextDouble();

    System.out.printf("O produto do dobro do primeiro com metade do segundo é: %.2f;\n", ((2 * num1) + ((float)num2 / 2)));
    System.out.printf("A soma do triplo do primeiro com o terceiro é: %.2f;\n", (3 * num1 + real));
    System.out.printf("O terceiro elevado ao cubo é: %.2f", Math.pow(real, 3));
  }
}
