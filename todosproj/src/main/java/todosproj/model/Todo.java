package todosproj.model;

import org.boon.json.annotations.JsonProperty;

public class Todo {
	Long id;

	@JsonProperty("name")

	private String name;

	@JsonProperty("status")

	private String status;

	public Long getId() {

		return id;

	}

	public void setId(Long id) {

		this.id = id;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public String getStatus() {

		return status;

	}

	public void setStatus(String status) {

		this.status = status;

	}
}
