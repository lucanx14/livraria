package epic.library.domain.livro;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import epic.library.domain.genero.Genero;

public record DadosDetalhamentoLivro(
		String titulo,
		String autor,
		List<Genero> genero,
		LocalDate anoPublicacao,
		String isbn,
		String sinopse
		) {
	public DadosDetalhamentoLivro(Livro livro) {
		this(livro.getTitulo(), livro.getAutor(), livro.getGeneros(), 
				livro.getAnoPublicacao(), livro.getIsbn(), livro.getSinopse());
	}
}
