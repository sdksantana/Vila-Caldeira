package vila.caldeira.Vila.Caldeira.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import vila.caldeira.Vila.Caldeira.model.Missao;
import vila.caldeira.Vila.Caldeira.model.Ninja;

import java.util.List;

public interface MissaoRepository extends JpaRepository<Missao, Long> {
    List<Missao> findByTipoMissaoAndNinjaResponsavel_Nivel(String tipoMissao, String nivel);

}
