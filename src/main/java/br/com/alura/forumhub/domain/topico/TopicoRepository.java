package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.topico.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

    boolean existsByTituloAndMensagem(String titulo, String mensagem);
}
