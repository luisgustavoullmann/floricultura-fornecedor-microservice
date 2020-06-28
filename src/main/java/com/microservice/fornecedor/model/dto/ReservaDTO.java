package com.microservice.fornecedor.model.dto;

/**
 * Created by Luis Gustavo Ullmann on 27/06/2020
 */
public class ReservaDTO {

	public Integer idReserva;
	
	public Integer tempoDePreparo;

	public Integer getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}
	
}
