package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CitaMedica;
@Repository
@Transactional
public class CitaMedicaRepositoryImpl implements ICitaMedicaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	public void insertar(CitaMedica citaMedica) {
		this.entityManager.persist(citaMedica);
	}


	@Override
	public int actualizarPorNumeroCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createQuery(
				"UPDATE CitaMedica c  SET c.diagnostico =:datoDiagnostico, c.receta = :datoReceta, c.fechaControl = :datofecha WHERE c.numeroTurno = :numero");

		myQuery.setParameter("datoDiagnostico", diagnostico);
		myQuery.setParameter("datoReceta", receta);
		myQuery.setParameter("datofecha", fechaControl);
		myQuery.setParameter("numero", numero);
		
		return myQuery.executeUpdate();	
		}


}
