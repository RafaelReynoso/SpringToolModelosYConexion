package com.descub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Colores {
	//ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Colores;

    private String nombre_color;
    private String codigo;
    private String red;
    private String blue;
    private String green;
    
    //GET Y SETT
	public int getId_Colores() {
		return id_Colores;
	}
	public void setId_Colores(int id_Colores) {
		this.id_Colores = id_Colores;
	}
	public String getNombre_color() {
		return nombre_color;
	}
	public void setNombre_color(String nombre_color) {
		this.nombre_color = nombre_color;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getRed() {
		return red;
	}
	public void setRed(String red) {
		this.red = red;
	}
	public String getBlue() {
		return blue;
	}
	public void setBlue(String blue) {
		this.blue = blue;
	}
	public String getGreen() {
		return green;
	}
	public void setGreen(String green) {
		this.green = green;
	}
    
    
}
