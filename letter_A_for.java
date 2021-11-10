/*Programa em Java com estrutura de repetição "For" que apresenta os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer. */

import java.util.Scanner;

class letter_A_for{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    double number, counter;

    System.out.print("\nInforme um número para saber a sua tabuada: ");
    number = keyboard.nextDouble();
    
    System.out.println("\n====== Estrutura 'FOR' - TABUADA ======");
    System.out.println("\n====== TABUADA DA MULTIPLICAÇÃO DO " + number + " ====== ");

    for (counter = 1; counter <= 10; counter++){
      System.out.print("\n" + number + " X " + counter + " = " + (number * counter));
    } 
  }
}