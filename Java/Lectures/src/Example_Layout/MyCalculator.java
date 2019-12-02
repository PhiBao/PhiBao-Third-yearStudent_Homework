package Example_Layout;

import java.awt.*;
import java.awt.event.*;

public class MyCalculator extends Frame implements ActionListener {

	Label lb1, lb2, lb3, lb;
	TextField txt1, txt2, txtkq;
	Button reset, getOff, add, sub, mul, div, mod;
	Panel pn, pn1, pn2, pn3, pn4;

	public void GUI() {

		lb = new Label("MINH HOẠ PHÉP TOÁN");
		lb1 = new Label("Nhập số 1: ");
		lb2 = new Label("Nhập số 2: ");
		lb3 = new Label("Kết quả: ");

		txt1 = new TextField();
		txt2 = new TextField();
		txtkq = new TextField();

		add = new Button("+");
		sub = new Button("-");
		mul = new Button("*");
		div = new Button("/");
		mod = new Button("%");
		reset = new Button("Reset");
		getOff = new Button("Exit");

		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		reset.addActionListener(this);
		getOff.addActionListener(this);

		pn = new Panel(new GridLayout(4, 1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(3, 2));
		pn3 = new Panel(new GridLayout(1, 5));
		pn4 = new Panel(new GridLayout(1, 2));

		pn1.add(lb);

		pn2.add(lb1);
		pn2.add(txt1);
		pn2.add(lb2);
		pn2.add(txt2);
		pn2.add(lb3);
		pn2.add(txtkq);

		pn3.add(add);
		pn3.add(sub);
		pn3.add(mul);
		pn3.add(div);
		pn3.add(mod);

		pn4.add(reset);
		pn4.add(getOff);

		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		add(pn);
		setSize(500, 500);
		show();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == add) {
			int so1 = Integer.parseInt(txt1.getText());
			int so2 = Integer.parseInt(txt2.getText());
			txtkq.setText(Integer.toString(so1 + so2));
		}
		if (e.getSource() == sub) {
			int so1 = Integer.parseInt(txt1.getText());
			int so2 = Integer.parseInt(txt2.getText());
			txtkq.setText(Integer.toString(so1 - so2));
		}
		if (e.getSource() == mul) {
			int so1 = Integer.parseInt(txt1.getText());
			int so2 = Integer.parseInt(txt2.getText());
			txtkq.setText(Double.toString((double) so1 * so2));
		}
		if (e.getSource() == div) {
			int so1 = Integer.parseInt(txt1.getText());
			int so2 = Integer.parseInt(txt2.getText());
			if (so2 == 0)
				txtkq.setText("Số bị chia bằng 0!");
			else
				txtkq.setText(Float.toString((float) (so1 / so2)));
		}
		if (e.getSource() == mod) {
			int so1 = Integer.parseInt(txt1.getText());
			int so2 = Integer.parseInt(txt2.getText());
			if (so2 == 0)
				txtkq.setText("Số bị chia bằng 0!");
			else
				txtkq.setText(Integer.toString(so1 % so2));
		}
		if (e.getSource() == reset) {
			txt1.setText("");
			txt2.setText("");
			txtkq.setText("");
		}
		if (e.getSource() == getOff)
			System.exit(0);
	}

	public MyCalculator(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyCalculator("Minh họa phép toán!");

	}

}
