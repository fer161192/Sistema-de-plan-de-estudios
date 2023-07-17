package Plan_de_Estudios;

public class Materia {
	private String codigo_materia;
	private String nombre;
	private int creditos;
	public Materia(String codigo, String nombre, int creditos) {
		this.codigo_materia = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
	}
	public String getCodigo_materia() {
		return codigo_materia;
	}
	public void setCodigo_materia(String codigo_materia) {
		this.codigo_materia = codigo_materia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setcréditos(int cantidad_créditos) {
		this.creditos = cantidad_créditos;
	}
}
