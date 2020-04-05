import java.util.Arrays;

public class Modelo1 {
	public String suma1(String num) {
		return "Sin hacer";
	}

	public int comprobarCP(String cp) {
		int respuesta = 0;
		boolean incorrectos = false;
		boolean longitud = false;
		if (cp.length() == 5) {
			char[] arraychars = cp.toCharArray();
			for (int i = 0; i < arraychars.length; i++) {
				int caracter = (int) arraychars[i];
				if (caracter < 48 || caracter > 57) {
					incorrectos = true;
				}
			}
		} else {
			longitud = true;
		}

		if (longitud == false && incorrectos == false) {
			respuesta = 1;
		} else if (incorrectos == false && longitud == true) {
			respuesta = 2;
		} else {
			respuesta = 3;
		}
		return respuesta;
	}

	public String mayusculas(String palabra) {
		String letra;
		String palabraFinal = "";
		char[] listaPalabra = palabra.toCharArray();
		for (int i = 0; i < listaPalabra.length; i++) {
			char c = Character.toLowerCase(listaPalabra[i]);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				char mayuscula = Character.toUpperCase(c);
				letra = Character.toString(mayuscula);
			} else {
				char minuscula = Character.toUpperCase(c);
				letra = Character.toString(Character.toLowerCase(minuscula));
			}
			palabraFinal += letra;
		}
		
		return palabraFinal;
		
	}

	public String orden(String[] nums) {
		return "";
	}

}
