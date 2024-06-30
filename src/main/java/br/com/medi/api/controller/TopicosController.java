package br.com.medi.api.controller;


import br.com.medi.api.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

    @Autowired
    private TopicoRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosTopicos dados){
        repository.save(new Topico(dados));
    }
    @GetMapping
    public Page<DadoListagemTopico> lista(@PageableDefault(size = 5, sort = {"id"}) Pageable pagina){
        return repository.findAll(pagina).map(DadoListagemTopico::new);
    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizarTopico dados){
        var topico = repository.getReferenceById(dados.id());
        topico.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var topico = repository.getReferenceById(id);
        topico.respoder();
    }
}
