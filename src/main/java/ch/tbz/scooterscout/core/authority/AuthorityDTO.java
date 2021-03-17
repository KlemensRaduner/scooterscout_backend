package ch.tbz.scooterscout.core.authority;

import ch.tbz.scooterscout.core.ExtendedDTO;

import javax.validation.constraints.NotNull;

public class AuthorityDTO extends ExtendedDTO {

	@NotNull
	private String name;

	public AuthorityDTO() {
		super();
	}

	public String getName() {
		return name;
	}

	public AuthorityDTO setName(String name) {
		this.name = name;
		return this;
	}
}
