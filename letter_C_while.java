/*Programa em Java com estrutura de repetiçaõ "While" que apresenta no final o somatório dos valores pares existentes na faixa de 1 até
500.*/

import java.util.Scanner;

class letter_C_while{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    int sum = 0, counter = 1;

    while(counter <= 500){

      counter++;

      if (counter % 2 == 0){
        sum = sum + counter;
      }
    }

    System.out.println("\n====== Estrutura 'WHILE' - Soma dos valores pares de 1 a 500 ======");

    System.out.println("\nA soma dos valores pares na faixa de 1 até 500 é: " + sum);
  }
}