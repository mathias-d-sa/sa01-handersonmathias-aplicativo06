package br.com.senaitagua.sa1.app6;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.ValorTotal;

public class Principal {

	public static void main(String[] args) {
		
		ValorTotal cbo = new ValorTotal();
		
		double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o unit�rio do avi�o: "));
		
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de avi�es: "));
		
		JOptionPane.showMessageDialog(null, "O valor total da quantidade informada � de: " + "R$" + cbo.somaValorTotal(valor1, qtde));
		
	}

}
