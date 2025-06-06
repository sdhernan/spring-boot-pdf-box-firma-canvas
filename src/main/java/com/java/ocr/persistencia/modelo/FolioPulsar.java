package com.java.ocr.persistencia.modelo;

public class FolioPulsar {

	private Long idFolioPulssar;

	private Integer idServicio;

	private Integer idUsuarioPulssar;

	private String chFolio;

	private String descripcion;
	private String sucursal;
	private String nss;
	private String curp;
	private Integer estatus;
	private String fechaGeneracion;
	private String fechaControl;
	private String usuarioModificador;
	private String fechaLlegada;
	private String fechaCierre;

	public FolioPulsar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdFolioPulssar() {
		return idFolioPulssar;
	}

	public void setIdFolioPulssar(Long idFolioPulssar) {
		this.idFolioPulssar = idFolioPulssar;
	}

	public Integer getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Integer idServicio) {
		this.idServicio = idServicio;
	}

	public Integer getIdUsuarioPulssar() {
		return idUsuarioPulssar;
	}

	public void setIdUsuarioPulssar(Integer idUsuarioPulssar) {
		this.idUsuarioPulssar = idUsuarioPulssar;
	}

	public String getChFolio() {
		return chFolio;
	}

	public void setChFolio(String chFolio) {
		this.chFolio = chFolio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public String getNss() {
		return nss;
	}

	public void setNss(String nss) {
		this.nss = nss;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Integer getEstatus() {
		return estatus;
	}

	public void setEstatus(Integer estatus) {
		this.estatus = estatus;
	}

	public String getFechaGeneracion() {
		return fechaGeneracion;
	}

	public void setFechaGeneracion(String fechaGeneracion) {
		this.fechaGeneracion = fechaGeneracion;
	}

	public String getFechaControl() {
		return fechaControl;
	}

	public void setFechaControl(String fechaControl) {
		this.fechaControl = fechaControl;
	}

	public String getUsuarioModificador() {
		return usuarioModificador;
	}

	public void setUsuarioModificador(String usuarioModificador) {
		this.usuarioModificador = usuarioModificador;
	}

	public String getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}

	public String getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(String fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FolioPulsar [idFolioPulssar=");
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
		builder.append("]");
		return builder.toString();
	}

}
