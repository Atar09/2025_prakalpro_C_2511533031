package pekan8_2511533031;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class OperatorAritmatikaGUI_2511533031 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533031 frame = new OperatorAritmatikaGUI_2511533031();
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
	public OperatorAritmatikaGUI_2511533031() {
		setBackground(new Color(39, 104, 152));
		setFont(new Font("Times New Roman", Font.BOLD, 12));
		setTitle("Operator Aritmatika");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 476, 359);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(180, 191, 205));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtBil1 = new JTextField();
		txtBil1.setBounds(133, 52, 69, 20);
		txtBil1.setBackground(new Color(255, 255, 255));
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(133, 11, 181, 14);
		lblNewLabel.setBackground(new Color(192, 192, 192));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Bilangan 1");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(39, 51, 108, 20);
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Bilangan 2");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(39, 82, 69, 14);
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_2);
		
		txtBil2 = new JTextField();
		txtBil2.setBounds(133, 83, 69, 20);
		txtBil2.setBackground(new Color(255, 255, 255));
		contentPane.add(txtBil2);
		txtBil2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(41, 126, 48, 14);
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(41, 179, 48, 14);
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		contentPane.add(lblNewLabel_4);
		
		txtHasil = new JTextField();
		txtHasil.setBounds(133, 177, 79, 20);
		txtHasil.setBackground(new Color(255, 255, 255));
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setBounds(143, 123, 48, 22);
		cbOperator.setBackground(new Color(255, 255, 255));
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.setBounds(225, 123, 89, 23);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 1 Harus Diisi");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan("Bilangan 2 Harus Diisi");
				} else {
					try {
						int a= Integer.valueOf(txtBil1.getText());
						int b= Integer.valueOf(txtBil2.getText());
						int c= cbOperator.getSelectedIndex();
						if (c==0) { hasil=a+b;}
		                if (c==1) { hasil=a-b;}
		                if (c==2) { hasil=a*b;}
		                if (c==3) { hasil=a/b;}
		                if (c==4) { hasil=a%b;}
		                txtHasil.setText(String.valueOf(hasil));
				
			} catch (NumberFormatException ex) {
				pesanError("Bilangan 1 dan 2 Harus Angka");
			}	
				}
			    }      
			});        
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		contentPane.add(btnNewButton);

	}
}
