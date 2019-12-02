package Example_Layout;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemEventTest extends JFrame implements ItemListener {

	JLabel lb, lbdplay;
	CheckboxGroup check;
	Checkbox check1, check2;
	Choice choice;
	List list;
	JPanel pn, pn1, pn2, pn3;

	public void GUI() {

		lb = new JLabel("Item event test");
		lbdplay = new JLabel("The event is display here");

		check = new CheckboxGroup();
		check1 = new Checkbox("Male", check, true);
		check2 = new Checkbox("Female", check, false);
		check1.addItemListener(this);
		check2.addItemListener(this);

		choice = new Choice();
		choice.addItem("Football");
		choice.addItem("Volleyball");
		choice.addItem("Basketball");
		choice.addItemListener(this);

		list = new List(3);
		list.add("Lion");
		list.add("Tiger");
		list.add("Fox");
		list.addItemListener(this);

		pn = new JPanel(new GridLayout(3, 1));
		pn1 = new JPanel(new FlowLayout());
		pn2 = new JPanel(new FlowLayout());
		pn3 = new JPanel(new FlowLayout());

		pn1.add(lb);

		pn2.add(check1);
		pn2.add(check2);
		pn2.add(choice);
		pn2.add(list);

		pn3.add(lbdplay);

		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		setBounds(200, 500, 700, 700);
		setVisible(true);
		show();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == (check1)) {
			lbdplay.setText("You click in the checkbox");
		}
		if (e.getSource() == (check2)) {
			lbdplay.setText("You click in the checkbox");
		}

		if (e.getSource() == choice) {
			lbdplay.setText("You click in the choice");
		}

		if (e.getSource() == list) {
			lbdplay.setText("You click in the list");
		}

	}

	public ItemEventTest(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventTest("Item event test!");

	}

}