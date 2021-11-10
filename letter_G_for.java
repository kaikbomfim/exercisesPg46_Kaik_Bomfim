/*Programa em Java com estrutura de repetição "FOR" que apresenta a série de Fibonacci até o décimo quinto termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja formado o próximo valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.*/


class letter_G_for{
  public static void main(){

    int n = 1, n2 = 0, aux, counter;

    System.out.println("\n====== Estrutura 'FOR' - Sequência de Fibonacci com 15 termos ======\n");

    for(counter = 1; counter <=15; counter++){
      aux = n + n2;
      System.out.println(counter + "º termo = " + aux);
      n = n2;
      n2 = aux;

    }
  }
}