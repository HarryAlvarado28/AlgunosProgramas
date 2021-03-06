import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.*;

public class Prog02Calculadora {

	private JLabel label1, label2, label3;
	private JComboBox jcomboBox;
	private JFrame jframe;
	private JButton btnRealizar;
	private JTextField valor1, valor2, camporesultado, operacion;;

	public static void main(String[] args) {
		new Prog02Calculadora();
	}

	public Prog02Calculadora() {

		operacion = new JTextField(1);
		operacion.setEditable(false);
		valor1 = new JTextField(8);
		valor2 = new JTextField(8);
		camporesultado = new JTextField(8);
		camporesultado.setEditable(false);
		btnRealizar = new JButton("Realizar Operación");
		jcomboBox = new JComboBox();
		jcomboBox.addItem("SUMA");
		jcomboBox.addItem("RESTA");
		jcomboBox.addItem("MULTIPLICACION");
		jcomboBox.addItem("DIVISION");
		jcomboBox.addItem("LIMPIAR");
		label1 = new JLabel("=");
		label2 = new JLabel("Tipo de operación a realizar");
		label3 = new JLabel("Escriba el operador y seleccione el operando");

		jcomboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (jcomboBox.getSelectedItem() == "SUMA") {
					operacion.setText("+");
				} else {
					if (jcomboBox.getSelectedItem() == "RESTA") {
						operacion.setText("-");
					} else {
						if (jcomboBox.getSelectedItem() == "MULTIPLICACION") {
							operacion.setText("*");
						} else {
							if (jcomboBox.getSelectedItem() == "DIVISION") {
								operacion.setText("/");
							} else if (jcomboBox.getSelectedItem() == "LIMPIAR") {
								valor1.setText("");
								valor2.setText("");
								camporesultado.setText("");
								operacion.setText("");
							}
						}
					}
				}
			}
		});

		btnRealizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1, num2, resu;
				String resultado;
				if (jcomboBox.getSelectedItem() == "SUMA") {
					if (valor1.getText().equals("") || valor2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, " Datos de Campos incompletos ", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						num1 = Double.parseDouble(valor1.getText());
						num2 = Double.parseDouble(valor2.getText());
						resu = num1 + num2;
						resultado = String.valueOf(resu);
						camporesultado.setText(resultado);
					}
				}
				if (jcomboBox.getSelectedItem() == "RESTA") {
					if (valor1.getText().equals("") || valor2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, " Datos de Campos incompletos ", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						num1 = Double.parseDouble(valor1.getText());
						num2 = Double.parseDouble(valor2.getText());
						resu = num1 - num2;
						resultado = String.valueOf(resu);
						camporesultado.setText(resultado);
					}
				}
				if (jcomboBox.getSelectedItem() == "MULTIPLICACION") {
					if (valor1.getText().equals("") || valor2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, " Datos de Campos incompletos ", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						num1 = Double.parseDouble(valor1.getText());
						num2 = Double.parseDouble(valor2.getText());
						resu = num1 * num2;
						resultado = String.valueOf(resu);
						camporesultado.setText(resultado);
					}
				}
				if (jcomboBox.getSelectedItem() == "DIVISION") {
					if (valor1.getText().equals("") || valor2.getText().equals("")) {
						JOptionPane.showMessageDialog(null, " Datos de Campos incompletos ", "Error",
								JOptionPane.ERROR_MESSAGE);
					}

					else {
						num1 = Double.parseDouble(valor1.getText());
						num2 = Double.parseDouble(valor2.getText());
						try {
							resu = num1 / num2;
							resultado = String.valueOf(resu);
							if (resultado.equals("Infinity")) {
								JOptionPane.showMessageDialog(null, "División entre cero NO ESTA PERMITIDA!", "Error",
										JOptionPane.ERROR_MESSAGE);
							} else {
								camporesultado.setText(resultado);
							}
						} catch (ArithmeticException ex) {
							JOptionPane.showMessageDialog(null, "División entre cero NO ESTA PERMITIDA!", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					}
				}
			}
		});
		jframe = new JFrame();
		jframe.getContentPane().setLayout(new FlowLayout());
		jframe.getContentPane().add(label2);
		jframe.getContentPane().add(jcomboBox);
		jframe.getContentPane().add(label3);
		jframe.getContentPane().add(valor1);
		jframe.getContentPane().add(operacion);
		jframe.getContentPane().add(valor2);
		jframe.getContentPane().add(label1);
		jframe.getContentPane().add(camporesultado);
		jframe.getContentPane().add(btnRealizar);
		jframe.pack();
		jframe.setSize(630, 200);
		jframe.setLocationRelativeTo(null);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
