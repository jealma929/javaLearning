//package sooper.demo.tkrun;

import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class PruebaView {

	protected JFrame frmprueba;
	
		public PruebaView () {
			initialize();
		}
		
		private void initialize () {

			frmprueba = new JFrame ();
			frmprueba.getContentPane().setLayout(new MigLayout("", "[grow][grow][grow]", "[grow][grow][grow]"));
			frmprueba.setBounds(400,200,500,300);
			frmprueba.setVisible(true);
			
			JButton btnprueba = new JButton ();			
			frmprueba.getContentPane().add(btnprueba, "cell 1 1,grow");		
			btnprueba.addActionListener(new ActionListener() {         
			public void actionPerformed(ActionEvent e) {
					PruebaView prueba = new PruebaView();
			}
			
		});		
		}	
}
		