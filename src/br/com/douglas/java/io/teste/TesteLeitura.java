package br.com.douglas.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		//fluxo de entrada com um arquivo
		
		//file input stream
		FileInputStream fis = new FileInputStream("Lorem.txt");
		
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		System.out.println(linha);
		br.close();
		
	}

}
