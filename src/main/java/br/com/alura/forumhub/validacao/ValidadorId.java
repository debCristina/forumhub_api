package br.com.alura.forumhub.validacao;

import br.com.alura.forumhub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidadorId {
    @Autowired
    TopicoRepository repository;
    public void validar(Long id) {
        if (id == null || id <= 0) {
            throw new ValidacaoException("ID do tópico inválido. Forneça um ID válido.");
        }
        var topico=repository.findById(id).orElseThrow(() -> new ValidacaoException("Tópico não encontrado com o ID: " + id));
    }
}
