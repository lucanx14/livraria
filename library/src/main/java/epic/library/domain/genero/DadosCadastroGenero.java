package epic.library.domain.genero;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroGenero(
		@NotBlank
        String nome
) {
}
