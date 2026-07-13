package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddBreadTypeScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;
	private JTextField txtFldName;
	private JTextField textField;
	private JTextField txtDietaryTags;
	private JTextField txtFldEstPrpTime;

	public AddBreadTypeScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lbl = new JLabel("Add New Bread Type");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lbl.setBounds(380, 80, 320, 48);
		add(lbl);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(240, 200, 320, 32);
		add(lblNewLabel_1_1);
		
		txtFldName = new JTextField();
		txtFldName.setText((String) null);
		txtFldName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldName.setColumns(10);
		txtFldName.setBounds(240, 240, 400, 32);
		add(txtFldName);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Price");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1_1.setBounds(680, 200, 160, 32);
		add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setText((String) null);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(680, 240, 160, 32);
		add(textField);
		
		JLabel lblNewLabel = new JLabel("Dietary tags");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(240, 288, 320, 32);
		add(lblNewLabel);
		
		txtDietaryTags = new JTextField();
		txtDietaryTags.setText((String) null);
		txtDietaryTags.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtDietaryTags.setColumns(10);
		txtDietaryTags.setBounds(240, 328, 600, 32);
		add(txtDietaryTags);
		
		JLabel lblEstimatedPrepationTime = new JLabel("Estimated Prepation Time");
		lblEstimatedPrepationTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEstimatedPrepationTime.setBounds(240, 376, 320, 32);
		add(lblEstimatedPrepationTime);
		
		txtFldEstPrpTime = new JTextField();
		txtFldEstPrpTime.setText((String) null);
		txtFldEstPrpTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtFldEstPrpTime.setColumns(10);
		txtFldEstPrpTime.setBounds(240, 416, 600, 32);
		add(txtFldEstPrpTime);
		
		JButton btnConfirm = new JButton("Confirm addition");
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirm.setBounds(240, 500, 600, 56);
		add(btnConfirm);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.showMenu();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setBounds(40, 40, 160, 48);
		add(btnNewButton);
	}
}
