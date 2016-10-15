package todosproj.model;

import org.boon.json.annotations.JsonProperty;

public class User {
	Long id;

	@JsonProperty("username")

	private String username;

	public Long getId() {

		return id;

	}

	public void setId(Long id) {

		this.id = id;

	}

	public String getUsername() {

		return username;

	}

	public void setUsername(String username) {

		this.username = username;

	}
}
