package Plan_de_Estudios;
import java.util.ArrayList;
public class Alumno {
	private String nombre;
	private String apellido;
	private int padron;
	ArrayList<Carrera> vector_carreras_inscriptas;
	ArrayList<Materia> vector_materias_aprobadas;

	public Alumno(String nombre_ingresado, String apellido_ingresado, int padron_ingresado){
		this.nombre = nombre_ingresado;
		this.apellido = apellido_ingresado;
		this.padron = padron_ingresado;
		this.vector_carreras_inscriptas = new ArrayList<Carrera>();
		this.vector_materias_aprobadas = new ArrayList<Materia>();
	}
	
	public void inscribirEnCarrera(Carrera carrera) {
		boolean yaInscripto = false;
		for (int i = 0; i<vector_carreras_inscriptas.size(); i++) {
			if (this.vector_carreras_inscriptas.get(i).getCodigo().equals(carrera.getCodigo())) {
				yaInscripto = true;
				break;
			}
		}
		if (!yaInscripto) {
			this.vector_carreras_inscriptas.add(carrera);
		}
	}
	
	public void agregarMateriaAprobada(Materia materia) {
		boolean yaAprobada = false;
		for (int i = 0; i<vector_materias_aprobadas.size(); i++) {
			if (this.vector_materias_aprobadas.get(i).getCodigo_materia().equals(materia.getCodigo_materia())) {
				yaAprobada = true;
				break;
			}
		}
		if (!yaAprobada) {
			this.vector_materias_aprobadas.add(materia);
		}
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public int getPadron() {
		return this.padron;
	}
	public ArrayList<Materia> getMateriasAprobadas(){
		return this.vector_materias_aprobadas;
	}
	
	public String getEstadoCarrera(Carrera info) {
		int creditos = 0;
		System.out.println("Su padron es: "+ this.padron);
		for (int i = 0; i < vector_materias_aprobadas.size(); i++) {
			creditos += vector_materias_aprobadas.get(i).getCreditos();
		}
		return("Tenes %d creditos".formatted(creditos));
	}
}