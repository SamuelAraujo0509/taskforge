package modulo01;

public class Aula1Desafio {

    void main() {
        int opcao = 0;
        int totalTarefas = 0;

        while (opcao != 3) {
            IO.println("1 - Criar tarefa");
            IO.println("2 - Ver resumo");
            IO.println("3 - Sair");

            opcao = Integer.parseInt(IO.readln("Escolha uma opção: "));

            switch (opcao) {
                case 1 -> {
                    int prioridade = 0;

                    while (prioridade < 1 || prioridade > 5) {
                        prioridade = Integer.parseInt(
                                IO.readln("Digite a prioridade (1 a 5): ")
                        );

                        if (prioridade < 1 || prioridade > 5) {
                            IO.println("Prioridade inválida! Tente novamente.");
                        }
                    }

                    IO.print("Prioridade: ");

                    for (int i = 0; i < prioridade; i++) {
                        IO.print("*");
                    }

                    IO.println("");

                    totalTarefas++;
                    IO.println("Tarefa criada com sucesso!");
                }

                case 2 -> IO.println(
                        "Total de tarefas criadas até agora: " + totalTarefas
                );

                case 3 -> IO.println(
                        "Encerrando o programa... Até logo!"
                );

                default -> IO.println(
                        "Opção inválida. Escolha entre 1, 2 ou 3."
                );
            }
        }
    }
}
