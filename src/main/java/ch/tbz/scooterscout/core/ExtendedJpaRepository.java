package ch.tbz.scooterscout.core;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExtendedJpaRepository<T extends ExtendedEntity> extends JpaRepository<T, String> {

}
