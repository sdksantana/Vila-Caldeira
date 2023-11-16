package vila.caldeira.Vila.Caldeira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vila.caldeira.Vila.Caldeira.model.Missao;
import vila.caldeira.Vila.Caldeira.repository.MissaoRepository;
import vila.caldeira.Vila.Caldeira.repository.NinjaRepository;
import vila.caldeira.Vila.Caldeira.services.MissaoServices;

import java.util.List;

@RestController
@RequestMapping("/api/missao")
public class MissaoController {
    @Autowired
    private MissaoServices missaoServices;

    @GetMapping("exploracao/srank")
    public ResponseEntity<List<Missao>> getMissaoExploracaoSRank() {
        List<Missao> missaoList = missaoServices.getmissaoExploracaoSRank();
        return new ResponseEntity<>(missaoList, HttpStatus.OK);
    }

}
