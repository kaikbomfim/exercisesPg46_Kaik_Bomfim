/*Programa em Java com estrutura de repetição "For" que apresenta os resultados das potências de 3, variando do expoente 0 até o expoente 15. Será considerado que qualquer número elevado a zero é 1, e elevado a 1 é ele próprio.*/

import java.util.Scanner;

class letter_E_for{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    double count, exponent;

    System.out.println("\n====== Estrutura 'FOR' - Potências de 3 com expoentes de 0 a 15 ======");

    System.out.println("\nAs potências de 3, com expoentes de 0 a 15, são:\n ");

    for (exponent = 0; exponent <=15; exponent++){

      count = Math.pow(3, exponent);
      System.out.println("3 ^ " + (int)exponent + " = " + (int)count);
    } 
  }
}