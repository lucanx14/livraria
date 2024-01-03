package epic.library.domain.livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import epic.library.domain.genero.Genero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    @ManyToMany
    @JoinTable(
            name = "livro_genero",
            joinColumns = @JoinColumn(name = "livro_id"),
            inverseJoinColumns = @JoinColumn(name = "genero_id")
        )
    private List<Genero> generos = new ArrayList<Genero>();
    private String autor;
    @Column(name = "ano_publicacao")
    private LocalDate anoPublicacao; 
    private String isbn;
    private String sinopse;
    
    public Livro(DadosCadastroLivro dados, List<Genero> genero) {
    	if (dados.titulo() != null) {
            this.titulo = dados.titulo();
        }
        if (dados.autor() != null) {
            this.autor = dados.autor();
        }
        if (genero != null) {
        	this.generos = genero;
        }
        this.anoPublicacao = dados.anoPublicacao();
        this.isbn = dados.isbn();
        this.sinopse = dados.sinopse();
    }
    

}
