package com.java.ocr.persistencia.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * Representa una Afore, mapeado a la tabla PSER_TR_FOLIO_PULSSAR.
 *
 * @author jmcabrer
 */
public class Folio implements Serializable {

	/** serial. */
	private static final long serialVersionUID = 9158410388079600432L;

	/** The id. */
	private Long id;

	/** Identificador. */
	private Long idFolioPulssar;

	/** Id servicio. */
	private Long idServicio;

	/** usuario PULSSAR. */
	private Long idUsuarioPulssar;

	/** Folio. */
	private String chFolio;

	/** Descripcion. */
	private String descripcion;

	/** sucursal. */
	private String sucursal;

	/** Nss. */
	private String nss;

	/** CURP. */
	private String curp;

	/** Estatus. */
	private Long estatus;

	/** Fecha de generacion. */
	private Date fechaGeneracion;

	/** Fecha de control. */
	private Date fechaControl;

	/** Usuario modificador. */
	private String usuarioModificador;

	/** Fecha de llegada. */
	private Date fechaLlegada;

	/** Fecha de llegada. */
	private Date fechaCierre;

	/** Relacion folio Detalle. */
	private List<FolioDetalle> folioDetalles;

	/** idFolioPulssarPadre. */
	private Long idFolioPulssarPadre;

	/** Estatus Padre. */
	private Long estatusPadre;

	/**
	 * Constructor default.
	 *
	 * @author Jose Manuel Cabrera Cardenas (jmcabrer@procesar.com)
	 */
	public Folio() {
	}

	/**
	 * Constructor findFolioXml.
	 *
	 * @author Jose Manuel Cabrera Cardenas (jmcabrer@procesar.com)
	 * @param idFolioPulssar the id folio pulssar
	 * @param chFolio        the ch folio
	 * @param nss            the nss
	 * @param curp           the curp
	 */
	public Folio(Long idFolioPulssar, String chFolio, String nss, String curp) {
		this.idFolioPulssar = idFolioPulssar;
		this.chFolio = chFolio;
		this.nss = nss;
		this.curp = curp;
	}

	/**
	 * Gets the id folio pulssar.
	 *
	 * @return el atributo idFolioPulssar
	 */
	public Long getIdFolioPulssar() {
		return idFolioPulssar;
	}

	/**
	 * Sets the id folio pulssar.
	 *
	 * @param idFolioPulssar the new id folio pulssar
	 */
	public void setIdFolioPulssar(Long idFolioPulssar) {
		this.idFolioPulssar = idFolioPulssar;
	}

	/**
	 * Gets the id servicio.
	 *
	 * @return the idServicio
	 */
	public Long getIdServicio() {
		return idServicio;
	}

	/**
	 * Sets the id servicio.
	 *
	 * @param idServicio the idServicio to set
	 */
	public void setIdServicio(Long idServicio) {
		this.idServicio = idServicio;
	}

	/**
	 * Gets the id usuario pulssar.
	 *
	 * @return el atributo idUsuarioPulssar
	 */
	public Long getIdUsuarioPulssar() {
		return idUsuarioPulssar;
	}

	/**
	 * Sets the id usuario pulssar.
	 *
	 * @param idUsuarioPulssar parametro idUsuarioPulssar a actualizar
	 */
	public void setIdUsuarioPulssar(Long idUsuarioPulssar) {
		this.idUsuarioPulssar = idUsuarioPulssar;
	}

	/**
	 * Gets the ch folio.
	 *
	 * @return el atributo chFolio
	 */
	public String getChFolio() {
		return chFolio;
	}

	/**
	 * Sets the ch folio.
	 *
	 * @param chFolio the new ch folio
	 */
	public void setChFolio(String chFolio) {
		this.chFolio = chFolio;
	}

	/**
	 * Gets the descripcion.
	 *
	 * @return el atributo descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion parametro descripcion a actualizar
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Gets the sucursal.
	 *
	 * @return el atributo sucursal
	 */
	public String getSucursal() {
		return sucursal;
	}

	/**
	 * Sets the sucursal.
	 *
	 * @param sucursal parametro sucursal a actualizar
	 */
	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	/**
	 * Gets the nss.
	 *
	 * @return el atributo nss
	 */
	public String getNss() {
		return nss;
	}

	/**
	 * Sets the nss.
	 *
	 * @param nss parametro nss a actualizar
	 */
	public void setNss(String nss) {
		this.nss = nss;
	}

	/**
	 * Gets the curp.
	 *
	 * @return el atributo curp
	 */
	public String getCurp() {
		return curp;
	}

	/**
	 * Sets the curp.
	 *
	 * @param curp parametro curp a actualizar
	 */
	public void setCurp(String curp) {
		this.curp = curp;
	}

	/**
	 * Gets the estatus.
	 *
	 * @return el atributo estatus
	 */
	public Long getEstatus() {
		return estatus;
	}

	/**
	 * Sets the estatus.
	 *
	 * @param estatus parametro estatus a actualizar
	 */
	public void setEstatus(Long estatus) {
		this.estatus = estatus;
	}

	/**
	 * Gets the fecha generacion.
	 *
	 * @return el atributo fechaGeneracion
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public Date getFechaGeneracion() {
		return fechaGeneracion;
	}

	/**
	 * Sets the fecha generacion.
	 *
	 * @param fechaGeneracion parametro fechaGeneracion a actualizar
	 */
	public void setFechaGeneracion(Date fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	/**
	 * Gets the fecha control.
	 *
	 * @return el atributo fechaControl
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public Date getFechaControl() {
		return fechaControl;
	}

	/**
	 * Sets the fecha control.
	 *
	 * @param fechaControl parametro fechaControl a actualizar
	 */
	public void setFechaControl(Date fechaControl) {
		this.fechaControl = fechaControl;
	}

	/**
	 * Gets the usuario modificador.
	 *
	 * @return el atributo usuarioModificador
	 */
	public String getUsuarioModificador() {
		return usuarioModificador;
	}

	/**
	 * Sets the usuario modificador.
	 *
	 * @param usuarioModificador parametro usuarioModificador a actualizar
	 */
	public void setUsuarioModificador(String usuarioModificador) {
		this.usuarioModificador = usuarioModificador;
	}

	/**
	 * Gets the folio detalles.
	 *
	 * @return el atributo folioDetalles
	 */
	public List<FolioDetalle> getFolioDetalles() {
		if (folioDetalles == null) {
			folioDetalles = new ArrayList<>();
		}
		return folioDetalles;
	}

	/**
	 * Gets the fecha llegada.
	 *
	 * @return el atributo fechaLlegada
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public Date getFechaLlegada() {
		return fechaLlegada;
	}

	/**
	 * Sets the fecha llegada.
	 *
	 * @param fechaLlegada parametro fechaLlegada a actualizar
	 */
	public void setFechaLlegada(Date fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	/**
	 * Gets the fecha cierre.
	 *
	 * @return el atributo fechaCierre
	 */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	public Date getFechaCierre() {
		return fechaCierre;
	}

	/**
	 * Sets the fecha cierre.
	 *
	 * @param fechaCierre parametro fechaCierre a actualizar
	 */
	public void setFechaCierre(Date fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	/**
	 * Sets the folio detalles.
	 *
	 * @param folioDetalles parametro folioDetalles a actualizar
	 */
	public void setFolioDetalles(List<FolioDetalle> folioDetalles) {
		this.folioDetalles = folioDetalles;
	}

	/**
	 * Gets the id folio pulssar padre.
	 *
	 * @return the idFolioPulssarPadre
	 */
	public Long getIdFolioPulssarPadre() {
		return idFolioPulssarPadre;
	}

	/**
	 * Sets the id folio pulssar padre.
	 *
	 * @param idFolioPulssarPadre the idFolioPulssarPadre to set
	 */
	public void setIdFolioPulssarPadre(Long idFolioPulssarPadre) {
		this.idFolioPulssarPadre = idFolioPulssarPadre;
	}

	/**
	 * Agregar detalle folio
	 * 
	 *
	 * @author Omar Balbuena Qui�ones (OJBALBUE@inet.procesar.com.mx)
	 * @param folioDetalle the folio detalle
	 */
	public void addFolioDetalle(FolioDetalle folioDetalle) {
		getFolioDetalles().add(folioDetalle);
		folioDetalle.setFolio(this);
	}

	/*
	 * La documentaci�n de este m�todo se encuentra en la clase o interface que lo
	 * declara (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	/**
	 * Gets the estatus padre.
	 *
	 * @return the estatusPadre
	 */
	public Long getEstatusPadre() {

		return estatusPadre;
	}

	/**
	 * Sets the estatus padre.
	 *
	 * @param estatusPadre the estatusPadre to set
	 */
	public void setEstatusPadre(Long estatusPadre) {
		this.estatusPadre = estatusPadre;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Folio [id=");
		builder.append(id);
		builder.append(", idFolioPulssar=");
		builder.append(idFolioPulssar);
		builder.append(", idServicio=");
		builder.append(idServicio);
		builder.append(", idUsuarioPulssar=");
		builder.append(idUsuarioPulssar);
		builder.append(", chFolio=");
		builder.append(chFolio);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", sucursal=");
		builder.append(sucursal);
		builder.append(", nss=");
		builder.append(nss);
		builder.append(", curp=");
		builder.append(curp);
		builder.append(", estatus=");
		builder.append(estatus);
		builder.append(", fechaGeneracion=");
		builder.append(fechaGeneracion);
		builder.append(", fechaControl=");
		builder.append(fechaControl);
		builder.append(", usuarioModificador=");
		builder.append(usuarioModificador);
		builder.append(", fechaLlegada=");
		builder.append(fechaLlegada);
		builder.append(", fechaCierre=");
		builder.append(fechaCierre);
		builder.append(", folioDetalles=");
		builder.append(folioDetalles);
		builder.append(", idFolioPulssarPadre=");
		builder.append(idFolioPulssarPadre);
		builder.append(", estatusPadre=");
		builder.append(estatusPadre);
		builder.append("]");
		return builder.toString();
	}

}
