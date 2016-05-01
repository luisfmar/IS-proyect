package factoryDesingPattern;

import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.EtchedBorder;

import utils.Utils;

public abstract class Panel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public abstract void initComponets();
	
	public abstract void initGUI();
	
	protected void generateTextPane(JTextPane component, String data, double dimension) {
		component.setBackground(null);
		component.setContentType("text/html");
		component.setText(data);
		component.setEditable(false);
		component.setFont(new Font(data, 10, 28));
		component.setVisible(true);
		component.setPreferredSize(Utils.adjustDimension(1, dimension, this.getPreferredSize()));
	}

	protected void generateTextField(JTextField component, String data, double dimension) {
		component.setVisible(true);
		component.setText(data);
		component.setPreferredSize(Utils.adjustDimension(1, dimension, this.getPreferredSize()));
	}
	
}
