package boletin_11;

public class Director extends Gerente {

	private String regionResponsable;
	
	public Director(String nombre, int id, String departamento, String regionResponsable) {
		super(nombre, id, departamento);
		this.regionResponsable = regionResponsable;
	}
	
}
