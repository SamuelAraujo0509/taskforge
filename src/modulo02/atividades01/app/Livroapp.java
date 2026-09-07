package modulo02.atividades01.app;

import modulo02.atividades01.model.Livro;

public class Livroapp {

    static void main() {
        Livro l = new Livro("Java fácil", 200);
        IO.print(l.getTitulo());

    }
}
