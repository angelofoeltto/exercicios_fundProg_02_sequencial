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
public class ex_13 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double QUILOSESTABELECIDOS = 50;
    final double VALORDAMULTA        = 4;

    float peso     = 0;
    double excesso = 0;
    double multa   = 0;
    String texto   = "";

    System.out.println("\nJoão pescador e seu novo sistema...\n");
    System.out.print("Informe peso total da pescaria: ");
    peso = imput.nextFloat();

    if (peso > QUILOSESTABELECIDOS) {
      excesso = (peso - QUILOSESTABELECIDOS);
      multa = excesso * VALORDAMULTA;
      texto = "\nExiste";
    } else
      texto = "\nNão existe";

    System.out.println(texto.concat(" multa à pagar."));
    System.out.printf("Peso excesso: %.2f quilos;", excesso);
    System.out.printf("\nMulta: R$ %.2f.", multa);
  }
}
