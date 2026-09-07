package modulo01;

public class Aula1Exercicio05 {

    void main() {
        double nota = Double.parseDouble(IO.readln("Nota final: "));
        if (nota > 7) {
            IO.println("Aprovado!");
        } else if (nota < 6.9 && nota > 5) {
            IO.println("Recuperação!");
        } else {
            IO.println("Reprovado!");
        }
    }
}
