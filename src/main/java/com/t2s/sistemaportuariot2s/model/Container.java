package com.t2s.sistemaportuariot2s.model;

import javax.persistence.Entity;

@Entity
public class Container extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	private String nomeCliente;
	private String numero;
	private Integer tipo;
	private String status;
	private String categoria;
	
	public Container() {
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}