package com.artivisi.project;

import javax.swing.*;
import java.awt.GridLayout;

public class DemoGridLayout{
	public static void main(String[]xx){
		//beberapa button untuk demo
		JButton btn1 = new JButton("Tombol 1");
		JButton btn2 = new JButton("#2");
		JButton btn3 = new JButton("Tombol Tiga");
		JButton btn4 = new JButton("Tombol 4 : panjang");
		JButton btn5 = new JButton("btn 5");
		JButton btn6 = new JButton("No. 6");
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3,2));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		
		//menginstankan frame
		JFrame fr = new JFrame("Belajar Layout");
		
		fr.getContentPane().add(panel);
		//ukuran frame
		fr.setSize(800,400);
		
		//posisi ditengah
		fr.setLocationRelativeT(null);
		
		//tampilkan
		fr.setVisible(true);
	}
}