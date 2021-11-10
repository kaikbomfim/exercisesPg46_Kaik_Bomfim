/*Programa em Java com estrutura de repetição "While" que apresenta os resultados da soma e da média aritmética dos valores pares situados na faixa numérica de 50 a 70.*/

class letter_J_while{
  public static void main(){
    int sum = 0, counter = 48, pass = 0;

    System.out.println("\n====== Estrutura 'While' - Soma e média dos valores pares na faixa de 50 a 70 ======\n");

    while(counter <=68){

      counter = counter + 2 ;
      
      pass = pass + 1;
      sum = sum + counter;

    }

    System.out.print("A soma dos valores pares na faixa de 50 a 70 é: " + sum);

    System.out.print("\nA média aritmética dos valores pares na faixa de 50 a 70 é: " + (sum/pass));
  }
}
