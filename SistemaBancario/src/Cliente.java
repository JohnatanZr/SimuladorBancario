
public class Cliente {
	private CuentaAhorros cuentaAhorros;
	private CuentaCorriente cuentaCorriente;
	private CDT cdt;

	public Cliente() {
		this.cuentaAhorros = new CuentaAhorros();
		this.cuentaCorriente = new CuentaCorriente();
		this.cdt = new CDT();
	}

	public CuentaAhorros getCuentaAhorros() {
		return cuentaAhorros;
	}

	public void setCuentaAhorros(CuentaAhorros cuentaAhorros) {
		this.cuentaAhorros = cuentaAhorros;
	}

	public CuentaCorriente getCuentaCorriente() {
		return cuentaCorriente;
	}

	public void setCuentaCorriente(CuentaCorriente cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

	public CDT getCdt() {
		return cdt;
	}

	public void setCdt(CDT cdt) {
		this.cdt = cdt;
	}

}
