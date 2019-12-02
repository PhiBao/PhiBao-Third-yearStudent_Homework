package Example_Layout;

import java.awt.*;
import java.awt.event.*;

public class ExampleEvent extends Frame implements ActionListener {

	Label lb1, lb2, lb3, lb;
	TextField txta, txtb, txtkq;
	Button result, reset, getOff;
	Panel pn, pn1, pn2, pn3;

	public void GUI() {

		lb = new Label("GIẢI PHƯƠNG TRÌNH BẬC NHẤT");
		lb1 = new Label("Nhập a: ");
		lb2 = new Label("Nhập b: ");
		lb3 = new Label(" Kết quả: ");

		txta = new TextField();
		txtb = new TextField();
		txtkq = new TextField();

		result = new Button("Result");
		reset = new Button("Reset");
		getOff = new Button("Exit");

		result.addActionListener(this);
		reset.addActionListener(this);
		getOff.addActionListener(this);

		pn = new Panel(new GridLayout(3, 1));
		pn1 = new Panel(new FlowLayout());
		pn2 = new Panel(new GridLayout(3, 2));
		pn3 = new Panel(new GridLayout(1, 3));

		pn1.add(lb);

		pn2.add(lb1);
		pn2.add(txta);
		pn2.add(lb2);
		pn2.add(txtb);
		pn2.add(lb3);
		pn2.add(txtkq);

		pn3.add(result);
		pn3.add(reset);
		pn3.add(getOff);

		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		add(pn);
		setSize(400, 300);
		show();
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == result) {
			int a = Integer.parseInt(txta.getText());
			int b = Integer.parseInt(txta.getText());
			if (a != 0)
				txtkq.setText(Float.toString((float) (-b / a)));
			else if (b == 0)
				txtkq.setText("Phương trình vô số nghiệm");
			else
				txtkq.setText("Phương trình vô nghiệm");
		}
		if (e.getSource() == reset) {
			txta.setText("");
			txtb.setText("");
			txtkq.setText("");
		}
		if (e.getSource() == getOff)
			System.exit(0);
	}

	public ExampleEvent(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExampleEvent("Giải phương trình bậc 1");

	}

}
