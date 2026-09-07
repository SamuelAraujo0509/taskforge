package modulo01;

public class Aula1Exercicio03 {

    void main() {
        String senha;
        do {
            senha = IO.readln("Senha: ");
        } while (!senha.equals("java123"));
        IO.println("Acesso liberado");
    }
}
