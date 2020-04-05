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
		InputStream lectura = null;
		String usr = "";
		try {
			File fichero = new File("src/Recuperacion/Config.ini");
			if (fichero.exists()) {
				lectura = new FileInputStream(fichero);
				propiedades.load(lectura);
				usr = propiedades.getProperty("usuario");
			} else {
				System.err.println("Fichero no encontrado");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (lectura != null) {
				try {
					lectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return usr;
	}


	public String getPwd() {
		Properties propiedades = new Properties();
		InputStream lectura = null;
		String pwd = "";
		try {
			File fichero = new File("src/Recuperacion/Config.ini");
			if (fichero.exists()) {
				lectura = new FileInputStream(fichero);
				propiedades.load(lectura);
				pwd = propiedades.getProperty("password");
			} else {
				System.err.println("Fichero no encontrado");
			}

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (lectura != null) {
				try {
					lectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return pwd;
	}

	public String getUrl() {
		Properties propiedades = new Properties();
		InputStream lectura = null;
		String url = "";
		try {
			File fichero = new File("src/Recuperacion/Config.ini");
			if (fichero.exists()) {
				lectura = new FileInputStream(fichero);
				propiedades.load(lectura);
				url = propiedades.getProperty("url");
			} else {
				System.err.println("Fichero no encontrado");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (lectura != null) {
				try {
					lectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return url;
	}

	public String getNotes() {
		Properties propiedades = new Properties();
		InputStream lectura = null;
		String notes = "";
		try {
			File fichero = new File("src/Recuperacion/Config.ini");
			if (fichero.exists()) {
				lectura = new FileInputStream(fichero);
				propiedades.load(lectura);
				notes = propiedades.getProperty("notas");
			} else {
				System.err.println("Fichero no encontrado");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (lectura != null) {
				try {
					lectura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return notes;
	}

	public String setData(String usr, String pwd, String url, String notes) {
		Properties propiedades = new Properties();
		OutputStream escritura = null;
		try {
			File fichero = new File("src/Recuperacion/Config.ini");
			if (fichero.exists()) {
				escritura = new FileOutputStream(fichero);
				propiedades.setProperty("usuario", usr);
				propiedades.setProperty("password", pwd);
				propiedades.setProperty("url", url);
				propiedades.setProperty("notas", notes);
				propiedades.store(escritura, "Datos guardados");
			} else {
				System.err.println("Fichero no encontrado");
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (escritura != null) {
				try {
					escritura.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return "Hecho";
	}
}
