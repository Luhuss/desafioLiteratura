package com.alura.literatura;

import com.alura.literatura.libreria.Libreria;
import com.alura.literatura.repository.iAutorRepository;
import com.alura.literatura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeAluraLiteraturaApplicationConsola implements CommandLineRunner {
	@Autowired
	private iLibroRepository libroRepository;
	@Autowired
	private iAutorRepository autorRepository;

	public ChallengeAluraLiteraturaApplicationConsola() {
	}

	public static void main(String[] args) {
		SpringApplication.run(ChallengeAluraLiteraturaApplicationConsola.class, args);
	}

	public void run(String... args) throws Exception {
		Libreria libreria = new Libreria(this.libroRepository, this.autorRepository);
		libreria.consumo();
	}
}