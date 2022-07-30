package com.uce.edu.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CitaSencilla {
	
	private String numeroCita;
	private LocalDateTime fechaCita;
	private BigDecimal costoCita;
	private LocalDateTime fechaControl;
	
	public CitaSencilla() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public CitaSencilla(String numeroCita, LocalDateTime fechaCita, BigDecimal costoCita, LocalDateTime fechaControl) {
		super();
		this.numeroCita = numeroCita;
		this.fechaCita = fechaCita;
		this.costoCita = costoCita;
		this.fechaControl = fechaControl;
	}



	@Override
	public String toString() {
		return "CitaSencilla [numeroCita=" + numeroCita + ", fechaCita=" + fechaCita + ", costoCita=" + costoCita
				+ ", fechaControl=" + fechaControl + "]";
	}



	public String getNumeroCita() {
		return numeroCita;
	}
	public void setNumeroCita(String numeroCita) {
		this.numeroCita = numeroCita;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public BigDecimal getCostoCita() {
		return costoCita;
	}
	public void setCostoCita(BigDecimal costoCita) {
		this.costoCita = costoCita;
	}
	public LocalDateTime getFechaControl() {
		return fechaControl;
	}
	public void setFechaControl(LocalDateTime fechaControl) {
		this.fechaControl = fechaControl;
	}
	
	
	
}
