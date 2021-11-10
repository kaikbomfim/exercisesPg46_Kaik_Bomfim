/*Programa em Java com estrutura de repetição "WHILE" que apresenta como resultado o valor de uma potência de uma base qualquer elevada a um expoente qualquer, ou seja, de B^E, em que B é o valor da base e E o valor do expoente. Neste programa não se pode ser utilizado o operador de exponenciação do portuguol (^).*/

import java.util.Scanner;

class letter_F_doWhile{
  public static void main(){

    Scanner keyboard = new Scanner(System.in);
    double base, exponent, count, counter = 0, pass = 0;
    String condition;

    System.out.println("\n====== Estrutura 'DO WHILE' - Base qualquer elevada a expoente qualquer ======");

    do{

      pass++;

      System.out.print("\nInforme uma base qualquer: ");
      base = keyboard.nextDouble();

      System.out.print("Informe um expoente qualquer: ");
      exponent = keyboard.nextDouble();

      count = Math.pow(base, exponent);

      System.out.print("\n" + (int)base + " ^ " + (int)exponent + " = " + (int)count);

      System.out.print("\n\nDeseja efetuar cálculo para uma nova base e expoente? (Digite SIM ou NÃO): ");
      condition = keyboard.next();

      if(condition.equals("SIM") || condition.equals("sim") || condition.equals("Sim")){

        counter = 0;

      }else{
        if(condition.equals("NÃO") || condition.equals("Não") || condition.equals("não") || condition.equals("nao")){

          counter = 1;
          System.out.print("\nFim do programa!");

        }else{
          System.out.print("\nOpção inválida. Tente novamente!");

          counter = 1;
        }
      }
    }while(counter != 1);
  }  
}