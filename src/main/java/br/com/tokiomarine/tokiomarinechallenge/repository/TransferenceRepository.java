package br.com.tokiomarine.tokiomarinechallenge.repository;

import br.com.tokiomarine.tokiomarinechallenge.entity.Transference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransferenceRepository extends JpaRepository<Transference, Long> {
}
