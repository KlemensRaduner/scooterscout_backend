package ch.tbz.scooterscout.domain.scooter;

import ch.tbz.scooterscout.core.ExtendedJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScooterRepository extends ExtendedJpaRepository<Scooter> {

}
