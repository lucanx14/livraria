package epic.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import epic.library.domain.livro.DadosCadastroLivro;
import epic.library.domain.livro.DadosDetalhamentoLivro;
import epic.library.domain.livro.LivroService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/livro")
public class LivroController {
	@Autowired
	private LivroService livroService;
	
	@PostMapping
	@Transactional
	public void cadastra(@RequestBody @Valid DadosCadastroLivro dados) {
		livroService.cadastraLivro(dados);
	}
	@GetMapping(value = "/{id}")
	public DadosDetalhamentoLivro buscar(@PathVariable Long id) {
		return livroService.buscarTodosLivro(id);
	}
}
