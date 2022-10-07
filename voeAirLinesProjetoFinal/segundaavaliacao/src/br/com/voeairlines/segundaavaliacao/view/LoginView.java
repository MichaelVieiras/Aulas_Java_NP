package br.com.voeairlines.segundaavaliacao.view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginView extends JFrame implements ActionListener {

	JButton btnVerificar; // botão
	JButton btnLimpar;
	JTextField txtUsuario; // caixa de texto
	JPasswordField pwfSenha; // caixa de texto para senhas
	JLabel lblUsuario;
	JLabel lblSenha;

	public LoginView() {
		setTitle("Sistema VoeAirlines"); // atribuindo o titulo do JFrame
		setSize(500, 100);
		setResizable(false); // bloquear o redimencionamento da tela
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(3, 2)); // gerenciador de Layout - awt

		// Objeto --> é uma instância de uma classe
		btnVerificar = new JButton("Verificar");
		btnLimpar = new JButton("Limpar");
		txtUsuario = new JTextField(20);
		pwfSenha = new JPasswordField(20);
		lblUsuario = new JLabel("Usuario");
		lblSenha = new JLabel("Senha");

		// adicionar os componentes dentro de JFrame (container)

		getContentPane().add(lblUsuario);
		getContentPane().add(txtUsuario);
		getContentPane().add(lblSenha);
		getContentPane().add(pwfSenha);

		getContentPane().add(btnVerificar);
		getContentPane().add(btnLimpar);

		// Verificar acesso
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String usuario = "michael";
				String senha = "123456";
				String strSenha = new String(pwfSenha.getPassword()).trim();

				if (txtUsuario.getText().equals(usuario) && strSenha.equals(senha)) {
					JOptionPane.showMessageDialog(null, "Usuário Logado");
				} else {
					JOptionPane.showMessageDialog(null, "Usuário invalido!!!", "Alerta", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		
		// Limpar campos
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUsuario.setText("");
				pwfSenha.setText("");
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {	
		
	}
}
