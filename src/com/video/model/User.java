package com.video.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class User {
	private static int idCounter;
	private int id;
	private String name;
	private String surname;
	private String password;
	private LocalDateTime registerDate;
	private List<Integer> videosId= new ArrayList<>();
	
	public User(String name,String surname,String password) {
		if (name.trim().equals(""))
			throw new NullPointerException("El nom no pot estar buit.");
		if (surname.trim().equals(""))
			throw new NullPointerException("El cognom no pot estar buit.");
		if (password.trim().equals(""))
			throw new NullPointerException("El password no pot estar buit.");
		id=idCounter++;
		this.name=name;
		this.surname=surname;
		this.password=password;
		registerDate=LocalDateTime.now();	
	}

	public void addVideo(int videoId) {
		videosId.add(videoId);
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getPassword() {
		return password;
	}
}
