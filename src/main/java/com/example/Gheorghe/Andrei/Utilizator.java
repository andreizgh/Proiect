package com.example.Gheorghe.Andrei;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class Utilizator {
	
	String Nume;
	String Prenume;
	String Mail;
	String username;
	String Parola;
	public String getNume() {
		return Nume;
	}
	public void setNume(String nume) {
		Nume = nume;
	}
	public String getPrenume() {
		return Prenume;
	}
	public void setPrenume(String prenume) {
		Prenume = prenume;
	}
	public String getMail() {
		return Mail;
	}
	public void setMail(String mail) {
		Mail = mail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getParola() {
		return Parola;
	}
	public void setParola(String parola) {
		Parola = parola;
	}
	public Utilizator(String nume, String prenume, String mail, String username, String parola) {
		super();
		Nume = nume;
		Prenume = prenume;
		Mail = mail;
		this.username = username;
		Parola = parola;
	}

	public Utilizator()
	{
		
	}
	public Utilizator findemail(String email)
	{
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		UserRowMapper user = new UserRowMapper();
        return jdbcTemplate.query("select * from utilizator where email ="+email, user).get(0);
	}
	public List<Utilizator> Afisare()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		return jdbcTemplate.query("select * from utilizator", new UserRowMapper());
	}
	public void Salvare(String nume,String prenume,String mail,String user,String parola)
	{
		
	}
}
