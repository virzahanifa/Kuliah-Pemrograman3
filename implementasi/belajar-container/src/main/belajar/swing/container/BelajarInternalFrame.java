//package belajar.swing.container;

import javax.swing.JFrame;
import javax.swing.JDekstopPane;
import javax.swing.JInternalPane;

public class BelajarDialog {
	public static void main(String[] xx){
		JFrame fr=new JFrame();
		fr.setTitle("Belajar Frame");
		fr.setSize(800,600);
		
		//frame di tengah layar
		fr.setLocationRelativeTo(null);
		//program selesai ktika tombol exit ditekan
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JDesktopPane jdp = new JDesktopPane();
		
		JInternalFrame ifr = new JInternalFrame();
		ifr.setTitle("Ini internal frame");
		ifr.setSize(200,200);
		ifr.setClosable(true);
		
		jdp.add(ifr);
		ifr.sdetVisible(true);
		
		fr.setContentPane(jdp);
		fr.setVisible(true);
	}
}