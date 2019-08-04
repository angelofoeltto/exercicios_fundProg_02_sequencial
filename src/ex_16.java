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
public class ex_16 {
  public static void main(String[] args) {
    Scanner imput = new Scanner(System.in);

    final double METROSPORLITRO = 6;
    final double PRECOLATA      = 80;
    final double PRECOGALAO     = 25;
    final double LITROSPORLATA  = 18;
    final double LITROSPORGALAO = 3.6;

    // Metros quadrados por lata
    final double METROPORLATA  = METROSPORLITRO * LITROSPORLATA;
    final double METROPORGALAO = METROSPORLITRO * LITROSPORGALAO;

    float metrosQuadrados = 0;
    double precoLata      = 0;
    double precoGaloes    = 0;
    int quantidadeLatas   = 0;
    int quantidadeGaloes  = 0;

    System.out.println("\n Loja de Tintas\n");
    System.out.print("Informe tamanho do comodo, em metros quadrados, da área a ser pintada: ");
    metrosQuadrados = imput.nextFloat();

    quantidadeLatas  = (int)Math.ceil(metrosQuadrados / METROPORLATA);
    quantidadeGaloes = (int)Math.ceil(metrosQuadrados / METROPORGALAO);
    precoLata        = quantidadeLatas * PRECOLATA;
    precoGaloes      = quantidadeGaloes * PRECOGALAO;

    System.out.println("\nDados da compra");
    System.out.printf("Número de latas: %d;", quantidadeLatas);
    System.out.printf("\nPreço total (latas): R$ %.2f", precoLata);
    System.out.printf("\nNúmero de galões: %d;", quantidadeGaloes);
    System.out.printf("\nPreço total (galões): R$ %.2f", precoGaloes);
  }
}
