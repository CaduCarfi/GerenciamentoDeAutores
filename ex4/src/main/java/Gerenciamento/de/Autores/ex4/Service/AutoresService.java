package Gerenciamento.de.Autores.ex4.Service;

import Gerenciamento.de.Autores.ex4.Model.AutoresModel;
import Gerenciamento.de.Autores.ex4.Repository.AutoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutoresService {

    @Autowired
    private AutoresRepository autoresRepository;

    public List<AutoresModel> findAll() {
        return autoresRepository.findAll();
    }

    public Optional<AutoresModel> findById(Long id) {
        return autoresRepository.findById(id);
    }

    public void deletar(Long id) {
        autoresRepository.deleteById(id);
    }

    public AutoresModel salvar(AutoresModel autoresModel) {
        return autoresRepository.save(autoresModel);
    }
}
