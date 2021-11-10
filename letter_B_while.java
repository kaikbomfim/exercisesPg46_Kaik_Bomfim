/*Programa em Java com estrutura de repetição "While" que apresenta o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).*/

import java.util.Scanner;

class letter_B_while{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);
    
    int sum = 0, counter = 1;

    while(counter <= 100){
      sum = sum + counter;

      counter++;
    }
    System.out.println("\n====== Estrutura 'WHILE' - Soma dos 100 primeiros inteiros ======");
    System.out.print("\nA soma dos 100 primeiros números inteiros é: " + sum);
  }
}