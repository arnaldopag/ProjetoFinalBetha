package com.ProjetoFinal.Repository;

import com.ProjetoFinal.Model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    @Modifying
    @Query(value = """
            INSERT INTO usuario_caixa values (:usuarioId, :caixaId);
            """, nativeQuery = true)
    void associarUsuarioCaixa(Integer usuarioId, Integer caixaId);
}
