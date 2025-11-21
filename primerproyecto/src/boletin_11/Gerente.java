package boletin_11;

public class Gerente extends Empleado {

	private String departamento;
	
	public Gerente(String nombre, int id, String departamento) {
		super(nombre, id);
		this.departamento = departamento;
	}
	
}
