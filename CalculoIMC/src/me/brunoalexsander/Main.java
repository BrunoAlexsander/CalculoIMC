package me.brunoalexsander;

import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura:"));
		Double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso:"));
		Double imc = peso / (altura * altura);
		JOptionPane.showMessageDialog(null, "Seu IMC é: " + imc);
		
	}

}
