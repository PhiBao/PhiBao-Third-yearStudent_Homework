package Example_Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ActionEventTest extends JFrame implements ActionListener {

	JLabel lb;
	JButton ok;
	JTextField txt;
	JPanel pn, pn1, pn2;
	List list;

	public void GUI() {

		lb = new JLabel("The event is display here");

		ok = new JButton("OK");
		ok.addActionListener(this);

		txt = new JTextField(12);
		txt.addActionListener(this);

		list = new List(3);
		list.add("Lion");
		list.add("Tiger");
		list.add("Fox");
		list.addActionListener(this);

		pn = new JPanel(new GridLayout(2, 1));
		pn1 = new JPanel(new GridLayout(1, 3));
		pn2 = new JPanel(new FlowLayout());

		pn1.add(lb);

		pn1.add(ok);
		pn1.add(txt);
		pn1.add(list);

		pn2.add(lb);

		pn.add(pn1);
		pn.add(pn2);
		add(pn);
		setSize(400, 200);
		show();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ok) {
			lb.setText("You click in button");
		}

		if (e.getSource() == txt) {
			lb.setText("You enter in text field");
		}

		if (e.getSource() == list) {
			lb.setText("You double click in list");
		}

	}

	public ActionEventTest(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ActionEventTest("Action event test!");

	}

}