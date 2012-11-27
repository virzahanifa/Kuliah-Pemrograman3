package project.belajar.jtable;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

import javax.swing.event.*;
import javax.swing.table.*;

public class DemoTable{
	private static final JTable table = new JTable();
	private static final List<Mahasiswa> data = sampleData();
	
	public static void main(String[] xx){
		JFrame fr = new JFrame("Belajar Tabel");
		
		MahasiswaTableModel model = new MahasiswaTableModel(data);
		model.addTableModelListener(new TableDiubahListener());
		tabel.setModel(model);
		
		tabel.getSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabel.get SelectionModel().addListSelectionListener(new TabelDipilihListener());
		
		JScrollPane scrTabel = new JScrollPane(table);
		
		JTextArea txtOutput = new JTextArea(5,20);
		JScrollPane scrText = new JScrollPane(txtOutput);
		
		fr.getContentPane().add(scrText, BorderLayout.SOUTH);
		fr.getContentPane().add(scrTabel, BorderLayout.CENTER);
		
		fr.setSize(600,600);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
	
	private static class TabelDipilihListener implements ListSelectionListener{
		public void valueChanged(ListSelectionEvent e){
		
			int baris = tabel.getSelectedRow();
			system.out.println("Baris" +baris+ "dipilih");
			
			if(baris > -1) {
				Mahasiswa x = data.get(baris);
				system.out.println("NPM : " +x.getNpm());
			}
		}
	}
	
	private static class TableDiubahListener implements TableModelListener{

		public void tableChange(TableModelEvent e){
			int baris = e.getFirstRow();
			int kolom = e.getColumn();
			system.out.println("Terjadi perubahan di ");
			system.out.println("Baris" +baris);
			system.out.println("Kolom" +kolom);
			TableModel model = (TableModel)e.getSource();
			Object data = model.getValueAt(baris,kolom);
			system.out.println("Data Baru : " +data);
		}
	}
	
	private static List <Mahasiswa> sampleData(){
		List<Mahasiswa> data = new ArrayList<Mahasiswa>();
		
		Mahasiswa m1 = new Mahasiswa();
		m1.setNpm("001");
		m1.setNama("Mahasiswa 001");
		data.add(m1);
		
		Mahasiswa m2 = new Mahasiswa();
		m1.setNpm("002");
		m1.setNama("Mahasiswa 002");
		data.add(m2);
		
		Mahasiswa m3 = new Mahasiswa();
		m1.setNpm("003");
		m1.setNama("Mahasiswa 003");
		data.add(m3);
		
		
		Mahasiswa m1 = new Mahasiswa();
		m1.setNpm("004");
		m1.setNama("Mahasiswa 004");
		data.add(m4);
		
		Mahasiswa m5 = new Mahasiswa();
		m1.setNpm("005");
		m1.setNama("Mahasiswa 005");
		data.add(m5);
		
		return data;
		
	}
}