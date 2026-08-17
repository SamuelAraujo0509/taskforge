public class Exercicio3 {

    static void main() {
        String senha;
        do {
            senha = IO.readln("Senha: ");
        } while (!senha.equals("java123"));
        IO.println("Acesso liberado");
    }
}
