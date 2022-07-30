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
	public void agendar(String numeroTurno, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente) {
		// TODO Auto-generated method stub
		
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumeroTurno(numeroTurno);
		citaMedica.setFechaCita(fechaCita);
		citaMedica.setCostoCita(costoCita);
		citaMedica.setLugarCita(lugarCita);
		
		Doctor doctor = this.iDoctorRepository.consultarCedula(cedulaDoctor);
		Paciente paciente = this.iPacienteRepository.consultarCedula(cedulaPaciente);
		
		citaMedica.setDoctor(doctor);

		citaMedica.setPaciente(paciente);
		
		this.iCitaMedicaRepository.insertar(citaMedica);
		
	
		
	}



	@Override
	public int actualizarPorNumeroCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		return this.iCitaMedicaRepository.actualizarPorNumeroCita(numero, diagnostico, receta, fechaControl);
	}
	
	
	

	
	
	

}
