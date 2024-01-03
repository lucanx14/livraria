package epic.library.domain.livro;

import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroLivro(
		@NotBlank
		String titulo,
		@NotBlank
		String autor,
		@NotNull
		List<Long> generoIds,
		@JsonFormat(pattern = "dd/MM/yyyy")
		LocalDate anoPublicacao,
		String isbn,
		String sinopse
		) {

}
