package com.upc.dto;

import java.util.Date;

public class Simulacion {

	private Date fechaSim;
	private Usuario cliente;
	private Afp afp;
	private TipoComision tcomision;
	private TipoFondo tfondo;
	private float rentabilidad;
	private int remuneraciones;
	private float densidad;
	private String modalidad;
	private int sueldo;
	private int fondoactual;
	
	private float fondofinal;
	private float pensionmensual;
	private float TREA;
	private float VAN;
	
	
	public Date getFechaSim() {
		return fechaSim;
	}
	public void setFechaSim(Date fechaSim) {
		this.fechaSim = fechaSim;
	}
	public Usuario getCliente() {
		return cliente;
	}
	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	public Afp getAfp() {
		return afp;
	}
	public void setAfp(Afp afp) {
		this.afp = afp;
	}
	public TipoComision getTcomision() {
		return tcomision;
	}
	public void setTcomision(TipoComision tcomision) {
		this.tcomision = tcomision;
	}
	public TipoFondo getTfondo() {
		return tfondo;
	}
	public void setTfondo(TipoFondo tfondo) {
		this.tfondo = tfondo;
	}
	public float getRentabilidad() {
		return rentabilidad;
	}
	public void setRentabilidad(float rentabilidad) {
		this.rentabilidad = rentabilidad;
	}
	public int getRemuneraciones() {
		return remuneraciones;
	}
	public void setRemuneraciones(int remuneraciones) {
		this.remuneraciones = remuneraciones;
	}
	public float getDensidad() {
		return densidad;
	}
	public void setDensidad(float densidad) {
		this.densidad = densidad;
	}
	public String getModalidad() {
		return modalidad;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public int getFondoactual() {
		return fondoactual;
	}
	public void setFondoactual(int fondoactual) {
		this.fondoactual = fondoactual;
	}
	public float getFondofinal() {
		return fondofinal;
	}
	public void setFondofinal(float fondofinal) {
		this.fondofinal = fondofinal;
	}
	public float getPensionmensual() {
		return pensionmensual;
	}
	public void setPensionmensual(float pensionmensual) {
		this.pensionmensual = pensionmensual;
	}
	public float getTREA() {
		return TREA;
	}
	public void setTREA(float tREA) {
		TREA = tREA;
	}
	public float getVAN() {
		return VAN;
	}
	public void setVAN(float vAN) {
		VAN = vAN;
	}
	
}
