package vila.caldeira.Vila.Caldeira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import vila.caldeira.Vila.Caldeira.model.Ninja;

import java.util.List;

public interface NinjaRepository  extends JpaRepository<Ninja, Long> {
    List<Ninja> findAllByNivel(String nivel);
}
