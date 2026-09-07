package modulo02.atividades01.app;

import modulo02.atividades01.model.Aluno;

public class Alunoapp {

    static void main() {
        Aluno a1 = new Aluno("Ana", 8, 7);
        Aluno a2 = new Aluno("Bruno", 8, 10);

        a1.imprimir();
        a2.imprimir();
    }


}
