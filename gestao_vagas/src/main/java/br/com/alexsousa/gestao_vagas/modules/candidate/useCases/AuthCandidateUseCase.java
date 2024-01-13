package br.com.alexsousa.gestao_vagas.modules.candidate.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alexsousa.gestao_vagas.modules.candidate.CandidateRepository;
import br.com.alexsousa.gestao_vagas.modules.candidate.dto.AuthCandidateRequestDTO;

@Service
public class AuthCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    public void execute(AuthCandidateRequestDTO authCandidateRequestDTO){
        
    }
}
