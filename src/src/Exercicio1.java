public class Exercicio1 {

    void main() {
        int idade = Integer.parseInt(IO.readln("Digite sua idade: "));

        if (idade < 18) {
            IO.println("Você é menor de idade de idade");
        } else {
            IO.println("Você é maior de idade");
        }
    }
}
