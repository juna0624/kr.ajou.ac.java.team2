package kr.ac.ajou.java.team2.interfac;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class PartBquesPanel_3 extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PartBquesPanel_3() {
		
		JLabel lblNewLabel = new JLabel("Question.23");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 20));
		
		JLabel lblNewLabel_1 = new JLabel("There are seven characters, at least one of which must be included to indicate a floating point literal.  What are they?");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(44)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_1)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(116, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addGap(98)
					.addComponent(lblNewLabel_1)
					.addGap(52)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(164, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}