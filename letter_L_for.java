/*Programa em Java com estrutura de repetição "FOR" que efetua a leitura de valores positivos inteiros até que um valor negativo seja informado. Ao final são apresentados o maior e o menor valores informados pelo usuário.*/

import java.util.Scanner;

class letter_L_for{
  public static void main(){
    Scanner keyboard = new Scanner(System.in);

    System.out.println("\n====== Estrutura 'FOR' - Maior e Menor número inteiro entre vários ======\n");

    int number, counter, pass = 0, larger = 0, lower = 0;

    System.out.print("\nInforme o 1º valor inteiro: ");
    number = keyboard.nextInt();

    larger = number;
    lower = number;

    if(number >= 0){

      for(counter = 0; counter !=1; pass++){

      System.out.print("\nInforme o " + (pass + 2) +  "º valor inteiro: ");
      number = keyboard.nextInt();

      if(number > larger){
        larger = number;

      }else{

        if(number < lower){
          lower = number;

        }
      }

      if(number < 0){
        counter = 1;
        }
      }
      
      System.out.print("\n\nFim do programa!");

      System.out.print("\n\nDentre os " + (pass + 1) + " valores inseridos, temos que: ");

      System.out.print("\n\nO maior número é: " + larger);
      System.out.print("\nO menor número é: " + lower);

    }else{

      System.out.print("\n\nFim do programa!");

      System.out.print("\n\nDentre os " + (pass + 1) + " valores inseridos, temos que: ");

      System.out.print("\n\nO maior número é: " + larger);
      System.out.print("\nO menor número é: " + lower);
    }
  }
}

