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
public class ex_15 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double METROSPORLITRO = 3;
    final double PRECOLATA      = 80;
    final double LITROSPORLATA  = 18;

    // Metros quadrados por lata
    final double METROPORLATA = METROSPORLITRO * LITROSPORLATA;

    float metrosQuadrados = 0;
    double precoLata      = 0;
    int quantidadeLatas   = 0;

    System.out.println("\n Loja de Tintas\n");
    System.out.print("Informe tamanho do comodo, em metros quadrados, da área a ser pintada: ");
    metrosQuadrados = imput.nextFloat();

    quantidadeLatas = (int)Math.ceil(metrosQuadrados / METROPORLATA);
    precoLata = quantidadeLatas * PRECOLATA;

    System.out.println("\nDados da compra");
    System.out.printf("Número de latas: %d;", quantidadeLatas);
    System.out.printf("\nPreço total: R$ %.2f", precoLata);
  }
}
