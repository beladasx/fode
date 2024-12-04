package br.edu.util;
public class Funcao {

	public static double sequencia(int Num) {
        double seq = 1;
        for (int a = 1; a <= Num; a++) {
            int f = 1;
            for (int b = 1; b <= a; b++) {
                f *= b;
            }
            seq += 1.0 / f;
        }
        
        return seq;
    }
}
