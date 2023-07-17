package Plan_de_Estudios;
import java.util.ArrayList;
public class Carrera {
	private String nombre;
	private ArrayList<Materia> materias_obligatorias;
	private ArrayList<Materia> materias_optativas;
	private int creditos_minimos;
	private String codigo_carrera;
	
	public Carrera(String nombre_ingresado, ArrayList<Materia> materias_obligatorias_ingresadas, ArrayList<Materia> materias_optativas_ingresadas,int creditos_ingresados,String codigo_ingresado){
		this.nombre = nombre_ingresado;
		this.materias_obligatorias = materias_obligatorias_ingresadas;
		this.materias_optativas = materias_optativas_ingresadas;
		this.creditos_minimos = creditos_ingresados;
		this.codigo_carrera = codigo_ingresado;
	}
	public String getCodigo() {
		return this.codigo_carrera;
	}
	public String getNombre() {
		return this.nombre;
	}
	public int getCreditosMinimos(){
		return this.creditos_minimos;
	}
	
	public ArrayList<Materia> getMateriasObligatorias() {
		return this.materias_obligatorias;
	}
	
	public ArrayList<Materia> getMateriasOptativas() {
		return this.materias_optativas;
	}
	
	private boolean creditosSuficientes(ArrayList<Materia> materiasAprobadas) {
		boolean creditosSuficientes = false;

        int creditosTotales = 0;

        for (int i=0; i<materiasAprobadas.size(); i++){
            creditosTotales = creditosTotales + materiasAprobadas.get(i).getCreditos();
        }

        if (creditosTotales >= this.creditos_minimos){
            creditosSuficientes = true;
        }
        return creditosSuficientes;
	}
	
	private boolean todasObligatoriasAProvadas(ArrayList<Materia> materiasAprobadas) {
		boolean todasAprobadas = false;
		if (materiasAprobadas.size() >= this.materias_obligatorias.size()) {
			int contador_materias_aprobadas = 0;
			for (int i = 0; i<materiasAprobadas.size();i++) {
				for (int j = 0; j<this.materias_obligatorias.size();j++) {
					if (this.materias_obligatorias.get(j).getNombre().equals(materiasAprobadas.get(i).getNombre())) {
						contador_materias_aprobadas ++;
						break;
					}
				}
			}
			if (contador_materias_aprobadas == this.materias_obligatorias.size())
				todasAprobadas = true;
		}
		return(todasAprobadas);
	}
	public boolean alumnoRecibido(ArrayList<Materia> materiasAprobadas) {
		return (this.todasObligatoriasAProvadas(materiasAprobadas) && this.creditosSuficientes(materiasAprobadas));
	}
}
