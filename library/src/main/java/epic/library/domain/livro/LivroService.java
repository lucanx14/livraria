package epic.library.domain.livro;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import epic.library.domain.genero.DadosCadastroGenero;
import epic.library.domain.genero.Genero;
import epic.library.domain.genero.GeneroRepository;

@Service
public class LivroService {
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired 
	private GeneroRepository generoRepository;
	
	
	public void cadastraLivro(DadosCadastroLivro dto) {
		List<Genero> genero = generoRepository.findAllById(dto.generoIds());
		livroRepository.save(new Livro(dto, genero));
	}


	public DadosDetalhamentoLivro buscarTodosLivro(Long id) {
		// TODO Auto-generated method stub
		var livro = livroRepository.getReferenceById(id);
		return new DadosDetalhamentoLivro(livro);
	}
}
