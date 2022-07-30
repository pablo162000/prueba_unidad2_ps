package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IGestorCitaMedicaService {
	
	public void agendar(String numeroTurno, LocalDateTime fechaCita, BigDecimal costoCita, String lugarCita,
			String cedulaDoctor, String cedulaPaciente);
	
	public int actualizarPorNumeroCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl);


}
