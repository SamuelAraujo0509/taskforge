package br.com.docodigoaocontrato.taskforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.docodigoaocontrato.taskforge.DTO.TarefaDTO;

@RestController
public class TarefaController {

    @GetMapping("/tarefas")
    public TarefaDTO listar() {
        return new TarefaDTO(3,"Tarefa3", 1, false);
    }
}
