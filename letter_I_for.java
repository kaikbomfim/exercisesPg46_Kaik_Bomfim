/*Programa em Java com estrutura de repetição "For" que efetua a leitura de 10 valores numéricos e apresenta no final o total do somatório e a média aritmética dos valores lidos.*/

import java.util.Scanner;

class letter_I_for{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    double number, sum = 0, counter;

    System.out.println("\n====== Estrutura 'FOR' - Média aritmética de 10 valores lidos ======\n");

    for(counter = 1; counter <=10; counter++){
      System.out.print("Informe o " + (int)counter + "º valor: ");
      number = keyboard.nextDouble();
      
      sum = sum + number;
     
    }
    System.out.println("\nA média aritmética dos 10 valores informados é: " + (sum/10));
  }
}