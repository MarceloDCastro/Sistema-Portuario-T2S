package com.t2s.sistemaportuariot2s.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "tb_movimentacao")
public class Movimentacao extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;
		
	@Column(name = "ds_tipo", nullable = false)
	private String tipo;
	
	@Column(name = "dt_inicio", nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date dataHoraInicio;
	
	@Column(name = "dt_fim", nullable = true)
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
	private Date dataHoraFim;
	
	public Movimentacao() {
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}
	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}
	public Date getDataHoraFim() {
		return dataHoraFim;
	}
	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
	
}