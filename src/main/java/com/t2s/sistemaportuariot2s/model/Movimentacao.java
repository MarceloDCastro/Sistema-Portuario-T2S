package com.t2s.sistemaportuariot2s.model;

import java.util.Date;

public class Movimentacao extends AbstractEntity{
	
	private static final long serialVersionUID = 1L;
		
	private String tipo;
	private Date dataHoraInicio;
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