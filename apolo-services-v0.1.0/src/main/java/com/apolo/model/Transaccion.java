package com.apolo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Transaccion {
	
	@Id	
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	private int idtrx;
	private String origen;
	private String destino;
	private double monto;
	private double comission;
	private double impuesto;
	private String mensaje;
	private int estado;
	
	
	public int getIdtrx() {
		return idtrx;
	}
	public void setIdtrx(int idtrx) {
		this.idtrx = idtrx;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public double getComission() {
		return comission;
	}
	public void setComission(double comission) {
		this.comission = comission;
	}
	public double getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "Transaccion [idtrx=" + idtrx + ", origen=" + origen + ", destino=" + destino + ", monto=" + monto
				+ ", comission=" + comission + ", impuesto=" + impuesto + ", mensaje=" + mensaje + ", estado=" + estado
				+ "]";
	}
	
	

}
