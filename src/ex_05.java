import java.util.Scanner;

public class ex_05 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        double metro = 0;

        System.out.print("Informe metros: ");
        metro = imput.nextDouble();

        System.out.println("Em centimetros: " + (metro / 1000));
    }
}
