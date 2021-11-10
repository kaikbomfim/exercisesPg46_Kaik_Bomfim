/*Programa em Java com estrutura de repetição "WHILE" que possibilita o cálculo da área total de uma residência (sala, cozinha, banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa solicita a entrada do nome, a largura e o comprimento de um determinado cômodo. Em seguida, apresenta a área do cômodo lido e também uma mensagem solicitando do usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa apresenta o valor total acumulado da área residencial.*/

import java.util.Scanner;

class letter_K_while{
  public static void main(){
    Scanner keyboard1 = new Scanner(System.in);
    Scanner keyboard2 = new Scanner(System.in);

    double width, length, area, totalArea = 0, counter = 0, pass = 0;

    String roomName, condition;

    System.out.println("\n====== Estrutura 'WHILE' - Cálculo de área dos cômodos da casa ======\n");

    if(pass != 1){

      while(counter!= 1){
        
        pass++;

        System.out.print("\nInforme o nome do cômodo: ");
        roomName = keyboard1.next();
        
        System.out.print("Informe a largura da(o) " + roomName + " em metros: ");
        width = keyboard2.nextDouble();

        System.out.print("Informe o comprimento da(o) " + roomName + " em metros: ");
        length = keyboard2.nextDouble();

        area = width * length;
        totalArea = totalArea + area;

        System.out.print("\nA área da(o) " + roomName + " é igual a: " + area + "m²");

        System.out.print("\n\nDeseja calcular a área de outros cômodos (digite SIM ou NÃO): ");
        condition = keyboard1.next();

        if(condition.equals("Sim") || condition.equals("sim") || condition.equals("SIM")){
          counter = 0;
        }else{
          if(condition.equals("Não") || condition.equals("não") || condition.equals("NÃO") || condition.equals("nao") || condition.equals("não")){
            System.out.print("\nA área total acumulada é igual a: " + totalArea + "m²");
            counter = 1;
          }else{
            System.out.print("Opção inválida. Tente novamente!");
            counter = 1;
          }
        }
      }
    }
  }
}