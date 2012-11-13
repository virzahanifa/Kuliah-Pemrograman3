package com.artivisi.project;

import javax.swing.*;
import java.awt.FlowLayout;

public class DemoFlowLayout{
	public static void main(String[]xx){
		//beberapa button untuk demo
		JButton btn1 = new JButton("Tombol 1");
		JButton btn2 = new JButton("#2");
		JButton btn3 = new JButton("Tombol Tiga");
		JButton btn4 = new JButton("Tombol 4 : panjang");
		JButton btn5 = new JButton("btn 5");
		JButton btn6 = new JButton("No. 6");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
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
		fr.setSize(800,200);
		
		//posisi ditengah
		fr.setLocationRelativeTo(null);
		
		//tampilkan
		fr.setVisible(true);
	}
}