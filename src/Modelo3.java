import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Modelo3 {

	public String getUsr() {
		Properties propiedades = new Properties();
		InputStream entrada = null;
		String usuario = "";
		try {
			File miFichero = new File("src/Recuperacion/Config.ini");
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				propiedades.load(entrada);
				usuario = propiedades.getProperty("usuario");

			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return usuario;
	}

	public String getPwd() {
		Properties propiedades = new Properties();
		InputStream entrada = null;
		String contrasena = "";
		try {
			File miFichero = new File("src/Recuperacion/Config.ini");
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				propiedades.load(entrada);
				contrasena = propiedades.getProperty("contrasena");

			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return contrasena;
	}

	public String getUrl() {
		Properties propiedades = new Properties();
		InputStream entrada = null;
		String URL = "";
		try {
			File miFichero = new File("src/Recuperacion/Config.ini");
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				propiedades.load(entrada);
				URL = propiedades.getProperty("URL");

			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return URL;
	}

	public String getNotes() {
		Properties propiedades = new Properties();
		InputStream entrada = null;
		String notas = "";
		try {
			File miFichero = new File("src/Recuperacion/Config.ini");
			if (miFichero.exists()) {
				entrada = new FileInputStream(miFichero);
				propiedades.load(entrada);
				notas = propiedades.getProperty("notas");

			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return notas;
	}

	public String setData(String usr, String pwd, String url, String notes) {
		Properties propiedades = new Properties();
		OutputStream salida = null;
		try {
			File miFichero = new File("src/Recuperacion/Config.ini");
			if (miFichero.exists()) {
				salida = new FileOutputStream(miFichero);
				propiedades.setProperty("usuario", usr);
				propiedades.setProperty("contrasena", pwd);
				propiedades.setProperty("URL", url);
				propiedades.setProperty("notas", notes);
				propiedades.store(salida, "Guardado en fichero");
			} else
				System.err.println("Fichero no encontrado");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (salida != null) {
				try {
					salida.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "Hecho";
	}
}
