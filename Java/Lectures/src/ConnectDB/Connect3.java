package ConnectDB;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;

public class Connect3 extends JFrame implements ActionListener {
	JLabel lb1, lb2;
	JTextField txt1, txt2;
	JTextArea txt;
	JButton sub, res, ex;
	JPanel pn, pn1, pn2, pn3, pn4;

	public void GUI() {

		lb1 = new JLabel("Input Information");
		lb2 = new JLabel("Input SQL");

		txt1 = new JTextField("jdbc:odbc:Data");
		txt2 = new JTextField("SELECT * FROM TABLE1");
		txt = new JTextArea();

		sub = new JButton("Submit");
		res = new JButton("Reset");
		ex = new JButton("Exit");

		sub.addActionListener(this);
		res.addActionListener(this);
		ex.addActionListener(this);

		pn = new JPanel(new GridLayout(4, 1));
		pn1 = new JPanel(new FlowLayout());
		pn2 = new JPanel(new FlowLayout());
		pn3 = new JPanel(new FlowLayout());
		pn4 = new JPanel(new GridLayout(1, 3));

		pn1.add(lb1);
		pn1.add(txt1);
		pn2.add(lb2);
		pn2.add(txt2);
		pn3.add(txt);
		pn4.add(sub);
		pn4.add(res);
		pn4.add(ex);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
		pn.add(pn4);
		add(pn);
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		show();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == sub) {
			String url = txt1.getText().toString();
			String sql = txt2.getText().toString();
			String result = "";
			if (url != null && sql != null) {
				try {
					//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					Connection conn = DriverManager.getConnection(url);
					Statement sttm = conn.createStatement();
					ResultSet rs = sttm.executeQuery(sql);
					while (rs.next()) {
						int id = rs.getInt("ID");
						String n = rs.getString("Name");
						String ad = rs.getString("Address");
						int tt = rs.getInt("Total");
						result += "ID = " + Integer.toString(id) + "\n" + " Name =  " + n + "\n" + " Address = " + ad
								+ "\n" + " Total = " + Integer.toString(tt) + "\n";
					}
					txt.setText(result);
					conn.close();
				} catch (SQLException er) {
					System.out.println(er);
				}
			}
		}
		if (e.getSource() == res) {
			txt1.setText("");
			txt2.setText("");
			txt.setText("");
		}
		if (e.getSource() == ex)
			System.exit(0);
	}

	public Connect3(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Connect3("Kết nối CSDL");

	}
}
