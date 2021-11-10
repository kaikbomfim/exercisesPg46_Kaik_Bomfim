/*Programa em Java com estrutura de repetiçaõ "While" que apresenta todos os valores numéricos inteiros ímpares situados na faixa de 0 a 20. Para verificar se o número é ímpar, efetua dentro da malha a verificação lógica desta condição com a instrução se, perguntando se o número é ímpar; sendo, mostra-o; não sendo, passa para o próximo passo.*/

import java.util.Scanner;

class letter_D_doWhile{
  public static void main(){

    Scanner keyboard = new Scanner (System.in);

    int counter = 0;

    System.out.println("\n====== Estrutura 'DO WHILE' - Apresentação dos valores ímpares de 0 a 20 ======");

    System.out.println("\nOs valores inteiros ímpares na faixa de 0 a 20 são:\n ");

    do{

      counter++;

      if (counter % 2 != 0){
        System.out.println(counter);
      }
    }while(counter <= 19);
  }
}