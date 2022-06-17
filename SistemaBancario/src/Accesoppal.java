import javax.swing.JOptionPane;

public class Accesoppal {
	public static void main(String args[]) {
		Cliente cliente = new Cliente();
		int opc = 0;
		do {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("\tMenú\n" + "1. Visualizar el saldo de la cuenta corriente del cliente.\n"
							+ "2. Visualizar el saldo de la cuenta de ahorros del cliente.\n"
							+ "3. Visualizar el saldo del CDT del cliente.\n"
							+ "4. Visualizar el saldo total que tiene el cliente en los productos del banco.\n"
							+ "5. Invertir un monto de dinero en un CDT.\n" + "6. Cerrar la inversión en CDT.\n"
							+ "7. Consignar un monto de dinero en la cuenta corriente del cliente.\n"
							+ "8. Retirar un monto de dinero en la cuenta corriente del cliente.\n"
							+ "9. Consignar un monto de dinero en la cuenta de ahorros del cliente.\n"
							+ "10. Retirar un monto de dinero en la cuenta de ahorros del cliente.\n"
							+ "11. Avanzar en un mes la simulación.\n" + "0. Salir\n"));
			switch (opc) {
			case 1:
				JOptionPane.showMessageDialog(null, "$" + cliente.getCuentaCorriente().getSaldo());
				break;
			case 2:
				JOptionPane.showMessageDialog(null, "$" + cliente.getCuentaAhorros().getSaldo());
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "$" + cliente.getCdt().getSaldo());
				break;
			case 4:
				JOptionPane.showMessageDialog(null, "Saldo totales: $" + (cliente.getCuentaCorriente().getSaldo()
						+ cliente.getCuentaAhorros().getSaldo() + cliente.getCdt().getSaldo()));
				break;
			case 5:
				if (cliente.getCdt().getSaldo() > 0) {
					JOptionPane.showMessageDialog(null, "Hay abierto un CDT");
				} else {
					cliente.getCdt().Abrir();
				}
				break;
			case 6:
				cliente.getCdt().Cerrar(cliente.getCuentaCorriente());
				break;
			case 7:
				cliente.getCuentaCorriente().Consignar();
				break;
			case 8:
				cliente.getCuentaCorriente().Retirar();
				break;
			case 9:
				cliente.getCuentaAhorros().Consignar();
				break;
			case 10:
				cliente.getCuentaAhorros().Retirar();
				break;
			case 11:
				cliente.getCdt().Intereses();
				cliente.getCuentaAhorros().Intereses();
				break;
			default:
				break;
			}
		} while (opc != 0);
	}
}
