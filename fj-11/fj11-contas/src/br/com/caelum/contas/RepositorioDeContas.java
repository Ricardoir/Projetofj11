package br.com.caelum.contas;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

import br.com.caelum.contas.modelo.Conta;

public class RepositorioDeContas {

public void salva (List<Conta> contas) {
	PrintStream stream;
	try {
		stream = new PrintStream("contas.txt");
		for (Conta conta : contas) {
			stream.println(conta.getTipo()+ "," + conta.getNumero() + ","
					+ conta.getAgencia() + "," + conta.getTitular() + ","
					+ conta.getSaldo());
		}
		stream.close();
	} catch (FileNotFoundException e) {
		throw new RuntimeException(e);
	}
}

}
