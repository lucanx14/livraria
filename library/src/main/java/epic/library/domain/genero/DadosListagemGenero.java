package epic.library.domain.genero;

public record DadosListagemGenero(Long id, String nome) {
	public DadosListagemGenero(Genero genero) {
		this(
				genero.getId(),
				genero.getNome()
				);
	}
}
