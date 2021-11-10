/*Programa em Java com estrutura de repetição "While" que apresenta os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. */

import java.util.Scanner;

class letter_A_while{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    double number, counter = 1;

    System.out.print("\nInforme um número para saber a sua tabuada: ");
    number = keyboard.nextDouble();

    System.out.println("\n====== Estrutura 'WHILE' - TABUADA ======");
    System.out.println("\n====== TABUADA DA MULTIPLICAÇÃO DO " + number + " ====== ");

    while (counter <=10){
      System.out.print("\n" + number + " X " + counter + " = " + (number * counter));
      counter++;
    }
  }
}