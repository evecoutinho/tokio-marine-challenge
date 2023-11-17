package br.com.tokiomarine.tokiomarinechallenge.repositories;

import br.com.tokiomarine.tokiomarinechallenge.entities.Transference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferenceRepository extends JpaRepository<Transference, Long> {
}
