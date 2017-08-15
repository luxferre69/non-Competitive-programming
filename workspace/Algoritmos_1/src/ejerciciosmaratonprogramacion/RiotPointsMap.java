package ejerciciosmaratonprogramacion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class RiotPointsMap {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("riotpoints.in"));
		Map<String, String> listParams = new HashMap<String, String>();
		
		// 1era linea
		String line = reader.readLine();
		int cases = Integer.parseInt(line);

		while (cases > 0) {

			// 2da linea
			String[] split = reader.readLine().split(" ");

			for (int i = 1; i < split.length; i++) {
				listParams.put(split[i-1], split[i]);
			}

			cases--;

			if (cases == 0) {
				line = reader.readLine();
			}
		}
		
		String[] letters = line.split("");
		
		for (int i = 0; i < letters.length; i++) {
			
		}

		for (Map.Entry<String, String> entry : listParams.entrySet()) {
			//System.out.println(String.format("llave: %s, valor: %s", entry.getKey(), entry.getValue()));
		}
		
		reader.close();
	}

}
