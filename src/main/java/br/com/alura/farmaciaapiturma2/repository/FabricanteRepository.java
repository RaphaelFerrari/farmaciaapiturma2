package br.com.alura.farmaciaapiturma2.repository;

import br.com.alura.farmaciaapiturma2.model.Fabricante;
import org.apache.logging.log4j.util.Strings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricanteRepository extends JpaRepository<Fabricante, Integer> {
    Fabricante findByNome(String s);
}