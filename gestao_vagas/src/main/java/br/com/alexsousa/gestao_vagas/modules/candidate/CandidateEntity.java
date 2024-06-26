package br.com.alexsousa.gestao_vagas.modules.candidate;
import java.time.LocalDateTime;
import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity(name="candidate")
public class CandidateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Schema(example = "Daniel de Sousa")
    private String name;

    @NotBlank()
    @Pattern(regexp = "\\S+", message = "O campo [username] não deve conter espaço")
    @Schema(example = "Daniel", requiredMode = Schema.RequiredMode.REQUIRED, description = "username do candidato")
    private String username;

    @Email(message = "O campo (email) deve conter um e-mail válido")
    @Schema(example = "daniel@email.com", requiredMode = Schema.RequiredMode.REQUIRED, description = "email do candidato")
    private String email;
    @Length(min = 10, max = 100, message = "A senha deve ter entre 10 a 100 caracteres")
    @Schema(example = "admin@1234", minLength = 10, maxLength = 100, requiredMode = Schema.RequiredMode.REQUIRED, description = "Senha do candidato")
    private String password;
    @Schema(example = "Desenvolvedor Java")
    private String description;
    private String curriculum;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
}
