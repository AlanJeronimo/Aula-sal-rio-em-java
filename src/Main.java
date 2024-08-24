import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double boleto1, boleto2, boleto3, boleto4, resto, total, salario;
        Scanner ler = new
        Scanner(System.in);

        System.out.println("Digite o seu salario:");
        salario = ler.nextDouble();

        System.out.println("Digite o 1°Boleto:");
        boleto1 = ler.nextDouble();
        System.out.println("Digite o 2°Boleto:");
        boleto2 = ler.nextDouble();
        System.out.println("Digite o 3°Boleto:");
        boleto3 = ler.nextDouble();
        System.out.println("Digite o 4°Boleto:");
        boleto4 = ler.nextDouble();

        total= (boleto1+boleto2+boleto3+boleto4);

        salario = salario * 0.86;
        resto = salario - total;
        System.out.print("O Seu salario liquido é:" + salario);
        System.out.print("\nO total da facada é:" + total);
        System.out.print("\nA Sobra do salario é:" + resto);

    }
}