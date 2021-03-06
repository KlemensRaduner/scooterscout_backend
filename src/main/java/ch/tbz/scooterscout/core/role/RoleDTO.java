package ch.tbz.scooterscout.core.role;

import ch.tbz.scooterscout.core.ExtendedDTO;
import ch.tbz.scooterscout.core.authority.AuthorityDTO;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

public class RoleDTO extends ExtendedDTO {

  @NotNull
  @Size(min = 1, max = 255)
  private String name;

  private Set<AuthorityDTO> authorities;

  public RoleDTO() {
  }

  public String getName() {
    return name;
  }

  public RoleDTO setName(String name) {
    this.name = name;
    return this;
  }

  public Set<AuthorityDTO> getAuthorities() {
    return authorities;
  }

  public RoleDTO setAuthorities(Set<AuthorityDTO> authorities) {
    this.authorities = authorities;
    return this;
  }
}
