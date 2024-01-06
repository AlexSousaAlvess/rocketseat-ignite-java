package br.com.alexsousa.gestao_vagas.modules.company.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity(name = "job")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String description;
    private String benefits;

    @NotBlank(message = "Esse campo é obrigatório")
    private String level;

    @Column(name = "company_id", insertable = false, updatable = false, nullable = false)
    private UUID CompanyId;

    @ManyToOne() // Muitos jobs pra uma company
    @JoinColumn(name = "company_id")
    private CompanyEntity companyEntity;

    @CreationTimestamp
    private LocalDateTime createdAt;
}
