package br.com.alura.forumhub.domain.topico;

import java.time.LocalDateTime;
import java.util.List;

public record DadosDetalhamentoTopico(Long id , String titulo, String mensagem, LocalDateTime dataCriacao, String nomeAutor, Status status, List<String> respostas) {
    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(),topico.getDataCriacao(),topico.getAutor(),topico.getStatus(), topico.getRespostas());
    }
}
