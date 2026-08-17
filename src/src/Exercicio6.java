public class Exercicio6 {

    static void main() {
        int n = Integer.parseInt(IO.readln("N: "));
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma = soma + i;
        }
        IO.println("A soma de 1 até " + n + " é de: " + soma);
    }
}
