public class Exercicio2 {

    void main() {
        int n = Integer.parseInt(IO.readln("Número: "));

        for (int i = 1; i <= 10; i++) {
            int m = n * i;
            IO.println(n + "x" + i + " = " + m);
        }
    }
}
