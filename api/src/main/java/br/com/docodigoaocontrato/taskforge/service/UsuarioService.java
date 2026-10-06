package br.com.docodigoaocontrato.taskforge.service;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.docodigoaocontrato.taskforge.DTO.UsuarioCadastroDTO;
import br.com.docodigoaocontrato.taskforge.DTO.UsuarioDTO;
import br.com.docodigoaocontrato.taskforge.model.Usuario;
import br.com.docodigoaocontrato.taskforge.repository.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Optional<UsuarioDTO> cadastrar(UsuarioCadastroDTO dto) {
        if (usuarioRepository.existsUsuarioByEmail(dto.getEmail())) {
            return Optional.empty();
        }
        String senhaCriptografada = encoder.encode(dto.getSenha());
        Usuario usuario = new Usuario(dto.getNome(),dto.getEmail(), senhaCriptografada);
        return Optional.of(toDTO(usuarioRepository.save(usuario)));
    }

    private UsuarioDTO toDTO(Usuario entity) {
        return new UsuarioDTO(entity.getId(), entity.getNome(), entity.getEmail());
    }
}
