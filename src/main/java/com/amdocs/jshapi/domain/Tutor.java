package com.amdocs.jshapi.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tutor")
public class Tutor {

	public Tutor ()
	{
		
	}
	
	public Tutor (Set<TutorCurso> tutoresCurso)
	{
		this.tutoresCurso =  tutoresCurso;
	}
	
	private Long id;	
	private String comentarios;
	private String calificacion;
	private String especialidad;
	private boolean habilitado;
	private Aliado aliado;
	private Direccion direccion;
	private Contacto contacto;
	private Set<TutorCurso> tutoresCurso;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "idtutor")
	public Long getId ()
	{
		return this.id;
	}
	
	public void setId(Long id)
	{
		this.id = id;
	}
	
	@Column(name="comentarios")
	public String  getComentarios()
	{
		return this.comentarios;
	}
	
	public void setComentarios(String comentarios)
	{
		this.comentarios=comentarios;
	}
	
	@Column(name="calificacion")
	public String getCalificacion ()
	{
		return calificacion;
	}
	
	public void setCalificacion(String calificacion)
	{
		this.calificacion = calificacion;
	}
	
	
	@ManyToOne
	@JoinColumn(name="idaliado", nullable=false)
	public Aliado getAliado()
	{
		return aliado;
	}
	
	public void setAliado (Aliado aliado)
	{
		this.aliado = aliado;
	}
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="iddireccion", name="iddireccion")
	public Direccion getDireccion()
	{
		return direccion;
	}
	
	public void setDireccion(Direccion direccion)
	{
		this.direccion = direccion;
	}
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(referencedColumnName="idcontacto", name="idcontacto")
	public Contacto getContacto()
	{
		return contacto;
	}
	
	public void setContacto(Contacto contacto)
	{
		this.contacto = contacto;
	}
	
	@Column(name="especialidad")
	public String getEspecialidad()
	{
		return especialidad;
	}
	
	public void setEspecialidad(String especialidad)
	{
		this.especialidad = especialidad;
	}
	
	@Column(name = "habilitado")
	public boolean isHabilitado() {
		return habilitado;
	}
	
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	@OneToMany (mappedBy ="tutor",
			cascade = CascadeType.ALL)
	public Set<TutorCurso> getTutorcurso ()
	{
		return this.tutoresCurso;
	}
	
	public void setTutorcurso (Set<TutorCurso> tutorescurso)
	{
		this.tutoresCurso = tutorescurso;
	}
}
