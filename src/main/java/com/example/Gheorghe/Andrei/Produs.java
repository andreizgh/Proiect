package com.example.Gheorghe.Andrei;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

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


	public Produs()
	{
		
	}
	@Override
	public String toString() {
		return "Produs [ID=" + ID + ", Pret=" + Pret + ", Nota=" + Nota + "]";
	}

	public List<Produs> Afisare()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		return jdbcTemplate.query("select * from product", new ProductRowMapper());
	}
	public Produs findId(Integer id)
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
        ProductRowMapper productRowMapper = new ProductRowMapper();
        return jdbcTemplate.query("select * from product where id ="+id, productRowMapper).get(0);
	}
	public Integer getID() {
		return ID;
	}

	public void setID(int i) {
		ID = i;
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