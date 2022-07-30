package com.uce.edu.demo.service;

import com.uce.edu.demo.repository.modelo.Doctor;

public interface IDoctorService {
	
	public void insertar(Doctor doctor);

	public Doctor consultar(Integer id);

	public void actualizar(Doctor doctor);

	public void eliminar(Integer id);

}
