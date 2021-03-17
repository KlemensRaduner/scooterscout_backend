package ch.tbz.scooterscout.core.authority.mapper;

import ch.tbz.scooterscout.core.authority.Authority;
import ch.tbz.scooterscout.core.ExtendedDTOMapper;
import ch.tbz.scooterscout.core.authority.AuthorityDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AuthorityMapperExtended extends ExtendedDTOMapper<Authority, AuthorityDTO> {

}