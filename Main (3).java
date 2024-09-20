//Comparando Tipos Primitivos Digitados Pelo Usuário
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //Solicitando alguma dado do usuário
    System.out.print("Digite um número: ");
    String dadoDigitado = entrada.nextLine();

    //Tentando converter o dado digitado pelo usuário para um número inteiro
    try {
      int numero = Integer.parseInt(dadoDigitado);
      System.out.println("Você digitou um número válido: " + numero);
    } catch(NumberFormatException e){
      System.out.println("Isso é um número? ");
    }
    entrada.close();
  }
}