package br.com.alura.farmaciaapiturma2.controller;

import br.com.alura.farmaciaapiturma2.dto.DadosCadrastroDTO;
import br.com.alura.farmaciaapiturma2.model.Fabricante;
import br.com.alura.farmaciaapiturma2.model.Produto;
import br.com.alura.farmaciaapiturma2.repository.FabricanteRepository;
import br.com.alura.farmaciaapiturma2.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController {
    @Autowired
    private FabricanteRepository fabricanteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadrastrar(@RequestBody @Valid DadosCadrastroDTO dadosCadrastro) {

        Fabricante fabricante = fabricanteRepository.findByNome(dadosCadrastro.nomeFabricante());
            if (fabricante == null){
                fabricante = new Fabricante(dadosCadrastro);
                fabricanteRepository.save(fabricante);
            }
            var produto = new Produto(dadosCadrastro,fabricante);
            produtoRepository.save(produto);
            return ResponseEntity.ok(produto);

    }


}
