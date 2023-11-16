package vila.caldeira.Vila.Caldeira.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vila.caldeira.Vila.Caldeira.model.Missao;
import vila.caldeira.Vila.Caldeira.repository.MissaoRepository;

import java.util.List;

@Service

public class MissaoServices {
    @Autowired
    private MissaoRepository missaoRepository;

    public List<Missao> getmissaoExploracaoSRank(){
        return missaoRepository.findByTipoMissaoAndNinjaResponsavel_Nivel("Exploração", "SRank");
    }

}
