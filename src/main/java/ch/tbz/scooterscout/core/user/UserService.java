package ch.tbz.scooterscout.core.user;

import ch.tbz.scooterscout.core.ExtendedService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService, ExtendedService<User> {
    User findByEmail(String email);
}
