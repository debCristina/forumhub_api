package br.com.alura.forumhub.validacao;

import br.com.alura.forumhub.domain.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ValidacaoDuplicidade {
    private final TopicoRepository topicoRepository;

    @Autowired
    public ValidacaoDuplicidade(TopicoRepository topicoRepository) {
        this.topicoRepository = topicoRepository;
    }

    public void validarDuplicidade(String titulo, String mensagem) {
        if (topicoRepository.existsByTituloAndMensagem(titulo, mensagem)) {
            throw new ValidacaoException("Já existe um tópico com o mesmo título e mensagem.");
        }
    }

}
