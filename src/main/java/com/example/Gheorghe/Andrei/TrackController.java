package com.example.Gheorghe.Andrei;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowire;
import java.util.concurrent.atomic.*;



@RestController
public class TrackController {

	Produs produs;
	Utilizator utilizator;
	
	@GetMapping("/Id")
	public ModelAndView product(@RequestParam("id") Integer id) {
        ModelAndView modelAndView = new ModelAndView("product");
        Produs produsul = produs.findId(id);
        modelAndView.addObject("produs", produs);
        return modelAndView;
	}
	@GetMapping("/produs")
	public ModelAndView product() {
        ModelAndView modelAndView = new ModelAndView("product");
        List<Produs> produse =produs.Afisare();
        for(int i=0;i<=produse.size();i++)
        {
        modelAndView.addObject("produs", produse.get(i));
        }
        return modelAndView;
	}
	@PostMapping("/register")
	public ModelAndView register(@RequestParam("email")String email,@RequestParam("Nume")String nume,@RequestParam("Prenume")String prenume,@RequestParam("Parola")String parola,@RequestParam("username")String username)
	{
		ModelAndView Registrul=new ModelAndView("register");
		return Registrul;
	}
	@GetMapping("/Details")
	public ModelAndView detalii(@RequestParam("email")String email)
	{
		ModelAndView Detaliere = new ModelAndView("Detalii");
		Utilizator utilizat =new Utilizator();
		Detaliere.addObject("Utilizator",utilizat);
		return Detaliere;
	}
	@GetMapping("/clienti")
	public ModelAndView clienti() {
        ModelAndView modelAndView = new ModelAndView("product");
        List<Utilizator> clienti =utilizator.Afisare();
        for(int i=0;i<=clienti.size();i++)
        {
        modelAndView.addObject("client", clienti.get(i));
        }
        return modelAndView;
	}
        
}
