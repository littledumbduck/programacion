package boletin_11;

public class CuentaBancaria {
	
	private int saldo;
	
	public CuentaBancaria(int saldo) {
		this.saldo = saldo;
	}

	// Getter
	public int getSaldo() {
		return saldo;
	}

	// Setter
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	// Methods
	public void depositar(int value) {
	this.saldo = this.saldo + value;
	System.out.println("El saldo ahora es de " + this.saldo + "€.");
	}
	
	public void retirar(int value) {
		this.saldo = this.saldo - value;
		System.out.println("El saldo ahora es de " + this.saldo + "€.");
	}
	
}
