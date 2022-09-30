package java2PI2Exe1;

import static java2PI2Exe1.PraticaExcecoes.dividir1;
import static java2PI2Exe1.PraticaExcecoes.dividir2;

public class MainJava2PI2Exe1 {
    public static void main(String[] args) {

        int a = 0;
        int b = 300;

        // PARTE A
        dividir1(a, b);

        // PARTE B
        try {
            dividir2(a, b);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
