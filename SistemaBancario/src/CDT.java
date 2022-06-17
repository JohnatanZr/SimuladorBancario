import javax.swing.JOptionPane;

public class CDT {
	private double saldo;
	private double interes;

	public CDT() {
		this.saldo = 0;
		this.interes = 0;
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
	
	public double Abrir() {
		this.saldo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el deposito inicial"));
		this.interes = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el interes del CDT"));
		JOptionPane.showMessageDialog(null, "CDT abierto");
		return saldo;
	}
	
	public void Cerrar(CuentaCorriente corriente) {
		if(this.saldo > 0) {
			corriente.setSaldo(corriente.getSaldo() + this.saldo);
			this.saldo = 0;
		}else {
			JOptionPane.showMessageDialog(null, "No hay deposito");
		}
	}

	public void Intereses() {
		this.saldo = this.saldo * interes;
	}
}
