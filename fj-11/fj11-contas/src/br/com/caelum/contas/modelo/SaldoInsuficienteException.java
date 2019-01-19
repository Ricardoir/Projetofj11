package br.com.caelum.contas.modelo;

public class SaldoInsuficienteException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1252140700974377643L;

	public SaldoInsuficienteException(double valor) {
		super("Saldo insuficiente para sacar o valor de " + valor);
	}

}


