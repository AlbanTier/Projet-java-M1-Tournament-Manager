package ila.project.tournament_manager.service.impl;

import ila.project.tournament_manager.model.Equipe;
import ila.project.tournament_manager.repository.EquipeRepository;
import ila.project.tournament_manager.service.EquipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EquipeServiceImpl implements EquipeService {
    public final EquipeRepository equipeRepository;
    @Override
    public Page<Equipe> getAllEquipes(String name, PageRequest page) {
        if (name == null) {
            return equipeRepository.findAll(page);
        } else {
            return equipeRepository.findAllByName(name, page);
        }
    }

    @Override
    public Optional<Equipe> getEquipeById(Long id) {
        return this.equipeRepository.findById(id);
    }

    @Override
    public Equipe saveEquipe(Equipe equipe) {
        return this.equipeRepository.save(equipe);
    }
}
