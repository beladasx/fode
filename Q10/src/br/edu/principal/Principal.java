package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int Num = scanner.nextInt();

        double seq = Funcao.sequencia(Num);
        System.out.println("O valor de sequencial é: " + seq);
        
        scanner.close();
    }

    
}
