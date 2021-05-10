import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Prog01Calculadora extends JFrame implements ActionListener {

	private JButton btnSuma, btnResta, btnMulti, btndiv, btnlimpiar, btnsalir;
	private JTextField valor1, valor2, camporesultado;
	JLabel label1, label2;

	public void ControlesCalculadora() {
		Container contenedor = getContentPane();
		contenedor.setLayout(new FlowLayout());
		label1 = new JLabel("Numero 1");
		contenedor.add(label1);
		valor1 = new JTextField(8);
		contenedor.add(valor1);
		label2 = new JLabel("Numero 2");
		contenedor.add(label2);
		valor2 = new JTextField(8);
		contenedor.add(valor2);
		btnSuma = new JButton("+");
		contenedor.add(btnSuma);
		btnSuma.addActionListener(this);
		btnResta = new JButton("-");
		contenedor.add(btnResta);
		btnResta.addActionListener(this);
		btnMulti = new JButton("x");
		contenedor.add(btnMulti);
		btnMulti.addActionListener(this);
		btndiv = new JButton("/");
		btndiv.addActionListener(this);
		contenedor.add(btndiv);
		camporesultado = new JTextField(8);
		contenedor.add(camporesultado);
		btnlimpiar = new JButton("Limpiar");
		contenedor.add(btnlimpiar);
		btnlimpiar.addActionListener(this);
		btnsalir = new JButton("Salir");
		btnsalir.setBackground(Color.red);
		contenedor.add(btnsalir);
		btnsalir.addActionListener(this);
	}

	public Prog01Calculadora(){
  
      super("Calculadora");
      ControlesCalculadora();
      setSize(430,200);
      setLocationRelativeTo(null); 
      setVisible(true);
 }

	public void actionPerformed(ActionEvent e) {
		double num1, num2, resu;
		String resultado;
		if (e.getSource() == btnSuma) {
			if (valor1.getText().equals("") || valor2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Datos de Campos incompletos", "Error",
						JOptionPane.WARNING_MESSAGE);
			} else {
				num1 = Double.parseDouble(valor1.getText());
				num2 = Double.parseDouble(valor2.getText());
				resu = num1 + num2;
				resultado = String.valueOf(resu);
				camporesultado.setText(resultado);
			}
		}
		if (e.getSource() == btnResta) {
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
		if (e.getSource() == btnMulti) {
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
		if (e.getSource() == btndiv) {
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
					camporesultado.setText(resultado);
				} catch (ArithmeticException ex) {
					JOptionPane.showMessageDialog(null, "División entre cero NO ESTA PERMITIDA!", "Error",
							JOptionPane.ERROR_MESSAGE);
				}

			}
		}

		if (e.getSource() == btnlimpiar) {
			valor1.setText("");
			valor2.setText("");
			camporesultado.setText("");
		}
		if (e.getSource() == btnsalir) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		Prog01Calculadora calc = new Prog01Calculadora();
		calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
