package boletin_9;

public class MainHogwarts {

	public static void main (String[] args) {
		
		EstudianteHogwarts harry = new EstudianteHogwarts();
		
		harry.setNombre("Harry");
		harry.setCasa("Griffindor");
		harry.setCurso(1);
		harry.setPuntosCasa(0);
		harry.setPocionesHechas(3);
		harry.setDominioVarita(0.1);
		
		harry.mostrarPerfilEstudiante();
		
		harry.ganarPuntos(10);
		
		harry.hacerPocion();
		
		harry.practicarConVarita();
		
	}
}
