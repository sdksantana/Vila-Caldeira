package vila.caldeira.Vila.Caldeira.service;


import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import vila.caldeira.Vila.Caldeira.model.Ninja;
import vila.caldeira.Vila.Caldeira.repository.MissaoRepository;
import vila.caldeira.Vila.Caldeira.services.MissaoServices;

@SpringBootTest
public class MissaoServicesTest {
    @Mock
    private MissaoRepository missaoRepository;

    @Mock
    private MissaoServices missaoServices;

//    @Test
//    void getmissaoExploracaoSRank() {
//        // criar dados de exemplo
//        Ninja ninjaSRank = new Ninja();
//        ninjaSRank.setNivel();
//    }

}
