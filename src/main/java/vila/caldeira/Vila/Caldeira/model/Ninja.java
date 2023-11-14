package vila.caldeira.Vila.Caldeira.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class Ninja {
    private String id;
    private String nome;
    private String vila;
    private String status;
    private String nivel;

    public Ninja(String id, String nome, String vila, String status, String nivel) {
        this.id = id;
        this.nome = nome;
        this.vila = vila;
        this.status = status;
        this.nivel = nivel;
    }
}





