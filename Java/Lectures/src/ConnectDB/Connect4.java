package ConnectDB;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Connect4 extends JFrame implements ActionListener {
	JLabel lb1, lb2;
	JTextField txt1, txt2;
	DefaultTableModel dtm;
	JTable tb;
	JButton sub, res, ex;
	JPanel pn, pn1, pn2, pn3;

	public void GUI() {

		lb1 = new JLabel("Input Information");
		lb2 = new JLabel("Input SQL");

		txt1 = new JTextField("jdbc:mysql://127.0.0.1:3306/DATA");
		txt2 = new JTextField("SELECT * FROM TABLE1");

		dtm = new DefaultTableModel();
		dtm.addColumn("Id");
		dtm.addColumn("Name");
		dtm.addColumn("Addresss");
		dtm.addColumn("Total");
		
		tb = new JTable(dtm);
		JScrollPane sc = new JScrollPane(tb, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

		sub = new JButton("Submit");
		res = new JButton("Reset");
		ex = new JButton("Exit");

		sub.addActionListener(this);
		res.addActionListener(this);
		ex.addActionListener(this);

		pn = new JPanel(new GridLayout(4, 1));
		pn1 = new JPanel(new GridLayout(2, 2));
		pn2 = new JPanel(new FlowLayout());
		pn3 = new JPanel(new GridLayout(1, 3));

		pn1.add(lb1);
		pn1.add(txt1);
		pn1.add(lb2);
		pn1.add(txt2);
		pn2.add(sc);
		pn3.add(sub);
		pn3.add(res);
		pn3.add(ex);
		pn.add(pn1);
		pn.add(pn2);
		pn.add(pn3);
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
			if (url != null && sql != null) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection conn = DriverManager.getConnection(url, "root", "");
					Statement sttm = conn.createStatement();
					ResultSet rs = sttm.executeQuery(sql);
					ResultSetMetaData rsmd = rs.getMetaData();
					int numCol = rsmd.getColumnCount();
					while (rs.next()) {
						Vector<Object> vec = new Vector<Object>();
						vec.add(rs.getObject(1));
						vec.add(rs.getObject(2));
						vec.add(rs.getObject(3));
						vec.add(rs.getObject(4));
						dtm.addRow(vec);
					}
					rs.close();
					sttm.close();
				} catch (Exception err) {
					System.out.println("Error: " + err);
				}
			}
		}
		if (e.getSource() == res) {
			txt1.setText("");
			txt2.setText("");
			dtm.removeTableModelListener(tb);
		}
		if (e.getSource() == ex)
			System.exit(0);
	}

	public Connect4(String st) {
		super(st);
		GUI();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Connect4("Kết nối CSDL");

	}
}
