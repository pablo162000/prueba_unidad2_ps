package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.PacienteSencillo;

public interface IGestorCitaMedicaService {
	
	public void generarCita(String numeroTurno, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente);
	
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl);

	public List<PacienteSencillo> buscar(LocalDateTime fecha, String genero);


}
