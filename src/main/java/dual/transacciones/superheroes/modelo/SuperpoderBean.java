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
public class SuperpoderBean {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long identificador;
	
	private String poder;
	
	@ManyToMany(mappedBy = "superpoderes")
	private List<SuperheroeBean> superheroes;
}
