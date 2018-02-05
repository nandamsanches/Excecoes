
public class Conta {
	private double saldo;
	private String titular;
	private int agencia;
	private int numero;
	
	public void saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
		}
		else {
			throw new RuntimeException ("Saldo Insuficiente");
		}

	}
	
	public void deposita (double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException();
			
		}else {
			this.saldo += valor;
		}
		
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
 
	
	
	
}
