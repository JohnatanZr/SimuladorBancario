import javax.swing.JOptionPane;

public class CuentaAhorros {
	private double saldo;
	private double interes;

	public CuentaAhorros() {
		this.saldo = 0;
		this.interes = 0.06;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public void Consignar() {
		double deposito = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a depositar"));
		this.saldo += deposito;
		JOptionPane.showMessageDialog(null, "Deposito exitoso");
	}

	public void Retirar() {
		double retiro = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de dinero a retirar"));
		if (this.saldo >= retiro) {
			this.saldo -= retiro;
			JOptionPane.showMessageDialog(null, "Retiro exitoso");
		}
	}
	public void Intereses() {
		this.saldo = this.saldo * interes;
	}
}
