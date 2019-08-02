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
public class ex_09 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float temperatura = 0;

    System.out.println("Transformar temperatura Farenheit em Celsius");
    System.out.print("Informe temperatura em Farenheit: ");
    temperatura = imput.nextFloat();

    System.out.printf("Temperatura em Celsius é");
    System.out.printf("\nFormula 01: %1.2f.", ((5 * (temperatura-32) / 9)));
    System.out.printf("\nFormula 02: %1.2f.", ((temperatura - 32) / 1.8));
  }
}
