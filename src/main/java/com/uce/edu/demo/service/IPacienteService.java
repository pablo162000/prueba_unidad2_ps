package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Paciente;

public interface IPacienteService {

	
	public void insertar(Paciente paciente);

	public Paciente consultar(Integer id);

	public void actualizar(Paciente paciente);

	public void eliminar(Integer id);
}
