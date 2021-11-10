/*Programa em Java com estrutura de repetição "FOR" que apresenta os valores de conversão de graus Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 10 graus Celsius e finalizando em 100 graus Celsius. O programa apresenta os valores das duas temperaturas. A fórmula de conversão
é: F = (9 * C + 160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.*/

class letter_H_for{
  public static void main(){
    double tempF, counter;

    System.out.println("\n====== Estrutura 'FOR' - Conversor Celsius - Fahrenheit ======");

    System.out.println("\nA temperatura, de 10 em 10 graus, convertida de Celsius (°C) para Fahrenheit (°F) é:\n");

    for(counter = 10; counter <= 100; counter = counter + 10){
      
      tempF = (9*counter + 160)/5;

      System.out.println((int)counter + "°C = " +  (int)tempF + "°F");
    }

  }
}