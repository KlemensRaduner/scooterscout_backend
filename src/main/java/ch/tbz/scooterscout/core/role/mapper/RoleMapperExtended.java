package ch.tbz.scooterscout.core.role.mapper;

import ch.tbz.scooterscout.core.ExtendedDTOMapper;
import ch.tbz.scooterscout.core.role.Role;
import ch.tbz.scooterscout.core.role.RoleDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel="spring", unmappedTargetPolicy=ReportingPolicy.IGNORE)
public interface RoleMapperExtended extends ExtendedDTOMapper<Role, RoleDTO> {
	
}
