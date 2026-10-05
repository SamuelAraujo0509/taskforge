package br.com.docodigoaocontrato.taskforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.docodigoaocontrato.taskforge.DTO.TarefaDTO;
import br.com.docodigoaocontrato.taskforge.model.Tarefa;
import br.com.docodigoaocontrato.taskforge.repository.TarefaRepository;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public List<TarefaDTO> buscarTodos(Boolean concluida) {
        List<Tarefa> tarefas;
        if (concluida == null) {
            tarefas = tarefaRepository.findAll();
        } else {
            tarefas = tarefaRepository.findByConcluida(concluida);
        }
        return tarefas.stream()
                .map(tarefa -> toDto(tarefa))
                .toList();
    }

    public Optional<TarefaDTO> buscarPorId(Long id) {
        return tarefaRepository.findById(id)
                .map(tarefa -> toDto(tarefa));
    }

    public TarefaDTO criarTarefa(TarefaDTO tarefaDTO) {
        Tarefa tarefa = toEntity(tarefaDTO);
        return toDto(tarefaRepository.save(tarefa));
    }

    public Optional<TarefaDTO> atualizarTarefa(Long id, TarefaDTO tarefaDTO) {
        Optional<Tarefa> encontrada = tarefaRepository.findById(id);
        if (encontrada.isEmpty()) {
            return Optional.empty();
        }

        Tarefa tarefa = encontrada.get();
        tarefa.setNome(tarefaDTO.getNome());
        tarefa.setPrioridade(tarefaDTO.getPrioridade());
        tarefa.setConcluida(tarefaDTO.isConcluida());

        return Optional.of(toDto(tarefaRepository.save(tarefa)));
    }

    public boolean deletarTarefa(Long id) {
        if (!tarefaRepository.existsById(id)) {
            return false;
        }
        tarefaRepository.deleteById(id);
        return true;
    }

    private TarefaDTO toDto(Tarefa tarefa) {
        return new TarefaDTO(tarefa.getId(), tarefa.getNome(),
                tarefa.getPrioridade(), tarefa.isConcluida());
    }

    private Tarefa toEntity(TarefaDTO tarefaDTO) {
        return new Tarefa(tarefaDTO.getNome(), tarefaDTO.getPrioridade(),
                tarefaDTO.isConcluida());
    }
}
