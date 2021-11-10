/*Programa em Java com estrutura de repetição "Do While" que apresenta os resultados da soma e da média aritmética dos valores pares situados na faixa numérica de 50 a 70.*/

class letter_J_doWhile{
  public static void main(){
    int sum = 0, counter = 48, pass = 0;

    System.out.println("\n====== Estrutura 'Do While' - Soma e média dos valores pares na faixa de 50 a 70 ======\n");

    do{

      counter = counter + 2 ;
      
      pass = pass + 1;
      sum = sum + counter;

    }while(counter <=68);

    System.out.print("A soma dos valores pares na faixa de 50 a 70 é: " + sum);

    System.out.print("\nA média aritmética dos valores pares na faixa de 50 a 70 é: " + (sum/pass));
  }
}