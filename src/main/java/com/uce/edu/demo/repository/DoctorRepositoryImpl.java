package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepositoryImpl implements IDoctorRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor consultar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void actualizar(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

		Doctor doctor = this.consultar(id);

		this.entityManager.remove(doctor);
	}

	@Override
	public Doctor consultarCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor> jpqlTypedQuery = this.entityManager
				.createQuery("SELECT d FROM Doctor d WHERE d.cedula = :datoCedula", Doctor.class);
		jpqlTypedQuery.setParameter("datoCedula", cedula );
		
		return jpqlTypedQuery.getSingleResult();	}

}
