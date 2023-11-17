package br.com.tokiomarine.tokiomarinechallenge.repositories;

import br.com.tokiomarine.tokiomarinechallenge.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {
}
