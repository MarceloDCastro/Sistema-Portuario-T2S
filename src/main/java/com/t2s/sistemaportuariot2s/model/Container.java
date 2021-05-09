package com.t2s.sistemaportuariot2s.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_container")
public class Container extends AbstractEntity{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nm_cliente", nullable = false, length = 80)
	private String nomeCliente;
	
	@Column(name = "cd_container", nullable = false, length = 11)
	private String numero;
	
	@Column(name = "ds_tipo", nullable = false)
	private Integer tipo;
	
	@Column(name = "ds_status", nullable = false)
	private String status;
	
	@Column(name = "ds_Categoria", nullable = false)
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