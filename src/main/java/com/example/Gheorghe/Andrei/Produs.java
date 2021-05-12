package com.example.Gheorghe.Andrei;

public class Produs {

	Integer ID;
	String Nume;
	Integer Pret;
	String Descriere;
	String Specificatii;
	Integer Nota;
	
	public Produs(Integer id, String nume, Integer pret, String descriere, String specificatii, Integer nota) {
		super();
		this.ID=id;
		this.Nume = nume;
		this.Pret = pret;
		this.Descriere = descriere;
		this.Specificatii = specificatii;
		this.Nota = nota;
	}

	
	@Override
	public String toString() {
		return "Produs [ID=" + ID + ", Pret=" + Pret + ", Nota=" + Nota + "]";
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNume() {
		return Nume;
	}
	
	public void setNume(String nume) {
		Nume = nume;
	}
	public Integer getPret() {
		return Pret;
	}
	public void setPret(Integer pret) {
		Pret = pret;
	}
	public String getDescriere() {
		return Descriere;
	}
	public void setDescriere(String descriere) {
		Descriere = descriere;
	}
	public String getSpecificatii() {
		return Specificatii;
	}
	public void setSpecificatii(String specificatii) {
		Specificatii = specificatii;
	}
	public Integer getNota() {
		return Nota;
	}
	public void setNota(Integer nota) {
		Nota = nota;
	}
}