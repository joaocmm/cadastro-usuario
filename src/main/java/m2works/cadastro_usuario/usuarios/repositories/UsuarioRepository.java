package m2works.cadastro_usuario.usuarios.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import m2works.cadastro_usuario.usuarios.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        
}
