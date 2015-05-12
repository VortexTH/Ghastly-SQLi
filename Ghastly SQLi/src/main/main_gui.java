package main;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JTabbedPane;

public class main_gui {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_gui window = new main_gui();
					window.frame.setVisible(true);
					
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					window.frame.setBounds(0,0,screenSize.width, screenSize.height);	
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setBounds(0,0,screenSize.width, screenSize.height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 1884, 998);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane paneBrowser = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Browser", null, paneBrowser, null);
		
		JTabbedPane paneAttack = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Attack", null, paneAttack, null);
		
		JTabbedPane paneTools = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Tools", null, paneTools, null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
	}
}
