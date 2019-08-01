import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double num1 = 0;
        double num2 = 0;

        System.out.println("Somatório");
        System.out.print("Informe número: ");
        num1 = imput.nextDouble();

        System.out.print("Informe número à ser somado: ");
        num2 = imput.nextDouble();

        System.out.println("A soma dos número: " + num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
