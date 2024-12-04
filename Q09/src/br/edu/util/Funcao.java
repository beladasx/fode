package br.edu.util;
import java.util.Scanner;

public class Funcao {

    public static void maior_menor() {
        Scanner scanner = new Scanner(System.in);
        int maior = 0, menor = 0, num;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            num = scanner.nextInt();

            if (i == 1) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }

        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("O menor número digitado foi: " + menor);
        scanner.close();
	}
}
