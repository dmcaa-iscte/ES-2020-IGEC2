package inicioMetricas;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUI {
	JPanel panel;
	
	public GUI() {
		JFrame frame= new JFrame("Code Quality Assessor");
		panel=new JPanel();
		frame.add(panel);
		
		addFrameContent();
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(300,100));
		
		frame.pack();
		frame.setVisible(true);
		
	}

	private void addFrameContent() {
		
		JTextField folder=new JTextField("Selecione a Pasta");
	//	folder.setBounds(400, 400, 100, 100);
		panel.add(folder);
		
		JButton search=new JButton("Search");
		search.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			//cria um seletor de arquivos
				JFileChooser fc=new JFileChooser();
				fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int returnVal= fc.showOpenDialog(folder);
				
			//Guarda o ficheiro selecionado e copia para a textfield
				File f= fc.getSelectedFile();
				folder.setText(f.getPath());;
			}
			
		});
		panel.add(search);
		
		JButton extract=new JButton("Extract");
		extract.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//preciso desenvolver a extração do ficheiro dado
				
			}
			
		});
		panel.add(extract);
	}

	public static void main(String[] args) {
		new GUI();

	}

}
