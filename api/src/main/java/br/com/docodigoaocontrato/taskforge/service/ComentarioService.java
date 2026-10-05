package br.com.docodigoaocontrato.taskforge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.docodigoaocontrato.taskforge.DTO.ComentarioDTO;
import br.com.docodigoaocontrato.taskforge.model.Comentario;
import br.com.docodigoaocontrato.taskforge.repository.ComentarioRepository;

@Service
public class ComentarioService {

    private final ComentarioRepository repository;

    public ComentarioService(ComentarioRepository repository) {
        this.repository = repository;
    }

    public List<ComentarioDTO> listarTodos() {
        return repository.findAll().
                stream().
                map(comentario -> toDto(comentario)).
                toList();
    }

    public ComentarioDTO cadastrar(ComentarioDTO comentarioDTO) {
        Comentario comentario = toEntity(comentarioDTO);
        return toDto(repository.save(comentario));
    }

    public Optional<ComentarioDTO> atualizarComentario(Long id, ComentarioDTO comentarioDTO) {
        Optional<Comentario> encontrado = repository.findById(id);
        if (encontrado.isEmpty()) {
            return Optional.empty();
        }

        Comentario comentario = encontrado.get();
        comentario.setDescricao(comentarioDTO.getDescricao());
        comentario.setAutor(comentarioDTO.getAutor());

        return Optional.of(toDto(repository.save(comentario)));
    }

    public boolean deletarComentario(Long id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }

    private ComentarioDTO toDto(Comentario comentario) {
        return new ComentarioDTO(comentario.getId(),
                comentario.getAutor(),
                comentario.getDescricao());
    }

    private Comentario toEntity(ComentarioDTO comentarioDTO) {
        return new Comentario(comentarioDTO.getAutor(),
                comentarioDTO.getDescricao());
    }
}
