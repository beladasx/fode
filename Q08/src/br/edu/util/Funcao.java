package br.edu.util;
public class Funcao {

	public static int calculo(int hora_inicial, int min_inicial, int hora_final, int min_final) {
        int total_horas, total_min, total;

        if (min_final < min_inicial) {
            min_final += 60;
            hora_final -= 1;
        }

        if (hora_final < hora_inicial) {
            hora_final += 24;
        }

        total_min = min_final - min_inicial;
        total_horas = hora_final - hora_inicial;
        total = total_horas * 60 + total_min;

        return total;
    }
}
