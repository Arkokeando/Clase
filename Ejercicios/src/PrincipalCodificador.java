import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class PrincipalCodificador{

		public static void main(String[] args) {
			//Creamos filtro de lectura para leer lo que queremos copiar y filtro de escritura para escribir en el nuevo
			try (BufferedReader filtroLectura = new BufferedReader(new FileReader("fichero_a_cifrar.txt"));
					BufferedWriter filtroEscritura = new BufferedWriter( new FileWriter("copia.txt"));){
				String linea;
				linea=filtroLectura.readLine();
				while(linea!=null) {
					linea=Codificador.codifica(linea);
					filtroEscritura.write(linea);
					linea=filtroLectura.readLine();
					
				}
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}
