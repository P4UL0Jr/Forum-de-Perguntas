package br.com.medi.api.topico;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Table(name = "topicos")
@Entity(name  = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titulo;
    private String mensagem;
    private Date dataCriacao;
    private String nomeAutor;
    private String status;
    @Embedded
    private Resposta resposta;
    @Enumerated
    private Tema tema;

    public Topico(DadosTopicos dado){
        this.titulo = dado.titulo();
        this.mensagem = dado.mensagem();
        dataCriacao = new Date();
        this.nomeAutor = dado.nomeAutor();
        this.status = "não respondida";
        this.resposta = new Resposta(dado.resposta());
        this.tema = dado.tema();

    }

}
