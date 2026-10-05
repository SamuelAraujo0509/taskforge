package br.com.docodigoaocontrato.taskforge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.docodigoaocontrato.taskforge.DTO.ComentarioDTO;
import br.com.docodigoaocontrato.taskforge.service.ComentarioService;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    private final ComentarioService service;

    public ComentarioController(ComentarioService comentarioService) {
        this.service = comentarioService;
    }

    @GetMapping
    public ResponseEntity<List<ComentarioDTO>> listar() {
        List<ComentarioDTO> listar = service.listarTodos();
        return ResponseEntity.ok().body(listar);
    }

    @PostMapping
    public ResponseEntity<ComentarioDTO> cadastrar(@RequestBody ComentarioDTO comentarioDTO) {
        ComentarioDTO comentarioCadastrado = service.cadastrar(comentarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(comentarioCadastrado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ComentarioDTO> atualizar(@PathVariable Long id,
            @RequestBody ComentarioDTO comentarioDTO) {
        Optional<ComentarioDTO> atualizado = service.atualizarComentario(id, comentarioDTO);
        if (atualizado.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(atualizado.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remover(@PathVariable Long id) {
        if (!service.deletarComentario(id)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.noContent().build();
    }
}
