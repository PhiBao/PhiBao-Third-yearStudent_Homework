package Example_Layout;

import java.awt.*;
import javax.swing.*;

public class MenuExample extends JFrame {

	MenuExample(String title) {

		super(title);
		setBounds(300, 200, 200, 200);
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		Menu f = new Menu("File");
		f.add(new MenuItem("New"));
		f.add(new MenuItem("Open"));
		f.add(new MenuItem("Exit"));
		mb.add(f);
		Menu edit = new Menu("Edit");
		edit.add(new MenuItem("Copy"));
		edit.add(new MenuItem("Cut"));
		edit.add(new MenuItem("Paste"));
		Menu sub = new Menu("Option");
		sub.add(new MenuItem("First"));
		sub.add(new MenuItem("Second"));
		sub.add(new MenuItem("Third"));
		edit.add(sub);
		edit.add(new CheckboxMenuItem("Protected"));
		mb.add(edit);
		show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuExample f1 = new MenuExample("Menu Example");
		
	}

}
