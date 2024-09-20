import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String num1;
    Double num2;
    String operacao;

    System.out.println("---- Calculadora ----");

    System.out.print("Digite o primeiro número: ");
    num1 = scanner.nextLine();

    try {
      int numero = Integer.parseInt(num1);

      System.out.print("Digite o segundo número: ");
      num2 = scanner.nextDouble();

      System.out.print("Digite a operação desejada (+, -, /, *): ");
      operacao = scanner.next();

      // Realizando a operação escolhida pelo calculo
      System.out.println("Resultado: " + calculo(numero, num2, operacao));

      scanner.close();
    } catch (NumberFormatException e) {
      System.out.print("Erro: Digite apenas números!");
    }
  }

  public static Double calculo(int num1, Double num2, String operacao) {
    Double resposta = 0.0;

    if (operacao.equals("+")) {
      resposta = num1 + num2;
    } else if (operacao.equals("-")) {
      resposta = num1 - num2;
    } else if (operacao.equals("/")) {
      resposta = num1 / num2;
    } else if (operacao.equals("*")) {
      resposta = num1 * num2;
    }
    return resposta;
  }
}