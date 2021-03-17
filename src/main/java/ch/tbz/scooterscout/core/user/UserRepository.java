package ch.tbz.scooterscout.core.user;

import ch.tbz.scooterscout.core.ExtendedJpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface UserRepository extends ExtendedJpaRepository<User> {
    @Transactional
    @Query(nativeQuery = true, value = "select * from public.users where email = ? and enabled = 1")
    Optional<User> findByEmail(String email);
}
