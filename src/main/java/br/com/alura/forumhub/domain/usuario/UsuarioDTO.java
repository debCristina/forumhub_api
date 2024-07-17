package br.com.alura.forumhub.domain.usuario;

public record UsuarioDTO(Long id, String Email) {

    public UsuarioDTO(Usuario autor) {
        this(autor.getId(), autor.getEmail());
    }
}
