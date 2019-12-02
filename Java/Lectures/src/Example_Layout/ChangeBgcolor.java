package Example_Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChangeBgcolor extends JFrame implements ActionListener {

	JLabel lb;
	JButton red, green, blue, getOff;
	JPanel pn, pn1, pn2, pn3;

	public void GUI() {

		lb = new JLabel("ĐỔI MÀU NỀN");

		red = new JButton("Red");
		green = new JButton("Green");
		blue = new JButton("Blue");
		getOff = new JButton("Exit");

		red.addActionListener(this);
		green.addActionListener(this);
		blue.addActionListener(this);
		getOff.addActionListener(this);

		pn = new JPanel(new GridLayout(3, 1));
		pn1 = new JPanel(new FlowLayout());
		pn2 = new JPanel(new GridLayout(1, 3));
		pn3 = new JPanel(new FlowLayout());

		pn1.add(lb);

		pn2.add(red);
		pn2.add(green);
		pn2.add(blue);

		pn3.add(getOff);

		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		setSize(400, 300);
		show(true);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == red) {
			pn1.setBackground(Color.red);
			pn3.setBackground(Color.red);
		}

		if (e.getSource() == green) {
			pn1.setBackground(Color.green);
			pn3.setBackground(Color.green);
		}

		if (e.getSource() == blue) {
			pn1.setBackground(Color.blue);
			pn3.setBackground(Color.blue);
		}

		if (e.getSource() == getOff)
			System.exit(0);
	}

	public ChangeBgcolor(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChangeBgcolor("Đổi màu nền!");

	}

}