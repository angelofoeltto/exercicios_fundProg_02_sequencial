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
 * @create 04/08/2019
 */
public class ex_12 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    float altura = 0;

    System.out.println("Peso ideal");
    System.out.print("Informe sua altura em metros: ");
    altura = imput.nextFloat();

    System.out.println("\nSeu peso ideal é, ou deveria ser de:");
    System.out.printf("Para Homens %.2f quilos", (72.7 * altura) - 58);
    System.out.printf("\nPara Mulheres %.2f quilos", (62.1 * altura) - 44.7);
  }
}
