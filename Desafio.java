import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        // Lê os valores de entrada
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;

        // Aplica a alíquota de 5% se o salário for até 1100
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05f * valorSalario;
        }

        // TODO Criar as demais condições para as alíquotas de 10.00% e 15.00%

        // Calcula e imprime a saída (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));
    }
}
