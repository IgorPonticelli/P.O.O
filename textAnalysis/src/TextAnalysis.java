import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;

public class TextAnalysis {
	
	public TextAnalysis(String[] files) {
		for (String fname : files ) {
			this.carregaDados(fname);
		}
	}
	
	public void listarArquivos(String palavra) {
		
	}
	
	public void listarArquivos(String[] palavras) {
	}
	
	public void listarPalavras(String fileName) {
	}
	
	public void listarPalavrasComuns(String f1, String f2) {
		
	}

	private void carregaDados(String fileName) {
		Path path1 = Paths.get(fileName);
		//System.out.println("\nArquivo: "+fileName);

		try (BufferedReader reader = Files.newBufferedReader(path1, Charset.forName("utf8"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				line = line.toLowerCase().replaceAll("[^a-zA-Záéíóúçãõà-]"," ");
				// aqui vc tem de fazer...
				System.out.println(line);

			}

		} catch (IOException e) {
			System.out.println("Erro na leitura: "+e.getMessage());
		}
	}
}

