package br.com.medi.api.topico;

import java.util.Date;

public record DadoListagemTopico(Long id,
                                 String titulo,
                                 String mensagem,
                                 Date dataCriacao) {

    public DadoListagemTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao());
    }
}
