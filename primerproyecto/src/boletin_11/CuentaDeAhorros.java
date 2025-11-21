package boletin_11;

public class CuentaDeAhorros extends CuentaBancaria {

	private int tasaDeInteres;
	
	public CuentaDeAhorros(int saldo, int tasaDeInteres) {
		super(saldo);
		this.tasaDeInteres = tasaDeInteres;
	}

	// Getter
	public int getTasaDeInteres() {
		return tasaDeInteres;
	}

	// Setter
	public void setTasaDeInteres(int tasaDeInteres) {
		this.tasaDeInteres = tasaDeInteres;
	}
	
	// Methods
	
		public void depositar(int value) {
			super.depositar(value);
		}
	
		public void retirar(int value) {
			int saldo = this.getSaldo();
			saldo = saldo - value - (value * (this.tasaDeInteres / 100));
			super.setSaldo(saldo);
		}
	
}
