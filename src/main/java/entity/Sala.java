package entity;

import java.sql.Date;



public class Sala {

	private int idSala;
	private String numero;
	private int piso;
	private int numAlumnos;
	private String recursos;
	private Date fechaRegistro;
	private int estado;
	private Sede sede;
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getPiso() {
		return piso;
	}
	public void setPiso(int piso) {
		this.piso = piso;
	}
	public int getNumAlumnos() {
		return numAlumnos;
	}
	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}
	public String getRecursos() {
		return recursos;
	}
	public void setRecursos(String recursos) {
		this.recursos = recursos;
	}
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public Sede getSede() {
		return sede;
	}
	public void setSede(Sede sede) {
		this.sede = sede;
	}
	
	

}
