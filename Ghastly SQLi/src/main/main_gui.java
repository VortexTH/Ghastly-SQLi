package main;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class main_gui {
	
	public JEditorPane editorPaneBrowser = new JEditorPane();
	private JFrame frame;
	JTextField txtBrowserURL;

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
		
		JPanel panelBrowser = new JPanel();
		tabbedPane.addTab("Browser", null, panelBrowser, null);
		panelBrowser.setLayout(null);
		
		txtBrowserURL = new JTextField();
		txtBrowserURL.setText("");
		txtBrowserURL.setFont(new Font("Dialog", Font.PLAIN, 16));
		txtBrowserURL.setColumns(10);
		txtBrowserURL.setBounds(10, 10, 1519, 30);
		panelBrowser.add(txtBrowserURL);
		
		JButton buttonBrowserSearch = new JButton("Search");
		buttonBrowserSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				loadPage(txtBrowserURL.getText());			
				
			}
		});
		buttonBrowserSearch.setBounds(1539, 10, 200, 30);
		panelBrowser.add(buttonBrowserSearch);
		
		
		editorPaneBrowser.setBounds(10, 51, 1859, 908);
		panelBrowser.add(editorPaneBrowser);
		editorPaneBrowser.setEditable(false);
		editorPaneBrowser.addHyperlinkListener(
				new HyperlinkListener(){
					@Override
					public void hyperlinkUpdate(HyperlinkEvent event) {
						if(event.getEventType() == HyperlinkEvent.EventType.ACTIVATED){
							loadPage(event.getURL().toString());
						}
					}					
				}			
			);
		
		JPanel panelAttack = new JPanel();
		tabbedPane.addTab("Attack", null, panelAttack, null);
		
		JPanel panelTools = new JPanel();
		tabbedPane.addTab("Tools", null, panelTools, null);
		panelTools.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
	}
	
	
   private void loadPage(String URLinput){
		
		try{
			
			//MOST GODDAMN IMPORTANT CLASS!!!!
			editorPaneBrowser.setPage(URLinput);			
			//txtBrowserURL.setText(URLinput);
			
		}
		
		 catch(Exception e){
			 JOptionPane.showMessageDialog(null, "This Page could not be loaded!");
		 }
		
		
	}
	
	
	
	
}
