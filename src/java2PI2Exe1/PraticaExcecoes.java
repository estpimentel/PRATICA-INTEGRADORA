package java2PI2Exe1;

public class PraticaExcecoes {

//Exercício 1 parte a
    public static void dividir1(int a, int b) {
        try{
            int result = b / a;
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro!");
        } finally {
            System.out.println("Programa finalizado!");
        }
    }

    //Exercício 1 parte b
    public static void dividir2(int a, int b) throws IllegalArgumentException{
        System.out.println("\n SEGUNDA PARTE DO EXERCÍCIO\n");
        try{
            int result = b / a;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Não pode ser dividido por zero!");
        } finally {
            System.out.println("Programa finalizado!");
        }
    }
}
