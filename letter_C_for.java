/*Programa em Java com estrutura de repetiçaõ "For" que apresenta no final o somatório dos valores pares existentes na faixa de 1 até
500.*/

import java.util.Scanner;

class letter_C_for{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    int sum = 0, counter;

    for(counter = 1; counter <= 500; counter++){
      if (counter % 2 == 0){
        sum = sum + counter;
      }
    }

    System.out.println("\n====== Estrutura 'FOR' - Soma dos valores pares de 1 a 500 ======");

    System.out.println("\nA soma dos valores pares na faixa de 1 até 500 é: " + sum);
  }
}