package br.com.alura.forumhub.domain.topico;

import br.com.alura.forumhub.domain.usuario.Usuario;
import br.com.alura.forumhub.domain.usuario.UsuarioDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String curso,
        String mensagem,
        LocalDateTime data){
}
