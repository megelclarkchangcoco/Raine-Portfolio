package Portfolio;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;

public class PanelAboutme extends JPanel {
	private ImageIcon rainepic = new ImageIcon(
			new ImageIcon( "C:\\Users\\Windows 10\\eclipse-workspace\\FreeLancingJava\\src\\assets\\raine2.jpeg")
					.getImage().getScaledInstance(447, 541, Image.SCALE_DEFAULT));

	/**
	 * Create the panel.
	 */
	public PanelAboutme() {
		setBackground(new Color(192, 192, 192));
		setBounds(196, 0, 1084, 732);
		setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBounds(0, 0, 1094, 732);
		add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel aboutmelbl = new JLabel("About Me");
		aboutmelbl.setForeground(new Color(255, 128, 192));
		aboutmelbl.setFont(new Font("Arial Black", Font.ITALIC, 40));
		aboutmelbl.setBounds(114, -2, 277, 137);
		mainPanel.add(aboutmelbl);
		
		JLabel lblNewLabel_2 = new JLabel("_____________");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_2.setBounds(22, 19, 456, 116);
		mainPanel.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(rainepic);
		lblNewLabel.setBounds(22, 120, 447, 541);
		mainPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Hi, my name is Rychelle. I am currently");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.ITALIC, 15));
		lblNewLabel_1.setBounds(544, 123, 428, 44);
		mainPanel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("a student at national University of Manila,");
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(544, 144, 428, 44);
		mainPanel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("pursuing a degree in Information Technology.");
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.ITALIC, 15));
		lblNewLabel_1_1_1.setBounds(544, 165, 428, 44);
		mainPanel.add(lblNewLabel_1_1_1);
		
		JLabel aboutmelbl_1 = new JLabel("Getting to know me");
		aboutmelbl_1.setForeground(new Color(255, 128, 192));
		aboutmelbl_1.setFont(new Font("Arial Black", Font.ITALIC, 40));
		aboutmelbl_1.setBounds(534, 22, 604, 137);
		mainPanel.add(aboutmelbl_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("_____________");
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 60));
		lblNewLabel_2_1.setBounds(543, 38, 456, 116);
		mainPanel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Name :");
		lblNewLabel_3.setForeground(new Color(255, 128, 192));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3.setBounds(538, 228, 67, 35);
		mainPanel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Age :");
		lblNewLabel_3_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1.setBounds(538, 258, 111, 35);
		mainPanel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Address :");
		lblNewLabel_3_2.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_2.setBounds(538, 292, 111, 35);
		mainPanel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Gender");
		lblNewLabel_3_3.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_3.setBounds(538, 323, 111, 35);
		mainPanel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("School :");
		lblNewLabel_3_4.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_4.setBounds(534, 418, 111, 35);
		mainPanel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_4 = new JLabel("Rychelle Lorraine L. Briones");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(633, 228, 195, 30);
		mainPanel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("18 years old");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(633, 261, 195, 30);
		mainPanel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Almeda St. Tondo Manila");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_2.setBounds(633, 295, 195, 30);
		mainPanel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Female");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_3.setBounds(633, 326, 195, 30);
		mainPanel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("National University of Manila");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_4.setBounds(629, 421, 195, 30);
		mainPanel.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Birthday :");
		lblNewLabel_3_5.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_5.setBounds(538, 353, 87, 35);
		mainPanel.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Year : ");
		lblNewLabel_3_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_1_1.setBounds(538, 383, 111, 35);
		mainPanel.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_4_1 = new JLabel("June 7, 2004");
		lblNewLabel_4_4_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_4_1.setBounds(633, 353, 195, 30);
		mainPanel.add(lblNewLabel_4_4_1);
		
		JLabel lblNewLabel_4_4_2 = new JLabel("3rd term, 1st Year");
		lblNewLabel_4_4_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_4_2.setBounds(629, 395, 195, 30);
		mainPanel.add(lblNewLabel_4_4_2);
		
		JPanel educationalPanel = new JPanel();
		educationalPanel.setBackground(new Color(255, 255, 255));
		educationalPanel.setBounds(534, 459, 511, 262);
		mainPanel.add(educationalPanel);
		educationalPanel.setLayout(null);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Educational ");
		lblNewLabel_3_4_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_4_1.setBounds(10, 0, 111, 35);
		educationalPanel.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Elementary");
		lblNewLabel_3_4_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_4_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_4_1_1.setBounds(10, 43, 111, 35);
		educationalPanel.add(lblNewLabel_3_4_1_1);
		
		JLabel lblNewLabel_4_4_3 = new JLabel("Holy Heart Christian Academy");
		lblNewLabel_4_4_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_4_3.setBounds(10, 71, 195, 30);
		educationalPanel.add(lblNewLabel_4_4_3);
		
		JLabel lblNewLabel_3_4_1_1_1 = new JLabel("High School");
		lblNewLabel_3_4_1_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_4_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_4_1_1_1.setBounds(10, 112, 111, 35);
		educationalPanel.add(lblNewLabel_3_4_1_1_1);
		
		JLabel lblNewLabel_4_4_3_1 = new JLabel("Holy Heart Christian Academy");
		lblNewLabel_4_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_4_3_1.setBounds(10, 138, 195, 30);
		educationalPanel.add(lblNewLabel_4_4_3_1);
		
		JLabel lblNewLabel_3_4_1_1_1_1 = new JLabel("Senior High School");
		lblNewLabel_3_4_1_1_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_4_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_4_1_1_1_1.setBounds(10, 172, 183, 35);
		educationalPanel.add(lblNewLabel_3_4_1_1_1_1);
		
		JLabel lblNewLabel_4_4_3_1_1 = new JLabel("Ama Computer Learning College");
		lblNewLabel_4_4_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_4_3_1_1.setBounds(10, 200, 225, 30);
		educationalPanel.add(lblNewLabel_4_4_3_1_1);
		
		JLabel lblNewLabel_3_4_1_1_1_1_1 = new JLabel("College");
		lblNewLabel_3_4_1_1_1_1_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_4_1_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_4_1_1_1_1_1.setBounds(299, 43, 183, 35);
		educationalPanel.add(lblNewLabel_3_4_1_1_1_1_1);
		
		JLabel lblNewLabel_4_4_3_1_1_1 = new JLabel("National University of Manila");
		lblNewLabel_4_4_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_4_3_1_1_1.setBounds(299, 80, 225, 30);
		educationalPanel.add(lblNewLabel_4_4_3_1_1_1);
		
		JLabel lblNewLabel_3_6 = new JLabel("Hobbies :");
		lblNewLabel_3_6.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_6.setBounds(838, 228, 73, 35);
		mainPanel.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_4_5 = new JLabel("Playing Valorant");
		lblNewLabel_4_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_5.setBounds(921, 231, 151, 30);
		mainPanel.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_3_6_1 = new JLabel("Hobbies :");
		lblNewLabel_3_6_1.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_6_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_6_1.setBounds(838, 258, 73, 35);
		mainPanel.add(lblNewLabel_3_6_1);
		
		JLabel lblNewLabel_4_5_1 = new JLabel("Playing Basketball");
		lblNewLabel_4_5_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_5_1.setBounds(921, 261, 151, 30);
		mainPanel.add(lblNewLabel_4_5_1);
		
		JLabel lblNewLabel_3_6_2 = new JLabel("Hobbies :");
		lblNewLabel_3_6_2.setForeground(new Color(255, 128, 192));
		lblNewLabel_3_6_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_3_6_2.setBounds(838, 292, 73, 35);
		mainPanel.add(lblNewLabel_3_6_2);
		
		JLabel lblNewLabel_4_5_2 = new JLabel("Playing Crossfire");
		lblNewLabel_4_5_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4_5_2.setBounds(921, 295, 151, 30);
		mainPanel.add(lblNewLabel_4_5_2);

	}

}
