package br.edu.principal;
import br.edu.util.Funcao;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hora_inicial, min_inicial, hora_final, min_final;
        int minutos;

        System.out.println("Digite a hora inicial: ");
        hora_inicial = scanner.nextInt();
        System.out.println("Digite os minutos iniciais: ");
        min_inicial = scanner.nextInt();
        System.out.println("Digite a hora final: ");
        hora_final = scanner.nextInt();
        System.out.println("Digite os minutos finais: ");
        min_final = scanner.nextInt();
        
        minutos = Funcao.calculo(hora_inicial, min_inicial, hora_final, min_final);
        System.out.println("A diferença em minutos é: " + minutos + " minutos");
        scanner.close();
    }
    
}
