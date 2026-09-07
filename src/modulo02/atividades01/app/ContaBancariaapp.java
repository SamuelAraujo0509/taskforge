package modulo02.atividades01.app;

import modulo02.atividades01.model.ContaBancaria;

public class ContaBancariaapp {

    static void main() {
        ContaBancaria conta = new ContaBancaria("Ana", 0);
        for (int i = 0; i < 2; i++) {
            conta.depositar(Double.parseDouble(IO.readln()));
        }
        conta.imprimir();
    }
}
