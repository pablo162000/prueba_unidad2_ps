package com.uce.edu.demo.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "paci_id_seq")
    @SequenceGenerator(name = "paci_id_seq", sequenceName = "paci_id_seq", allocationSize = 1)
    @Column(name = "paci_id")
    private Integer id;

    @Column(name = "paci_cedula")
    private String cedula;

    @Column(name = "paci_nombre")
    private String nombre;

    @Column(name = "paci_apellido")
    private String apellido;

    @Column(name = "paci_fecha_nacimiento")
    private LocalDateTime fechaNacimiento;

    @Column(name = "paci_codigo_iess")
    private String codigoIess;

    @Column(name = "paci_estatura")
    private String estatura;

    @Column(name = "paci_peso")
    private String peso;

    @Column(name = "paci_genero")
    private String genero;
	
    @OneToMany(mappedBy = "paciente")
	private List<CitaMedica> citasMedicas;

    
    //GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoIess() {
		return codigoIess;
	}

	public void setCodigoIess(String codigoIess) {
		this.codigoIess = codigoIess;
	}

	public String getEstatura() {
		return estatura;
	}

	public void setEstatura(String estatura) {
		this.estatura = estatura;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitasMedicas() {
		return citasMedicas;
	}

	public void setCitasMedicas(List<CitaMedica> citasMedicas) {
		this.citasMedicas = citasMedicas;
	}
    
    
    

}
