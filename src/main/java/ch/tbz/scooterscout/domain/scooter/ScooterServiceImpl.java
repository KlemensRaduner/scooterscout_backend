package ch.tbz.scooterscout.domain.scooter;

import ch.tbz.scooterscout.core.ExtendedJpaRepository;
import ch.tbz.scooterscout.core.ExtendedServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ScooterServiceImpl extends ExtendedServiceImpl<Scooter> implements ScooterService {

    public ScooterServiceImpl(ExtendedJpaRepository<Scooter> repository) {
        super(repository);
    }

    @Override public List<Scooter> findTop10() {
        return ((ScooterRepository) repository).findAll().stream().limit(10).collect(Collectors.toList());
    }
}
