package utiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LecturaTeclado {

	
	public static String lecturaString(String pregunta) {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		String respuesta = "";
		System.out.print(pregunta);
		try {
			respuesta = teclado.readLine();
		} catch (IOException e) {
		}
		return respuesta;
	}
	public static Integer lecturaEntero(String pregunta) {
		String respuesta = lecturaString(pregunta);
		return Integer.parseInt( respuesta );
	}
	
	public static Double lecturaDecimal(String pregunta) {
		String respuesta = lecturaString(pregunta);
		return Double.parseDouble( respuesta );
	}

}