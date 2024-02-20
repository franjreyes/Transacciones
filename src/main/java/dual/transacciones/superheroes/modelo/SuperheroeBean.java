package dual.transacciones.superheroes.modelo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class SuperheroeBean {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long identificador;
	
	private String nombre;
	
	private String alterego;
	
	private String imagen;
	
	@ManyToMany
	private List<SuperpoderBean> superpoderes;
	
	@ManyToMany
	private List<DebilidadBean> debilidades;
	
}
