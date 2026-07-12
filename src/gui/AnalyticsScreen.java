package gui;

import javax.swing.JPanel;

import controller.MainFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AnalyticsScreen extends JPanel {

	private static final long serialVersionUID = 1L;

	private MainFrame main;

	public AnalyticsScreen(MainFrame main) {
		this.main = main;
		setLayout(null);
		
		JLabel lblAnalytics = new JLabel("Analytics");
		lblAnalytics.setHorizontalAlignment(SwingConstants.CENTER);
		lblAnalytics.setFont(new Font("Tahoma", Font.PLAIN, 32));
		lblAnalytics.setBounds(380, 80, 320, 48);
		add(lblAnalytics);
	}

}
