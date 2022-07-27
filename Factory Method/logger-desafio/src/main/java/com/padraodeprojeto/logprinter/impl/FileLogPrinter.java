package com.padraodeprojeto.logprinter.impl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.padraodeprojeto.logprinter.LogPrinter;

public class FileLogPrinter implements LogPrinter {
	
	private String nomeDoArquivo;
	
	public FileLogPrinter(String nomeDoArquivo) {
		this.nomeDoArquivo = nomeDoArquivo;
	}

	public void print(String message) {
	    FileWriter fw;
		try {
			
			Path resourceDirectory = Paths.get("src","main","resources");
			
			fw = new FileWriter(resourceDirectory.toFile().getAbsolutePath() + "/" + this.getNomeDoArquivo(), true);
			BufferedWriter bw = new BufferedWriter(fw);
		    bw.write(message);
		    bw.newLine();
		    bw.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	public String getNomeDoArquivo() {
		return nomeDoArquivo;
	}

}
