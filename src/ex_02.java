import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        int num = 0;

        System.out.print("Informe número (inteiro): ");
        num = imput.nextInt();

        System.out.println("O número informado foi " + num);
    }
}
