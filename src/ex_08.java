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

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author neo
 * @create 01/08/2019
 */
public class ex_08 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    int hora = 0;
    double valor = 0;

    System.out.println("Calculo do salário");
    System.out.print("Informe o valor ganho por hora trabalhada (por mês): ");
    valor = imput.nextDouble();

    System.out.print("Informe a quantidade de horas trabalhadas: ");
    hora = imput.nextInt();

    System.out.printf("Ao final do mês você receberá R$ %1.2f.", (valor * hora));
  }
}
