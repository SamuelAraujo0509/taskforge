package br.com.docodigoaocontrato.taskforge.controller;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.docodigoaocontrato.taskforge.DTO.UsuarioCadastroDTO;
import br.com.docodigoaocontrato.taskforge.DTO.UsuarioDTO;
import br.com.docodigoaocontrato.taskforge.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody UsuarioCadastroDTO usuarioCadastroDTO) {
        Optional<UsuarioDTO> usuarioCriado = usuarioService.cadastrar(usuarioCadastroDTO);
    if (usuarioCriado.isEmpty()) {
        //409
        return ResponseEntity.status(HttpStatus.CONFLICT).build();
    }
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCriado.get());
    }
}
