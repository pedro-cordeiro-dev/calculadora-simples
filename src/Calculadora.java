import java.util.Scanner;

public class Calculadora {

    public String operacao;
    public double num1;
    public double num2;

    public static double calcular(double num1, double num2 , String operacao) {

        switch (operacao) {

            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if(num1 != 0 && num2 !=0) {
                    return num1 / num2;
                }
                else {
                    throw new IllegalArgumentException("não é possivel dividir por 0");
                }
            case "%":
                return num1 % num2;
            default:
                throw new IllegalArgumentException("operação desconhecida:" + operacao);
        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("no momento temos as seguintes operações disponiveis: somar(+), subtrair(-), multiplicar(*), dividir(/), resto(%)");

        System.out.println("qual operação(simbolo) deseja realizar: ");
        String operacao = scanner.nextLine();

        System.out.println("digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("resultado: " + calcular(num1, num2, operacao));
    }

}
