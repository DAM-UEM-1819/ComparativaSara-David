import java.util.ArrayList;

public class Modelo2 {
	private Alumno miAlumno;

	public Modelo2() {
		miAlumno = new Alumno();
	}

	public String nuevaAsignatura(String nombre, String nota) {
		return miAlumno.nueva(nombre, nota);
	}

	public String media() {
		return miAlumno.media();
	}

	public String nota(String nombre) {
		return miAlumno.nota(nombre);
	}
}

class Alumno {

	public ArrayList<Asignatura> listaAsignaturas;

	public Alumno() {
		listaAsignaturas = new ArrayList();
	}

	public String nueva(String nombre, String nota) {
		int notaInt = Integer.parseInt(nota);
		Asignatura asignatura = new Asignatura(nombre, notaInt);
		listaAsignaturas.add(asignatura);
		int numeroAsignaturas = listaAsignaturas.size();
		String StringNumeroAsignaturas = Integer.toString(numeroAsignaturas);
		return StringNumeroAsignaturas;
	}

	public String media() {
		int notaMedia = 0;
		int contador = 0;
		for (Asignatura asignatura : listaAsignaturas) {
			notaMedia += asignatura.getNota();
		}
		String notaFinalString = Integer.toString(notaMedia / listaAsignaturas.size());
		return notaFinalString;
	}

	public String nota(String nombre) {
		int notaAsignatura = 0;
		int contador = 0;
		String respuesta = "";
		for (Asignatura asignatura : listaAsignaturas) {
			if (asignatura.getNombre().equals(nombre)) {
				notaAsignatura += asignatura.getNota();
			} else {
				contador++;
			}
		}
		if (contador == 0) {
			respuesta = "No existe";
		} else {
			respuesta = Integer.toString(notaAsignatura);
		}
		return respuesta;
	}
}

class Asignatura {
	private String nombre;
	private int nota;

	public Asignatura(String nombre, int nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getNota() {
		return nota;
	}
}
