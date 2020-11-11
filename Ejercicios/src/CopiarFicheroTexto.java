import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarFicheroTexto {
	public static void main(String[] args) {
			
		File ficheroOriginal=null,ficheroCopia=null;
		
		copiarFichero(ficheroOriginal, ficheroCopia);
			
	}
	public static void copiarFichero(File ficheroOriginal, File ficheroCopia) {
		ficheroOriginal = new File("original.txt");
		ficheroCopia = new File("copia.txt");
			
		if(ficheroOriginal.exists() && ficheroOriginal.isFile()) {
			try(FileInputStream flujoLectura = new FileInputStream("original.txt");
					FileOutputStream flujoEscritura = new FileOutputStream("copia.txt");){
					
				byte[] buffer =new byte[1024];
				int cantidad;
				
				while ((cantidad=flujoLectura.read(buffer))>0) {
					flujoEscritura.write(buffer,0,cantidad);
				}
				flujoEscritura.close();
				flujoLectura.close();
				System.out.println("Copiado sin errores.");
			}catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}else {
			System.out.println("No existe el fichero.");
		}
		}

	}

