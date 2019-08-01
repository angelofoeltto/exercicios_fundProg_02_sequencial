import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        final int TAM = 4;

        float nota[] = new float[4];
        float resultado = 0;

        System.out.println("Média bimestral");
        for (int i = 0; i < TAM; i++) {
            System.out.print("Informe nota " + (i + 1) + ": ");
            nota[i] = imput.nextFloat();
            resultado += nota[i];
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("Média bimestral é " + (resultado / TAM));
        }
    }
}
