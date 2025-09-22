package dev.iluck.CadastroDeNinjas.Repositoryes;

import dev.iluck.CadastroDeNinjas.Models.MissaoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissaoModel, Long> {

}
