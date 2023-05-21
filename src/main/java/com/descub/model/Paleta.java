package com.descub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Paleta {
    @Id
    private int id_Mural;

    @ManyToOne
    @JoinColumn(name = "id_Colores")
    private Colores colores;
    
    

	public int getId_Mural() {
		return id_Mural;
	}

	public void setId_Mural(int id_Mural) {
		this.id_Mural = id_Mural;
	}

	public Colores getColores() {
		return colores;
	}

	public void setColores(Colores colores) {
		this.colores = colores;
	}
	
	

    
}
