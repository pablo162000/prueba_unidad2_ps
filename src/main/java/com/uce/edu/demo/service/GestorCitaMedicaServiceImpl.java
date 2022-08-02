package com.uce.edu.demo.service;

import java.math.BigDecimal;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.IDoctorRepository;
import com.uce.edu.demo.repository.IPacienteRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
import com.uce.edu.demo.repository.modelo.Doctor;
import com.uce.edu.demo.repository.modelo.Paciente;


@Service
public class GestorCitaMedicaServiceImpl implements IGestorCitaMedicaService{

	@Autowired
	private IPacienteRepository iPacienteRepository;
	
	@Autowired
	private IDoctorRepository iDoctorRepository;
	
	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	

	
	@Override
	public void generarCita(String numeroTurno, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
//		
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumero(numeroTurno);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setValor(costoCita);
		citaMedica.setLugar(lugarCita);
		
		Doctor midoctor = this.iDoctorRepository.buscarPorCedula(cedulaDoctor);
		Paciente mipaciente = this.iPacienteRepository.buscarPorCedula(cedulaPaciente);
		
		citaMedica.setDoctor(midoctor);
//
		citaMedica.setPaciente(mipaciente);
//		
		this.iCitaMedicaRepository.insertar(citaMedica);
		
	
		
	}



	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		
		CitaMedica cita = this.iCitaMedicaRepository.buscarPorNumero(numero);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaCita(fechaControl);
		this.iCitaMedicaRepository.actualiza(cita);
		
		
	}



	
	

	
	
	

}
