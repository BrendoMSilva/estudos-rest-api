package xxttech.estudos.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import xxttech.estudos.rest.api.model.UsuarioModel;
import xxttech.estudos.rest.api.repository.UsuarioRepository;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping(path = "api/usuario/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {

        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/usuario/salvar")
    public UsuarioModel salvar(@RequestBody UsuarioModel usuario) {
        return repository.save(usuario);
    }
}
