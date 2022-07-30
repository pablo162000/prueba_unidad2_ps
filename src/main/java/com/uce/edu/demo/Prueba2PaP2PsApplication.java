package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.service.IDoctorService;
import com.uce.edu.demo.service.IGestorCitaMedicaService;
import com.uce.edu.demo.service.IPacienteService;

@SpringBootApplication
public class Prueba2PaP2PsApplication implements CommandLineRunner {

	private static Logger logJava = Logger.getLogger(Prueba2PaP2PsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Prueba2PaP2PsApplication.class, args);
	}

	@Autowired
	private IDoctorService iDoctorService;

	@Autowired
	private IPacienteService iPacienteService;
	
	@Autowired
	private IGestorCitaMedicaService iGestorCitaMedicaService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Doctor doctor = new Doctor();
		doctor.setApellido("Suntaxi");
		doctor.setNombre("Pablo");
		doctor.setCedula("1518189");
		doctor.setFechaNacimiento(LocalDateTime.now());
		doctor.setNumeroConsultorio("5");
		doctor.setSalario(new BigDecimal(1000));
		doctor.setTitulo("Pediatra");

		//this.iDoctorService.insertar(doctor);
		Doctor doctor1 = new Doctor();
		doctor1.setApellido("Pozpo");
		doctor1.setNombre("Carlos");
		doctor1.setCedula("881885");
		doctor1.setFechaNacimiento(LocalDateTime.now());
		doctor1.setNumeroConsultorio("6");
		doctor1.setSalario(new BigDecimal(1000));
		doctor1.setTitulo("Neurologo");

		//this.iDoctorService.insertar(doctor1);

		Paciente paciente = new Paciente();
		paciente.setApellido("Mera");
		paciente.setCedula("487195");
		paciente.setNombre("Ramiro");
		paciente.setCodigoIess("1824p");
		paciente.setEstatura("1.75m");
		paciente.setFechaNacimiento(LocalDateTime.now());
		paciente.setGenero("M");
		paciente.setPeso("80kg");

		//this.iPacienteService.insertar(paciente);
		Paciente paciente1 = new Paciente();
		paciente1.setApellido("Ramos");
		paciente1.setCedula("71889");
		paciente1.setNombre("Pepe");
		paciente1.setCodigoIess("8189154");
		paciente1.setEstatura("1.75m");
		paciente1.setFechaNacimiento(LocalDateTime.now());
		paciente1.setGenero("M");
		paciente1.setPeso("80kg");

		//this.iPacienteService.insertar(paciente1);
		//this.iPacienteService.insertar(null);
		
		//iGestorCitaMedicaService.agendar("1", LocalDateTime.now(), new BigDecimal(15), "La ofelia", doctor.getCedula(), paciente.getCedula());
		
		this.iGestorCitaMedicaService.actualizarPorNumeroCita("1", "nada", "pastilla", LocalDateTime.now());

	}

}
