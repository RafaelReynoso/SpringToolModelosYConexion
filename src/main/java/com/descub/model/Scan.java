package com.descub.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Scan {
	
	//ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_scan;
    
    @Temporal(TemporalType.DATE)
	private Date fec_registro;
	
	@ManyToOne
    @JoinColumn(name = "id_Mural")
    private Mural mural;
	
	@ManyToOne
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

	//GET Y SET
	public int getId_scan() {
		return id_scan;
	}

	public void setId_scan(int id_scan) {
		this.id_scan = id_scan;
	}

	public Date getFec_registro() {
		return fec_registro;
	}

	public void setFec_registro(Date fec_registro) {
		this.fec_registro = fec_registro;
	}

	public Mural getMural() {
		return mural;
	}

	public void setMural(Mural mural) {
		this.mural = mural;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

}
