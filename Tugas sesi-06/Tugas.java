import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class Tugas
{
    public static JComboBox cmbHobi = new JComboBox();
    private static final List<String> listHobi = new ArrayList<String>();
	private static JList listRecord = new JList();
    private static final List<Record> daftarRecord = new ArrayList<Record>();

	public static void isiList()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel(daftarRecord.toArray());
        listRecord.setModel(model);
    }

    public static void tambahIsiList(Record data)
    {
        daftarRecord.add(data);
        isiList();
    }

    public static void isiCombo()
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel(listHobi.toArray());
        cmbHobi.setModel(model);
    }

    public static void daftarHobi(String data)
    {
        listHobi.add(data);
        isiCombo();
    }

    public static void main(String[] xx)
    {
		Record m = new Record();
		m.setNim("NIM");
		m.setNama("Nama");
		m.setHobi("Hobi");
		tambahIsiList(m);

        
		daftarHobi("Sing");
        daftarHobi("Shopping");
        daftarHobi("Swimming");
        daftarHobi("Writter");
        daftarHobi("Watch");
        daftarHobi("Reading");



        JLabel lbNim = new JLabel("Nim");
        JLabel lbNama = new JLabel("Nama");
        JLabel lbHobi = new JLabel("Hobi");
		
        final JTextField tfNim = new JTextField(15);
        final JTextField tfNama = new JTextField(15);
		
        JButton btnSave = new JButton("Save");
        JButton btnReset = new JButton("Reset");

        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(new JLabel("Input Mahasiswa"));

        JPanel panel2 = new JPanel(new FlowLayout());
        JPanel panel3 = new JPanel(new FlowLayout());
        JPanel panel4 = new JPanel(new FlowLayout());
        JPanel panel5 = new JPanel(new FlowLayout());
        JPanel panel6 = new JPanel(new FlowLayout());
        JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel8 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JPanel panel9 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel panel10 = new JPanel(new GridLayout(5,2));
        JPanel panel11 = new JPanel(new BorderLayout());

        JPanel panel14 = new JPanel(new FlowLayout());
		panel14.add(listRecord);

		JPanel panel12 = new JPanel(new FlowLayout());
        panel12.add(new JLabel(""));

		JPanel panel15 = new JPanel(new GridLayout(2,1));

        JPanel panel13 = new JPanel(new GridLayout(1,2));

        panel2.add(lbNim);
        panel3.add(tfNim);
		
        panel4.add(lbNama);
        panel5.add(tfNama);
		
        panel6.add(lbHobi);
        panel7.add(cmbHobi);
		
        panel8.add(btnSave);
        panel9.add(btnReset);

        panel10.add(panel2);
        panel10.add(panel3);
        panel10.add(panel4);
        panel10.add(panel5);
        panel10.add(panel6);
        panel10.add(panel7);
        panel10.add(panel8);
        panel10.add(panel9);

        panel11.add(panel1, BorderLayout.NORTH);
        panel11.add(panel10, BorderLayout.CENTER);

		panel15.add(panel12);
		panel15.add(panel14);

        panel13.add(panel11);
        panel13.add(panel15);

        JFrame fr = new JFrame("Combo dan List");
		fr.getContentPane().add(panel13);
		fr.setSize(800,200);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		class action implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				String nim = tfNim.getText();
				String nama = tfNama.getText();
				String hobi = (String) cmbHobi.getSelectedItem();

				Record x =new Record();
				x.setNim(nim);
				x.setNama(nama);
				x.setHobi(hobi);
				tambahIsiList(x);

				tfNama.setText("");
				tfNim.setText("");
				tfNim.requestFocus();
				System.out.println(nim + nama + hobi + "\n");
			}
		}

		class reset implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				tfNama.setText("");
				tfNim.setText("");
				tfNim.requestFocus();
				tfNama.requestFocus();
			}
		}

		btnSave.addActionListener(new action());
		btnReset.addActionListener(new reset());
    }
}