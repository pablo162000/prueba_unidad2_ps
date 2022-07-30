package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Paciente;

public interface IPacienteRepository {

	public void insertar(Paciente paciente);

	public Paciente consultar(Integer id);
	
	public Paciente consultarCedula(String cedula);


	public void actualizar(Paciente paciente);

	public void eliminar(Integer id);

}
