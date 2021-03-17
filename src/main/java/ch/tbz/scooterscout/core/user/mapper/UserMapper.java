package ch.tbz.scooterscout.core.user.mapper;

import ch.tbz.scooterscout.core.ExtendedDTOMapper;
import ch.tbz.scooterscout.core.user.User;
import ch.tbz.scooterscout.core.user.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper extends ExtendedDTOMapper<User, UserDTO> {

}
