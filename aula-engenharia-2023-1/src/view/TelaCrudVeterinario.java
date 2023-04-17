package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCrudVeterinario extends JInternalFrame {
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtEspecialidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudVeterinario frame = new TelaCrudVeterinario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCrudVeterinario() {
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblTitulo = new JLabel("Veterin\u00E1rio");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitulo.setBounds(10, 11, 414, 14);
		getContentPane().add(lblTitulo);
		
		JPanel painelCampos = new JPanel();
		painelCampos.setBorder(new TitledBorder(null, "Dados do Veterin\u00E1rio", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		painelCampos.setBounds(10, 36, 299, 194);
		getContentPane().add(painelCampos);
		painelCampos.setLayout(null);
		
		JLabel lblId = new JLabel("Id : ");
		lblId.setBounds(10, 26, 46, 14);
		painelCampos.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(92, 23, 197, 20);
		painelCampos.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome : ");
		lblNome.setBounds(10, 60, 46, 14);
		painelCampos.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(92, 57, 197, 20);
		painelCampos.add(txtNome);
		txtNome.setColumns(10);
		
		txtEspecialidade = new JTextField();
		txtEspecialidade.setColumns(10);
		txtEspecialidade.setBounds(92, 95, 197, 20);
		painelCampos.add(txtEspecialidade);
		
		JLabel lblEspecialidade = new JLabel("Especialidade : ");
		lblEspecialidade.setBounds(10, 98, 90, 14);
		painelCampos.add(lblEspecialidade);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(200, 126, 89, 23);
		painelCampos.add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(102, 126, 89, 23);
		painelCampos.add(btnCancelar);
		
		JPanel panel = new JPanel();
		panel.setBounds(319, 36, 105, 194);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.setBounds(10, 13, 89, 23);
		panel.add(btnInserir);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.setBounds(10, 49, 89, 23);
		panel.add(btnAlterar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(10, 85, 89, 23);
		panel.add(btnExcluir);
		
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBounds(10, 121, 89, 23);
		panel.add(btnConsultar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				dispose();
			}
		});
		btnFechar.setBounds(10, 157, 89, 23);
		panel.add(btnFechar);

	}
}
