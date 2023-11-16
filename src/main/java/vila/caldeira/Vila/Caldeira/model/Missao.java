package vila.caldeira.Vila.Caldeira.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@AllArgsConstructor

public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String classificacao;
    private String tipoMissao;
    private String status;

    @OneToOne
    @JoinColumn(name = "ninja_id")
    private Ninja ninjaResponsavel;
}





