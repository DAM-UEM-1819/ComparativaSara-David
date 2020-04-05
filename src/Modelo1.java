import java.util.Arrays;

public class Modelo1 {
	public String suma1(String num) {
		return "Sin hacer";
	}

	public int comprobarCP(String cp) {
		int opcion = 0;
		int contadorError = 0;
		int contador = 0;
		if (cp.length() == 5) {
			char[] array = cp.toCharArray();
			for (int i = 0; i < array.length; i++) {
				int caracter = (int) array[i];
				if (caracter < 48 || caracter > 57) {
					contadorError++;
				}
			}
		} else {
			contador++;
		}
		if (contadorError == 0 && contador == 0) {
			opcion = 1;
		} else if (contadorError == 0 && contador >= 0) {
			opcion = 2;
		} else {
			opcion = 3;
		}
		return opcion;
	}

	public String mayusculas(String palabra) {
		char[] array = palabra.toCharArray();
		String caracter = "";
		String concatenar = "";
		for (int i = 0; i < array.length; i++) {
			char c = array[i];
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				caracter = Character.toString(Character.toUpperCase(c));
			} else {
				caracter = Character.toString(Character.toLowerCase(c));
			}
			concatenar += caracter;
		}

		return concatenar;

	}

	public String orden(String[] nums) {
		return "";
	}

}
