package edu.curso;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GravacaoEmArquivo {

	public static void main(String[] args) {
		File f = new File("C:/Curso/nome.txt");
		System.out.printf("Abrindo arquivo %s para grava��o\n", f.getName());
		System.out.printf("Arquivo Existe: %b\n", f.exists());
		System.out.printf("Pode ler: %b\n", f.canRead());
		System.out.printf("Arquivo: %b\n", f.isFile());
		System.out.printf("Diretorio: %b\n", f.isDirectory());
		try {
			FileWriter fw = new FileWriter( f, true );
			fw.write("Linha 1\n");
			fw.write("Linha 2\n");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
