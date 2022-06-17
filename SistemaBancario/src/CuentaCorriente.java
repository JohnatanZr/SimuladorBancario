import javax.swing.JOptionPane;

public class CuentaCorriente {
	private double saldo;

	public CuentaCorriente() {
		this.saldo = 0;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
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
}
