package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.ICitaMedicaRepository;
import com.uce.edu.demo.repository.modelo.CitaMedica;
@Service
public class CitaMedicaImpl implements ICitaMedicaService{

	@Autowired
	private ICitaMedicaRepository iCitaMedicaRepository;
	@Override
	public void insertar(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.iCitaMedicaRepository.insertar(citaMedica);
	}

}
