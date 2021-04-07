package ch.tbz.scooterscout.domain.model;

import ch.tbz.scooterscout.core.ExtendedJpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRepository extends ExtendedJpaRepository<Model> {
}
