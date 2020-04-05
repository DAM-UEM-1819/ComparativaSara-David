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
		Asignatura a;
		if(!nombre.isEmpty() && !nota.isEmpty()) {
			a = new Asignatura(nombre, Integer.parseInt(nota));
			listaAsignaturas.add(a);
		}		
		String size= Integer.toString(listaAsignaturas.size());		
		return size;
	}

	public String media() {
		int media=0;
		for (int i = 0; i < listaAsignaturas.size(); i++) {
			media+=listaAsignaturas.get(i).getNota();
		}
		int tamano=listaAsignaturas.size();
		int mediaInt=media/tamano;
		String mediaFinal= Integer.toString(mediaInt);
		return mediaFinal;
	}

	public String nota(String nombre) {
		int nota = 0;
		boolean no = false;
		String respuesta;
		for (int i = 0; i < listaAsignaturas.size(); i++) {
			String nombreLista = listaAsignaturas.get(i).getNombre();
			if (nombreLista.equals(nombre)) {
				nota = listaAsignaturas.get(i).getNota();
			} else {
				no = true;
			}
		}
		String notaString = Integer.toString(nota);
		if (no == false) {
			respuesta = "No existe";
		} else {
			respuesta = notaString;
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
