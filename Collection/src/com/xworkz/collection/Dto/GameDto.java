package com.xworkz.collection.Dto;

import java.io.Serializable;

public class GameDto implements Serializable{
	private String name;
	private String type;
	private int totalPlayers;
	public GameDto() {
		super();
	}
	public GameDto(String name, String type, int totalPlayers) {
		super();
		this.name = name;
		this.type = type;
		this.totalPlayers = totalPlayers;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("running equals from GameDto");
		if (obj != null) {
			if (obj instanceof GameDto) {
				GameDto dto = (GameDto) obj;
				// if (dto.name.equals(this.name) || dto.location.equals(this.type)||
				// dto.noOfWorkers == this.totalPlayers)
				if (dto.name.equals(this.name)) {
					System.out.println("name is matching : " + dto.name);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "GameDto [name=" + name + ", type=" + type + ", totalPlayers=" + totalPlayers + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTotalPlayers() {
		return totalPlayers;
	}
	public void setTotalPlayers(int totalPlayers) {
		this.totalPlayers = totalPlayers;
	}
	

}
