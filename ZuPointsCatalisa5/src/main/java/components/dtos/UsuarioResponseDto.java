package components.dtos;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioResponseDto {

    private String nome;
    private Long id;
    private String username;
    private String role;

}
