package exrepetição1;
    import java.util.Scanner;
public class ExRepetição1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double num, result, i;
        System.out.println("Digite um número de 0 a 15:");
        num = entrada.nextDouble();
        i = 0;
        while(i <= 15)
        {
            result = Math.pow(3, i);
            System.out.println("O resultado da potência de 3 é:" + result);
            i = i + 1;
        }
    }
}
