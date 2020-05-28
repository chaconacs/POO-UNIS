package atividade_3;

import javax.swing.JOptionPane;

/**
  * @author André Chacon da Silveira
  */

public class CalcImc {

	public static void main(String[] args) {
		double peso = 0, altura = 0;
		try {
			String entrada1 = JOptionPane.showInputDialog("Seu Peso em (Kg): \nExemplo: 74.50 (utilize ponto)");
			if (entrada1 != null) {
				peso = Double.parseDouble(entrada1);
				String entrada2 = JOptionPane.showInputDialog("Sua altura em (cm): \nExemplo: 175");
				if (entrada2 != null) {
					altura = Double.parseDouble(entrada2);
					calculaImc(peso, altura/100);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro no programa! \nErro: " + e, "Erro", 0);
		}
	}

	public static void calculaImc(double peso, double altura) {
		double imc = peso / (altura * altura);
		apresentaResultado(imc);
	}

	public static void apresentaResultado(double valor) {
		double imc = valor;
		if (imc < 17.00) {
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]" + "\nSituação: Muito abaixo do peso!", "Resultado", 1);
		} else if (imc >= 17.00 && imc <= 18.49) {
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]" + "\nSituação: Abaixo do peso!", "Resultado", 1);
		} else if (imc >= 18.50 && imc <= 24.99) {
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"	+ "\nSituação: Peso normal!", "Resultado", 1);
		} else if (imc >= 25.00 && imc <= 29.99) {
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"	+ "\nSituação: Acima do peso!", "Resultado", 1);
		} else if (imc >= 30.00 && imc <= 34.99) {
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"	+ "\nSituação: Obesidade I!", "Resultado", 1);
		} else if (imc >= 35.00 && imc <= 39.99) {
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"	+ "\nSituação: Obesidade II (severa)!", "Resultado", 1);
		} else if (imc >= 40.00) {
			JOptionPane.showMessageDialog(null, "IMC: [" + String.format("%.2f", imc) + "]"	+ "\nSituação: Obesidade III (mórbida)!", "Resultado", 1);
		} else {
			JOptionPane.showMessageDialog(null, "Valores informados inválidos!", "Erro", 0);
		}
	}
}
