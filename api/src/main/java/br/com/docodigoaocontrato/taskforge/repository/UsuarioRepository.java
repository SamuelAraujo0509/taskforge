package br.com.docodigoaocontrato.taskforge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.docodigoaocontrato.taskforge.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Boolean existsUsuarioByEmail(String email);
}
