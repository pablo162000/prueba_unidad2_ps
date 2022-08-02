package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
	public void actualiza(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}


	@Override
	public CitaMedica buscarPorNumero(String numero) {
		// TODO Auto-generated method stub
		
		TypedQuery<CitaMedica> miQuery= this.entityManager.createQuery("select c from CitaMedica c where c.numero =:numero", CitaMedica.class)	;	
				
		miQuery.setParameter("numero", numero);
		return miQuery.getSingleResult();
	}


	

}
