package Example_Layout;

import java.awt.*;
import java.awt.event.*;

public class ChangeBase extends Frame implements ActionListener {

	Label lb1, lb2, lb3, lb4, lb;
	TextField txt1, txt2, txt3, txt4;
	Button ok, reset, exit;
	Panel pn, pn1, pn2, pn3, pn4, pn5, pn6;

	public void GUI() {

		lb = new Label("ĐỔI CƠ SỐ");
		lb1 = new Label("Nhập n: ");
		lb2 = new Label("Nhị phân: ");
		lb3 = new Label("Bát phân: ");
		lb4 = new Label("Thập lục phân: ");

		txt1 = new TextField(20);
		txt2 = new TextField(20);
		txt3 = new TextField(20);
		txt4 = new TextField(20);

		ok = new Button("OK");
		reset = new Button("Reset");
		exit = new Button("Exit");

		ok.addActionListener(this);
		reset.addActionListener(this);
		exit.addActionListener(this);

		pn = new Panel(new GridLayout(6, 1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new FlowLayout());
		pn3 = new Panel(new FlowLayout());
		pn4 = new Panel(new FlowLayout());
		pn5 = new Panel(new FlowLayout());
		pn6 = new Panel(new GridLayout(1, 3));

		pn1.add(lb);

		pn2.add(lb1);
		pn2.add(txt1);

		pn3.add(lb2);
		pn3.add(txt2);

		pn4.add(lb3);
		pn4.add(txt3);

		pn5.add(lb4);
		pn5.add(txt4);

		pn6.add(ok);
		pn6.add(reset);
		pn6.add(exit);

		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		pn.add(pn5);
		pn.add(pn6);
		add(pn);
		setSize(400, 300);
		show();
	}

	public long convert(int number, int base) {

		int temp, i = 1;
		long numConv = 0;

		while (number > 0) {

			temp = number % base;
			numConv += (i * temp);
			number /= base;
			i *= 10;
		}

		return numConv;
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ok) {

			int n = Integer.parseInt(txt1.getText());
			long result1 = convert(n, 2);
			txt2.setText(Long.toString(result1));
			long result2 = convert(n, 8);
			txt3.setText(Long.toString(result2));
			long result3 = convert(n, 16);
			txt4.setText(Long.toString(result3));
		}
		if (e.getSource() == reset) {
			txt1.setText("");
			txt2.setText("");
			txt3.setText("");
			txt4.setText("");
		}
		if (e.getSource() == exit)
			System.exit(0);
	}

	public ChangeBase(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChangeBase("Đổi cơ số!");

	}

}
