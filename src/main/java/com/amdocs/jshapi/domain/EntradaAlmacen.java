/**
 * EntradaAlmacen.java
 */
package com.amdocs.jshapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


/**
 * @author Roberto Gutierrez Garcia
 *
 */
@Entity
@Table(name="entradaalmacen")
public class EntradaAlmacen {

	@Id
	@GeneratedValue
	@Column(name = "identradaalmacen")
	private Long id;
	
	@Column(name="foliointerno", length=15)
	private String folioInterno;

	@Column(name="cantidadoriginal", length=10)
	private String cantidadOriginal;

	@Column(name="cantidadactual", length=10)
	private String cantidadActual;

	@Column(name="seccionalmacenamiento", length=25)
	private String seccionAlmacenamiento;

	@Column(name="fechaentrada")
	private Date fechaEntrada;

	@Column
	private boolean status;

	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="idbancoalimentos",referencedColumnName="idbancoalimentos")
	private BancoAlimentos bancoAlimentos;

	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="iddetalledonativo",referencedColumnName="iddetalledonativo")
	private DetalleDonativo detalleDonativo;

	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idusuario", name="idusuario")
	private Account usuario;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

  	/**
     	* @return the Identifier
     	*/	
	public Long getIdentifier(){
		return this.id;
	} 	
	
	/**
	 * @return the folioInterno
	 */
	public String getFolioInterno() {
		return folioInterno;
	}

	/**
	 * @param folioInterno the folioInterno to set
	 */
	public void setFolioInterno(String folioInterno) {
		this.folioInterno = folioInterno;
	}

	/**
	 * @return the cantidadOriginal
	 */
	public String getCantidadOriginal() {
		return cantidadOriginal;
	}

	/**
	 * @param cantidadOriginal the cantidadOriginal to set
	 */
	public void setCantidadOriginal(String cantidadOriginal) {
		this.cantidadOriginal = cantidadOriginal;
	}

	/**
	 * @return the cantidadActual
	 */
	public String getCantidadActual() {
		return cantidadActual;
	}

	/**
	 * @param cantidadActual the cantidadActual to set
	 */
	public void setCantidadActual(String cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	/**
	 * @return the seccionAlmacenamiento
	 */
	public String getSeccionAlmacenamiento() {
		return seccionAlmacenamiento;
	}

	/**
	 * @param seccionAlmacenamiento the seccionAlmacenamiento to set
	 */
	public void setSeccionAlmacenamiento(String seccionAlmacenamiento) {
		this.seccionAlmacenamiento = seccionAlmacenamiento;
	}

	/**
	 * @return the fechaEntrada
	 */
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}

	/**
	 * @return the detalleDonativo
	 */
	public DetalleDonativo getDetalleDonativo() {
		return detalleDonativo;
	}

	/**
	 * @return the bancoAlimentos
	 */
	public BancoAlimentos getBancoAlimentos() {
		return bancoAlimentos;
	}

	/**
	 * @param bancoAlimentos the bancoAlimentos to set
	 */
	public void setBancoAlimentos(BancoAlimentos bancoAlimentos) {
		this.bancoAlimentos = bancoAlimentos;
	}

	/**
	 * @param detalleDonativo the detalleDonativo to set
	 */
	public void setDetalleDonativo(DetalleDonativo detalleDonativo) {
		this.detalleDonativo = detalleDonativo;
	}

	/**
	 * @return the usuario
	 */
	public Account getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(Account usuario) {
		this.usuario = usuario;
	}
}
