package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;
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

//		Doctor doc1 = new Doctor();
//		doc1.setNombre("Edison");
//		doc1.setApellido("Cayambe");
//		doc1.setCedula("123123");
//		doc1.setFechaNacimiento(LocalDateTime.now());
//		doc1.setNumeroConsultorio("A234");
//		doc1.setCodigoSenescyt("1414151");
//		doc1.setGenero("M");
//		this.iDoctorService.insertar(doc1);
////		
//		Doctor doc2 = new Doctor();
//		doc2.setNombre("Juan");
//		doc2.setApellido("Cayambe");
//		doc2.setCedula("155822");
//		doc2.setFechaNacimiento(LocalDateTime.now());
//		doc2.setNumeroConsultorio("A235");
//		doc2.setCodigoSenescyt("185952");
//		doc2.setGenero("M");
//		
//		this.iDoctorService.insertar(doc2);
////		
////		Paciente paci1 = new Paciente();
////		paci1.setNombre("Daniel");
////		paci1.setApellido("Teran");
////		paci1.setCedula("134533");
////		paci1.setFechaNacimiento(LocalDateTime.of(1990,12,2,8,56));
////		paci1.setCodigoSeguro("25584899");
////		paci1.setEstatura(new  Double("170"));
////		paci1.setPeso(new Double("101"));
////		paci1.setGenero("M");
////		
////		this.iPacienteService.insertar(paci1);
////		
//		Paciente paci2 = new Paciente();
//		paci2.setNombre("Daniel1");
//		paci2.setApellido("Teran");
//		paci2.setCedula("1184851");
//		paci2.setFechaNacimiento(LocalDateTime.of(1990,12,2,8,56));
//		paci2.setCodigoSeguro("258948485");
//		paci2.setEstatura(new  Double("170"));
//		paci2.setPeso(new Double("101"));
//		paci2.setGenero("F");
//		
//		this.iPacienteService.insertar(paci2);

		//this.iGestorCitaMedicaService.generarCita("12341", LocalDateTime.now(), new BigDecimal(40), "Inca", "155822", "1184851");
		
		
		//this.iGestorCitaMedicaService.actualizarCita("12341","gripe" , "paracetamol", LocalDateTime.now());
		
		List<PacienteSencillo> lista= this.iGestorCitaMedicaService.buscar(LocalDateTime.of(1990,12,2,7,56), "F");
		
		for(PacienteSencillo item: lista) {
			
			logJava.info("Persona Sencilla : " + item);
			
		}

		
	}

}
