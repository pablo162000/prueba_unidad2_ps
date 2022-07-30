package com.uce.edu.demo.repository;

import com.uce.edu.demo.repository.modelo.Doctor;

public interface IDoctorRepository {

	public void insertar(Doctor doctor);

	public Doctor consultar(Integer id);
	public Doctor consultarCedula(String cedula);


	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);

}
