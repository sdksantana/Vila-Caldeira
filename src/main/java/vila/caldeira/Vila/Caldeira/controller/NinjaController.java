package vila.caldeira.Vila.Caldeira.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vila.caldeira.Vila.Caldeira.model.Ninja;

import java.awt.*;
import java.util.List;

@AllArgsConstructor
@RestController
public class NinjaController {
    private List<Ninja> listaDeNinjas;

//    @Autowired
//    public NinjaController(Ninja ninjaModel){
//        this.ninjaModel = ninjaModel;
//    }

    @GetMapping("/ninjas")
    public List<Ninja> listaDeNinjas() {
        return listaDeNinjas;
    }

//    @GetMapping("/ninjas/{getById}")
//    public Ninja getById(@PathVariable getById) {
//
//
//
//
//    }

    @PostMapping("/ninjas/add")
    public ResponseEntity<String> addNinja(@RequestBody String id, String nome, String vila, String status, String nivel){
        Ninja ninja = new Ninja(id, nome, vila, status, nivel);
        listaDeNinjas.add(ninja);
        return ResponseEntity.ok("adicionado!");
    }
}