package com.xvitcoder.angualrspringapp.beans;

/**
 * Created with IntelliJ IDEA.
 * User: xvitcoder
 * Date: 12/21/12
 * Time: 12:19 AM
 */
public class Car {
	
    private Long id;
    private String name;
    private String color;
    private String fichier;

    public Car() { }
	
	public Car(Long id, String name, String color, String fichier) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.fichier = fichier;
	}


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

	
	public String getColor() {
		return color;
	}

	
	public void setColor(String color) {
		this.color = color;
	}

	
	public String getFichier() {
		return fichier;
	}

	
	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

}
