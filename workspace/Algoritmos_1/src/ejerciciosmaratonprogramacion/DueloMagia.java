package ejerciciosmaratonprogramacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Ejercicio A "Duelo de magia" - Maratón de programación 11 CCC
 * 
 * @author Lux Ferre
 *
 */
public class DueloMagia {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		DecimalFormatSymbols symbols = new DecimalFormatSymbols();
		symbols.setDecimalSeparator(',');

		DecimalFormat decimalFormat = new DecimalFormat("0.0", symbols);

		int cont = 0;

		String line = reader.readLine();
		int cases = Integer.parseInt(line);

		for (int i = 0; i < cases; i++) {

			line = reader.readLine();
			double length = Double.parseDouble(line);

			String[] vels = reader.readLine().split(" ");

			double velHarry = Double.parseDouble(vels[0]);
			double velElqueNo = Double.parseDouble(vels[1]);

			// tiempo = distancia / vel
			// distancia = time * velocity

			double time = length / (velHarry + velElqueNo);
			double distance = velHarry * time;

			cont++;
			writer.write("Duelo #" + cont + ": " + decimalFormat.format(distance) + "\n");

		}

		writer.close();
		reader.close();

	}

}
