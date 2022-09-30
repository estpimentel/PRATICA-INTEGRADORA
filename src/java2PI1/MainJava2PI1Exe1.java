package java2PI1;

public class MainJava2PI1Exe1 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa("Esther", 18, "123456");
        Pessoa pessoa3 = new Pessoa("Nora", 71, "2468", 75.5, 1.57);

        System.out.println(pessoa3.calcularIMC());
        System.out.println(pessoa2.ehMaiorIdade());
    }
}
