package modulo01;

public class Aula1Exercicio04 {

    void main() {
        String op = IO.readln("Selecione a opção desejada:");

        switch (op) {
            case "1":
                IO.println("1 - Bom dia");
                break;
            case "2":
                IO.println("2 - Boa tarde");
                break;
            case "3":
                IO.println("3 - Boa noite");
                break;
            default:
                IO.println("Opção invalida");
        }
    }
}
