package modulo01;

public class Aula1Exercicio07 {

    void main() {
        int numero = 7;
        int palpite = Integer.parseInt(IO.readln("Palpite: "));
        while (palpite != numero) {
            if (palpite < numero) {
                IO.println("É maior!");
            } else {
                IO.println("É menor!");
            }
            palpite = Integer.parseInt(IO.readln("Novo palpite: "));
        }
        IO.println("Acertou!");
    }
}
