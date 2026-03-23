package Gerenciamento.de.Autores.ex4.Controller;

import Gerenciamento.de.Autores.ex4.Model.AutoresModel;
import Gerenciamento.de.Autores.ex4.Service.AutoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("autores")
public class AutoresController {

    @Autowired
    private AutoresService autoresService;

    @PostMapping
    public ResponseEntity<AutoresModel> criar(@RequestBody AutoresModel autoresModel) {
        AutoresModel salvo = autoresService.salvar(autoresModel);
        return ResponseEntity.status(201).body(salvo);
    }

    @GetMapping
    public ResponseEntity<List<AutoresModel>> findAll() {
        return ResponseEntity.ok(autoresService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AutoresModel> findById(@PathVariable Long id) {
        return autoresService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        autoresService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
