package Plan_de_Estudios;
import java.util.ArrayList;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Materia algo1 = new Materia("75.01","Algoritmos 1",5);
		Materia algo2 = new Materia("75.02","Algoritmos 2",5);
		Materia algo3 = new Materia("75.03","Algoritmos 3",5);
		
		Materia circuitos = new Materia("66.01","Circuitos",5);
		Materia potencia = new Materia("66.02","Potencia",5);
		Materia antenas = new Materia("66.03","Antenas",5);
		
		ArrayList<Materia> obligatoriasInformatica = new ArrayList<Materia>();
		obligatoriasInformatica.add(algo1);
		obligatoriasInformatica.add(algo2);
		obligatoriasInformatica.add(algo3);
		
		ArrayList<Materia> optativasInformatica = new ArrayList<>();
		optativasInformatica.add(circuitos);
		//Declaramos la carrera de informatica
		Carrera informatica = new Carrera("Informática",obligatoriasInformatica,optativasInformatica,16,"10");
		
		ArrayList<Materia> obligatoriasElectronica = new ArrayList<Materia>();
		
		obligatoriasElectronica.add(circuitos);
		obligatoriasElectronica.add(potencia);
		obligatoriasElectronica.add(antenas);

		ArrayList<Materia> optativasElectronica = new ArrayList<Materia>();
		optativasElectronica.add(algo1);
		//Declaramos la carrera de electronica
		Carrera electronica = new Carrera("Electrónica",obligatoriasElectronica,optativasElectronica,16,"9");
		
		Alumno juan = new Alumno("Juan","Martinez",107538);
		
		juan.agregarMateriaAprobada(algo1);
		juan.agregarMateriaAprobada(algo2);
		juan.agregarMateriaAprobada(algo3);
		if (informatica.alumnoRecibido(juan.getMateriasAprobadas()))
			System.out.println("Juan se recibio de informatico");
		else
			System.out.println("Juan no se recibio de informatico");
		juan.agregarMateriaAprobada(circuitos);
		if (informatica.alumnoRecibido(juan.getMateriasAprobadas()))
			System.out.println("Juan se recibio de informatico");
		else
			System.out.println("Juan no se recibio de informatico");
		System.out.println(juan.getEstadoCarrera(electronica));
		System.out.println("Hola");
	}
}
