/*Programa em Java com estrutura de repetição "For" que apresenta o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).*/

import java.util.Scanner;

class letter_B_for{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    int sum = 0, counter;

    for (counter = 1; counter <= 100; counter++){
      sum = sum + counter;
    }
    System.out.println("\n====== Estrutura 'FOR' - Soma dos 100 primeiros inteiros ======");
    System.out.print("\nA soma dos 100 primeiros números inteiros é: " + sum);
  }
}