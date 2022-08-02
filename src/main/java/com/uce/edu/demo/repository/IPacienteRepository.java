package com.uce.edu.demo.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.uce.edu.demo.repository.modelo.Paciente;
import com.uce.edu.demo.repository.modelo.PacienteSencillo;

public interface IPacienteRepository {

	public void insertar(Paciente paciente);

	public Paciente buscar(Integer codigo);
	
	public Paciente buscarPorCedula(String cedula);


	public void actualizar(Paciente paciente);

	public void eliminar(Integer codigo);
	
	public List<PacienteSencillo> buscar(LocalDateTime fecha, String genero);

}
